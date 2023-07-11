package club.ttg.bestiary.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Бонус к навыку.
 */
@Getter
@Setter
public class Skill {
    /**
     * Название навыка
     */
    private Name name;
    /**
     * Значение
     */
    private int value;
    /**
     * Дополнительный бонус
     */
    private String suffix;
}
