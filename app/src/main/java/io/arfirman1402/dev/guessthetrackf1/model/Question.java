package io.arfirman1402.dev.guessthetrackf1.model;

import java.util.List;

/**
 * Created by alodokter-it on 14/09/17 -- Question.
 */

public class Question {
    private String id;
    private int optionCount;
    private List<Track> options;
    private Track answer;

    public Question(String id, int optionCount, List<Track> options, Track answer) {
        this.id = id;
        this.optionCount = optionCount;
        this.options = options;
        this.answer = answer;
    }

    public String getId() {
        return id;
    }

    public int getOptionCount() {
        return optionCount;
    }

    public List<Track> getOptions() {
        return options;
    }

    public Track getAnswer() {
        return answer;
    }
}
