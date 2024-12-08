package necifer.perso.histoireFantasy.protagoniste;

import lombok.Getter;
import lombok.ToString;
import necifer.perso.histoireFantasy.attaque.Pouvoir;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

@Getter
@ToString
public class Monstre extends EtreVivant {


    private final ZoneDeCombat zoneDeCombat;
    private final Domaine domaine;

    private final Pouvoir[] attaques;
    private GestionAttaque gestionAttaque;

    public Monstre(String nom, int forceDeVie, ZoneDeCombat zoneDeCombat, Domaine domaine, Pouvoir... attaques) {

        super(nom, forceDeVie);
        this.domaine = domaine;
        this.zoneDeCombat = zoneDeCombat;
        this.attaques = attaques;
    }

    public void entreEnCombat() {

        Arrays.stream(attaques).forEach(Pouvoir::regenererPouvoir);
        /* equivalent de la boucle for each ci dessous
        for (Pouvoir pouvoir : attaques) {
            pouvoir.regenererPouvoir();
        }*/
        gestionAttaque = new GestionAttaque();
    }

    public Pouvoir attaque() {


        return gestionAttaque.hasNext() ? gestionAttaque.next() : null; // operateur ternaire : "condition a evaluer" ? "comportement si true" : "comportement si false"
        /* equivalent du if ci dessous :

        if (gestionAttaque.hasNext()) {
            return gestionAttaque.next();
        } else {
            return null;
        }*/
    }

    private class GestionAttaque implements Iterator<Pouvoir> {

        private final Pouvoir[] attaquesPossibles = attaques;
        private int nbAttaquesPossibles = attaques.length;

        @Override
        public boolean hasNext() {

            for (int i = 0; i < nbAttaquesPossibles; i++) {

                if (!attaquesPossibles[i].isOperationnel()) {

                    attaquesPossibles[i] = attaquesPossibles[nbAttaquesPossibles - 1];
                    nbAttaquesPossibles--;
                }
            }
            return nbAttaquesPossibles > 0;
        }

        @Override
        public Pouvoir next() {

            return attaquesPossibles[new Random().nextInt(nbAttaquesPossibles)];
        }
    }


}
