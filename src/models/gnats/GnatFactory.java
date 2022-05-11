package models.gnats;

import models.Difficulties;

public class GnatFactory {

    int[][] hp = {{2,3,6},{2,4,8},{3,4,10}};
    int[][] points = {{10,20,75},{9,30,75},{12,25,90}};

    public Gnat createGnat(GnatTypes type, Difficulties level) {
        Gnat gnat;

        int y;
        int x;

        switch (level) {
            case NUTS -> y=0;
            case MAD -> y=1;
            case INSANE -> y=2;
            default -> throw new IllegalStateException("Unexpected value: " + level);
        }

        switch (type) {
            case Buzzing -> x=0;
            case Stinging -> x=1;
            case Malarian -> x=2;
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }

        gnat = new Gnat(hp[y][x],points[y][x]);
        return gnat;
    }
}