package models.gnats;

public class BuzzingGnat extends Gnat{

    GnatTypes type = GnatTypes.Buzzing;

    public BuzzingGnat(int hp, int points){
        super(hp, points, "komar1left.png","komar1right.png");

    }

}
