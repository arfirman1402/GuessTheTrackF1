package io.arfirman1402.dev.guessthetrackf1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.main_track_image)
    ImageView mainTrackImage;
    private Track finalAnswer;
    private List<Track> trackAnswers;
    private List<Button> buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        setQuestion();
    }

    private void setQuestion() {
        int[] buttonIds = new int[]{R.id.main_answer_a, R.id.main_answer_b, R.id.main_answer_c, R.id.main_answer_d};

        buttons = new ArrayList<>();

        for (int buttonId : buttonIds) {
            Button button = findViewById(buttonId);
            button.setOnClickListener(this);
            buttons.add(button);
        }

        List<Track> tracks = CommonFunction.getTracks();
        trackAnswers = new ArrayList<>();

        for (Button button : buttons) {
            Track track = tracks.remove((int) (Math.random() * tracks.size()));
            trackAnswers.add(track);
            button.setText(track.getCircuit());
        }

        finalAnswer = trackAnswers.get((int) (Math.random() * trackAnswers.size()));

        mainTrackImage.setImageResource(finalAnswer.getMap());
    }

    private void initView() {
        ButterKnife.bind(this);
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
        Track userChoosedTrack = trackAnswers.get(i);
        if (userChoosedTrack.getId() == finalAnswer.getId()) {
            Toast.makeText(this, "Your answer is Right. Good One.", Toast.LENGTH_SHORT).show();
            setQuestion();
        } else {
            Toast.makeText(this, "Still wrong answer. Try again.", Toast.LENGTH_SHORT).show();
        }
    }
}
