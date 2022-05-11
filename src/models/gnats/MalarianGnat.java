package models.gnats;

public class MalarianGnat extends Gnat{
    GnatTypes type = GnatTypes.Malarian;
    int hp;
    int points;

    public MalarianGnat(){
        hp = 6;
        points = 75;
    }

}