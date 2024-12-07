package necifer.perso.histoireFantasy.protagoniste;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public abstract class EtreVivant {

    private final String nom;
    private final int forceDeVie;
}
