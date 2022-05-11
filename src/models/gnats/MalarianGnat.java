package models.gnats;

public class MalarianGnat extends Gnat{
    GnatTypes type;
    int hp;
    int points;

    public MalarianGnat(){
        type = GnatTypes.Malarian;
        hp = 6;
        points = 75;
    }

}