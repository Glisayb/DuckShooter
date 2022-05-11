package models.gnats;

public class StingingGnat extends Gnat{
    GnatTypes type;
    int hp;
    int points;

    public StingingGnat(){
        type = GnatTypes.Stinging;
        hp = 3;
        points = 20;
    }

}