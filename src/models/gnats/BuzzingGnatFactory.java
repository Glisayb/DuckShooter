package models.gnats;

public class BuzzingGnatFactory extends GnatFactory{

    @Override
    public void createGnat() {
        new BuzzingGnat();
    }
}
