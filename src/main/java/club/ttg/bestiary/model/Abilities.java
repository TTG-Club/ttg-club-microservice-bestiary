package club.ttg.bestiary.model;

import jakarta.validation.constraints.Size;
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
    @Size(min = 1, max = 30)
    private int strength;
    @Size(min = 1, max = 30)
    private int dexterity;
    @Size(min = 1, max = 30)
    private int constitution;
    @Size(min = 1, max = 30)
    private int intellect;
    @Size(min = 1, max = 30)
    private int wisdom;
    @Size(min = 1, max = 30)
    private int charisma;
}

