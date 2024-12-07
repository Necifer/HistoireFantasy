package necifer.perso.histoireFantasy.protagoniste;

import lombok.Getter;
import lombok.ToString;
import necifer.perso.histoireFantasy.attaque.Pouvoir;

@Getter
@ToString
public class Monstre extends EtreVivant {


    private final ZoneDeCombat zoneDeCombat;
    private final Domaine domaine;

    private Pouvoir[] attaques;

    public Monstre(String nom, int forceDeVie, ZoneDeCombat zoneDeCombat, Domaine domaine, Pouvoir... attaques) {

        super(nom, forceDeVie);
        this.domaine = domaine;
        this.zoneDeCombat = zoneDeCombat;
        this.attaques = getAttaques();
    }

    public void attaque() {
        if (GestionAttaque.hasNext() = true) {

            return super.Pouvoir.utiliser();
        } else {
            return ("null");
        }
    }
}
