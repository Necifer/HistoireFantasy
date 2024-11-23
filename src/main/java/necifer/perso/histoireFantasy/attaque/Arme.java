package necifer.perso.histoireFantasy.attaque;

public abstract class Arme extends ForceDeCombat {

    protected Arme(int pointDeDegat, String nom) {
        super(pointDeDegat, nom);//super = appel de la classe directement parente
    }
}
