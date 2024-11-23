package necifer.perso.histoireFantasy.attaque;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
@Getter
public class ForceDeCombat {

    private final int pointDeDegat;
    private final String nom;
    protected boolean operationnel;

    public int utiliser() {
        return pointDeDegat;
    }
}
