package view;

public class Lives {

    private int lives ;

    public Lives(int lives){
       this.lives = lives;
    }

    public void reduceLives() {
        this.lives --;
    }

    public int getLives() {
        return lives;
    }
}
