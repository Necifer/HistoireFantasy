package necifer.perso.histoireFantasy.attaque;

public abstract class Pouvoir extends ForceDeCombat {

    private int nbUtilisationPouvoir;
    private final int nbUtilisationPouvoirInitial;

    public Pouvoir(int pointDeDegat, String nom, int nbUtilisationPouvoir) {
        super(pointDeDegat, nom);
        this.nbUtilisationPouvoirInitial = nbUtilisationPouvoir;
        regenererPouvoir();
    }

    public void regenererPouvoir() {
        nbUtilisationPouvoir = nbUtilisationPouvoirInitial;
        operationnel = true;
    }

    @Override
    public int utiliser() {
        nbUtilisationPouvoir--;
        operationnel = nbUtilisationPouvoir > 0;
        return super.utiliser();
    }
}
