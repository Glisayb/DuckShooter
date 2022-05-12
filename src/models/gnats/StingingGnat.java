package models.gnats;

public class StingingGnat extends Gnat{
    GnatTypes type = GnatTypes.Stinging;

    public StingingGnat(int hp, int points){
        super(hp, points,"komar1left.png","komar1right.png");
    }

}