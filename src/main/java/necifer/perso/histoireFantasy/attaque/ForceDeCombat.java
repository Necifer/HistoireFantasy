package necifer.perso.histoireFantasy.attaque;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
public abstract class ForceDeCombat {

    private final int pointDeDegat;
    private final String nom;
    protected boolean operationnel = true;

    public int utiliser() {
        return pointDeDegat;
    }
}
