package club.ttg.bestiary.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Рой существ
 */
@Getter
@Setter
public class Swarm {
    /**
     * Размер роя
     */
    private String size;
    /**
     * Тип существ в рое.
     */
    private String type;
    /**
     * Размер существ в рое.
     */
    private String beastSize;
}
