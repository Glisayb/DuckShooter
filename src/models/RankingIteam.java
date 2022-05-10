package models;

public class RankingIteam {
    int score;
    int points;
    int time;
    String name;
    Difficulties level;

    public void calculateScore(){
        score = (points+time);
    }

}
