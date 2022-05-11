package models.gnats;

public class BuzzingGnat extends Gnat{
    GnatTypes type;
    int hp;
    int points;

    public BuzzingGnat(){
        type = GnatTypes.Buzzing;
        hp = 2;
        points = 10;
    }

}
