package necifer.perso.histoireFantasy.attaque;

public class Griffe extends Tranchant {

    public Griffe() {
        super(20, "Griffe", 1);
    }

    @Override
    public int utiliser() {

        return getPointDeDegat();
    }
}