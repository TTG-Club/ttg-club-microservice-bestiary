package club.ttg.bestiary.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Действие
 */
@Getter
@Setter
public class Action {
    /**
     * Наименование
     */
    private Name name;
    /**
     * Перезарядка
     */
    private String recharge;
    /**
     * Стоимость (для легендарных и мифических)
     */
    private Integer cost;
    /**
     * Описание
     */
    private String description;
}
