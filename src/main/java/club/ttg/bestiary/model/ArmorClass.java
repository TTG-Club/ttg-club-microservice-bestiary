package club.ttg.bestiary.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Класс доспеха.
 */
@Getter
@Setter
public class ArmorClass {
    /**
     * Значения класса доспеха
     */
    private int value;
    /**
     * Дополнительное описание
     */
    private String suffix;
}
