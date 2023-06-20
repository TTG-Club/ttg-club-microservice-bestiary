package club.ttg.bestiary.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Имя существа.
 */
@Getter
@Setter
@AllArgsConstructor
public class Name {
    /**
     * Имя на русском
     */
    private String name;
    /**
     * Имя на английском
     */
    private String englishName;
    /**
     * Альтернативное имя
     */
    private String altName;
}
