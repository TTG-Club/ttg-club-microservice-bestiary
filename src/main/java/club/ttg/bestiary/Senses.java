package club.ttg.bestiary;

import lombok.Getter;
import lombok.Setter;

/**
 * Чувства.
 */
@Getter
@Setter
public class Senses {
    /**
     * Темное зрение.
     */
    private Integer darkvision;
    /**
     * Истинное зрение.
     */
    private Integer truesight;
    /**
     * Слепое зрение.
     */
    private Integer blindsight;
    /**
     * Слепо за пределами радиуса слепого зрения
     */
    private Boolean blindsightRadius;
    /**
     * Чувство вибрации.
     */
    private Integer tremorsense;
    /**
     * Пассивная Внимательность
     */
    private Integer passivePerception;
}
