package models.gnats;

public abstract class Gnat {
    GnatTypes type;
    int hp;
    int points;

    public Gnat(){}

    public void reduceHp(){
        hp--;
    }
}
