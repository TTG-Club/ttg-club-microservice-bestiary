package club.ttg.bestiary.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Спасбросок.
 */
@Getter
@Setter
public class SavingThrow {
    private String ability;
    private int value;
    private int suffix;
}
