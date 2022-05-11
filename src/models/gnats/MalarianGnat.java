package models.gnats;

public class MalarianGnat extends Gnat{
    GnatTypes type = GnatTypes.Malarian;

    public MalarianGnat(int hp, int points){
        super(hp, points);
    }
}