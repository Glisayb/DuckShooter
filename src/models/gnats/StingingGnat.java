package models.gnats;

public class StingingGnat extends Gnat{
    GnatTypes type = GnatTypes.Stinging;
    int hp;
    int points;

    public StingingGnat(){
        hp = 3;
        points = 20;
    }

}