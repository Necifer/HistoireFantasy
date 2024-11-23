package necifer.perso.histoireFantasy.attaque;

public class Arc extends Arme {

    private int nbDeFlechesRestantes;

    public Arc(int nbDeFlechesRestantes) {
        super(50, "Arc");
        this.nbDeFlechesRestantes = nbDeFlechesRestantes;
    }

    @Override
    public int utiliser() {
        nbDeFlechesRestantes--;
        if (nbDeFlechesRestantes <= 0) {
            operationnel = false;
        }
        return super.utiliser();
    }
}
