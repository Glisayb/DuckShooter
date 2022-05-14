package view;

public class Lives {

    int lives ;
    String path;

    public Lives(int lives){
       this.lives = lives;
    }

    public void reduceLives() {
        this.lives --;
    }
}
