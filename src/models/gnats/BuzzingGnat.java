package models.gnats;

public class BuzzingGnat extends Gnat{

    GnatTypes type = GnatTypes.Buzzing;
//    private final String pathLeft = "komar1left.png";
//    private final String pathRight = "komar1right.png";

    public BuzzingGnat(int hp, int points){
        super(hp, points, "komar1left.png","komar1right.png");

    }

}
