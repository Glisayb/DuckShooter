package models;

public abstract class Gnat {
    int hp;
    int points;

    public void reduceHp(Gnat gnat){
        gnat.hp--;
    }
}
