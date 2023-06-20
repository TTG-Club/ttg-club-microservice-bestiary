package club.ttg.bestiary.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Спасбросок.
 */
@Getter
@Setter
public class SavingThrow {
    /**
     * Характеристика
     */
    private String ability;
    /**
     * Значение
     */
    private int value;
    /**
     * Дополнительный бонус
     */
    private int suffix;
}
