package club.ttg.bestiary;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Характеристики.
 */
@Getter
@Setter
@Builder
public class Abilities {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intellect;
    private int wisdom;
    private int charisma;
}

