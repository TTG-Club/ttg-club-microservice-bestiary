package club.ttg.bestiary.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Уровень опасности существа
 */
@Getter
@Setter
public class Challenge {
    /**
     * Значение
     */
    private String value;
    /**
     * Количество опыта
     */
    private String xp;
}
