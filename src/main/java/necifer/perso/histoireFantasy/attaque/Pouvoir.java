package necifer.perso.histoireFantasy.attaque;

public abstract class Pouvoir extends ForceDeCombat {

    private int nbUtilisationPouvoir;
    private final int nbUtilisationPouvoirInititial;

    public Pouvoir(int pointDeDegat, String nom, int nbUtilisationPouvoir) {
        super(pointDeDegat, nom);
        this.nbUtilisationPouvoirInititial = nbUtilisationPouvoir;
        regenererPouvoir();
    }

    public void regenererPouvoir() {
        nbUtilisationPouvoir = nbUtilisationPouvoirInititial;
        operationnel = true;
    }

    @Override
    public int utiliser() {
        nbUtilisationPouvoir--;
        operationnel = nbUtilisationPouvoir > 0;
        return super.utiliser();
    }
}
