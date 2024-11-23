package necifer.perso.histoireFantasy.attaque;

import lombok.Getter;

public class Epee extends Arme {

    @Getter
    private final String nomEpee;

    public Epee(String nomEpee) {
        super(80, "Epee");
        this.nomEpee = nomEpee;
    }
}
