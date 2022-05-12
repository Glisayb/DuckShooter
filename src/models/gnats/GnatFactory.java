package models.gnats;

import models.Difficulties;

public class GnatFactory {

    int[][] hp = {{2,3,6},{2,4,8},{3,4,10}};
    int[][] points = {{10,20,75},{9,30,75},{12,25,90}};

    public Gnat createGnat(GnatTypes type, Difficulties level) {
        Gnat gnat;

        int y;

        switch (level) {
            case NUTS -> y=0;
            case MAD -> y=1;
            case INSANE -> y=2;
            default -> throw new IllegalStateException("Unexpected value: " + level);
        }

        switch (type) {
            case Buzzing -> gnat = new BuzzingGnat(hp[y][0],points[y][0]);
            case Stinging -> gnat = new StingingGnat(hp[y][1],points[y][1]);
            case Malarian -> gnat = new MalarianGnat(hp[y][2],points[y][2]);
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }

        return gnat;
    }
}