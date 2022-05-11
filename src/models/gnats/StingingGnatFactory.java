package models.gnats;

public class StingingGnatFactory extends GnatFactory{

    @Override
    public void createGnat() {
        new StingingGnat();
    }
}