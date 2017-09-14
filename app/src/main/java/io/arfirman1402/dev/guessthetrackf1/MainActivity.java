package io.arfirman1402.dev.guessthetrackf1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

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

    private Track finalAnswer;
    private List<Button> buttons;

    private List<Question> questions;
    private int number;
    private Question question;
    private int score;
    private long timeInMillisStart;
    private long timeInMillisEnd;

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
    }

    private void setQuestion() {
        question = questions.get(number);

        for (int i = 0; i < question.getOptionCount(); i++) {
            buttons.get(i).setText(question.getOptions().get(i).getCircuit());
        }

        finalAnswer = question.getAnswer();

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
        Track userChoosedTrack = question.getOptions().get(i);
        if (userChoosedTrack.getId() == finalAnswer.getId()) {
            Toast.makeText(this, "Your answer is Right. Good One.", Toast.LENGTH_SHORT).show();
            score += 10;
        } else {
            Toast.makeText(this, "Still wrong answer. Try again.", Toast.LENGTH_SHORT).show();
        }
        if (number < questions.size() - 1) {
            number++;
            setQuestion();
        } else {
            finishQuiz();
        }
    }

    private void finishQuiz() {
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
}