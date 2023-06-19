package club.ttg.bestiary;

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
    private String name;
    private String englishName;
    private String altName;
}
