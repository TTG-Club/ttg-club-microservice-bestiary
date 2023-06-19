package club.ttg.bestiary.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Хиты существа.
 */
@Getter
@Setter
public class Hits {
    /**
     * Среднее или абсолютное значение
     */
    private int value;
    /**
     * Количество костей хитов
     */
    private Integer hitDiceCount;
    /**
     * Дайс
     */
    private String hitDice;
    /**
     * Бонус к хитам
     */
    private Integer hitBonus;

    /**
     * Текстовое описание хитов.
     */
    private String text;
}
