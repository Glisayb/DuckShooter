package models.gnats;

public class BuzzingGnat extends Gnat{
    GnatTypes type = GnatTypes.Buzzing;
    int hp;
    int points;

    public BuzzingGnat(){
        hp = 2;
        points = 10;
    }

}
