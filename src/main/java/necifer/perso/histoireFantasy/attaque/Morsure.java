package necifer.perso.histoireFantasy.attaque;

public class Morsure extends Tranchant {

    public Morsure(int pointDeDegat) {
        super(pointDeDegat, "Morsure", 1);
    }

    @Override
    public int utiliser() {
        return getPointDeDegat();
    }
}