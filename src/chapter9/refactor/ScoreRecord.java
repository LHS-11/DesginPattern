package chapter9.refactor;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject{

    private List<Integer> scores = new ArrayList<>();

    public void addScores(int score){
        scores.add(score);
        notifyObservers();
    }

    public List<Integer> getScores(){
        return scores;
    }
}


