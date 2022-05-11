package models.gnats;

public class GnatFactory {


    public Gnat createGnat(GnatTypes type) {
        Gnat gnat;

        switch (type) {
            case Buzzing -> {gnat = new BuzzingGnat();
            }
            case Stinging -> {gnat = new StingingGnat();
            }
            case Malarian -> {gnat = new MalarianGnat();
            }
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
        return gnat;
    }
}