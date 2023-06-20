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
    /**
     * Сила
     */
    @Size(min = 1, max = 30)
    private int strength;
    /**
     * Ловкость
     */
    @Size(min = 1, max = 30)
    private int dexterity;
    /**
     * Телосложение (Выносливость)
     */
    @Size(min = 1, max = 30)
    private int constitution;
    /**
     * Интеллект
     */
    @Size(min = 1, max = 30)
    private int intellect;
    /**
     * Мудрость
     */
    @Size(min = 1, max = 30)
    private int wisdom;
    /**
     * Харизма
     */
    @Size(min = 1, max = 30)
    private int charisma;
}

