package models.gnats;

public class MalarianGnatFactory extends GnatFactory{

    @Override
    public void createGnat() {
        new MalarianGnat();
    }
}