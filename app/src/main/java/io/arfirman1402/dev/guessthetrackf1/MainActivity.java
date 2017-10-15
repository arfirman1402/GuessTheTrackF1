package io.arfirman1402.dev.guessthetrackf1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.arfirman1402.dev.guessthetrackf1.model.Question;
import io.arfirman1402.dev.guessthetrackf1.model.Track;
import io.arfirman1402.dev.guessthetrackf1.util.CommonFunction;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.main_track_image)
    ImageView mainTrackImage;

    @BindView(R.id.main_timer)
    TextView mainTimer;

    @BindView(R.id.main_right_answer)
    TextView mainRightAnswer;

    @BindView(R.id.main_track_number)
    TextView mainTrackNumber;

    @BindView(R.id.main_is_right_answer)
    TextView mainIsRightAnswer;

    private Track finalAnswer;
    private List<Button> buttons;

    private List<Question> questions;
    private int number;
    private Question question;
    private int score;
    private int rightAnswer;
    private long timeInMillisStart;
    private long timeInMillisEnd;
    private Handler timerHandler;
    private Runnable timeRunnable;
    private Handler answerHandler;
    private Runnable answerRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        getQuestion();
    }

    private void getQuestion() {
        questions = CommonFunction.getQuestions();
        number = 0;
        score = 0;
        timeInMillisStart = GregorianCalendar.getInstance().getTimeInMillis();
        setQuestion();
        startTimer();
    }

    private void startTimer() {
        timerHandler = new Handler();
        timeRunnable = new Runnable() {
            @Override
            public void run() {
                timeInMillisEnd = GregorianCalendar.getInstance().getTimeInMillis();
                long timeInMilisDelta = timeInMillisEnd - timeInMillisStart;
                double timeInSecondsDelta = (double) timeInMilisDelta / (double) 1000;
                mainTimer.setText("Time : " + timeInSecondsDelta + " s");
                timerHandler.postDelayed(this, 10);
            }
        };
        timerHandler.postDelayed(timeRunnable, 10);
    }

    private void setQuestion() {
        question = questions.get(number);

        for (int i = 0; i < question.getOptionCount(); i++) {
            buttons.get(i).setText(question.getOptions().get(i).getCircuit());
        }

        finalAnswer = question.getAnswer();

        mainTrackNumber.setText("Number " + (number + 1) + " of " + questions.size());

        mainTrackImage.setImageResource(finalAnswer.getMap());
    }

    private void initView() {
        ButterKnife.bind(this);

        int[] buttonIds = new int[]{R.id.main_answer_a, R.id.main_answer_b, R.id.main_answer_c, R.id.main_answer_d};

        buttons = new ArrayList<>();

        for (int buttonId : buttonIds) {
            Button button = findViewById(buttonId);
            button.setOnClickListener(this);
            buttons.add(button);
        }

        answerHandler = new Handler();
        answerRunnable = new Runnable() {
            @Override
            public void run() {
                mainIsRightAnswer.setVisibility(View.GONE);
            }
        };
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_answer_a:
                userChoose(0);
                break;
            case R.id.main_answer_b:
                userChoose(1);
                break;
            case R.id.main_answer_c:
                userChoose(2);
                break;
            case R.id.main_answer_d:
                userChoose(3);
                break;
            default:
                break;
        }
    }

    private void userChoose(int i) {
        Track userChoiceTrack = question.getOptions().get(i);
        if (userChoiceTrack.getId() == finalAnswer.getId()) {
            rightAnswer++;
            score += 10;
            mainRightAnswer.setText("Right Answer = " + rightAnswer);
        }
        isCorrectAnswer(userChoiceTrack.getId() == finalAnswer.getId());
        if (number < questions.size() - 1) {
            number++;
            setQuestion();
        } else {
            finishQuiz();
        }
    }

    private void isCorrectAnswer(boolean correctOne) {
        answerHandler.removeCallbacks(answerRunnable);
        if (correctOne) {
            mainIsRightAnswer.setText("Correct, Vamos !!");
            mainIsRightAnswer.setTextColor(ContextCompat.getColor(this, R.color.colorDarkGreen8));
        } else {
            mainIsRightAnswer.setText("Wrong One, Bwoah!!");
            mainIsRightAnswer.setTextColor(ContextCompat.getColor(this, R.color.colorDarkRed9));
        }
        mainIsRightAnswer.setVisibility(View.VISIBLE);
        answerHandler.postDelayed(answerRunnable, 500);
    }

    @Override
    protected void onDestroy() {
        timerHandler.removeCallbacks(timeRunnable);
        answerHandler.removeCallbacks(answerRunnable);
        super.onDestroy();
    }

    private void finishQuiz() {
        stopTimer();
        timeInMillisEnd = GregorianCalendar.getInstance().getTimeInMillis();
        long timeInMilisDelta = timeInMillisEnd - timeInMillisStart;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Congrats, you finish the race. Your score = " + score + ". Your time = " + ((double) timeInMilisDelta / (double) 1000) + " s . Wanna try again ?");
        builder.setPositiveButton("Try Again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                getQuestion();
            }
        });
        builder.setNegativeButton("I Quit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.show();
    }

    private void stopTimer() {
        timerHandler.removeCallbacks(timeRunnable);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Quit");
        builder.setMessage("Times still running. Are you sure quit from this quiz race ?");
        builder.setPositiveButton("No", null);
        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.show();
    }
}