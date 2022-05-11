package models.gnats;

public abstract class Insect {
    GnatTypes type;
    int hp;
    int points;

    public Insect(int hp, int points){
        this.hp = hp;
        this.points = points;
    }

    public void reduceHp(){
        hp--;
    }
}
