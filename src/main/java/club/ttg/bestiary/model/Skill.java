package club.ttg.bestiary.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Бонус к навыку.
 */
@Getter
@Setter
public class Skill {
    private String name;
    private int value;
    private String suffix;
}
