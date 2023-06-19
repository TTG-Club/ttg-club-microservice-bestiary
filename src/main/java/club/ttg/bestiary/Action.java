package club.ttg.bestiary;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Action {
    private Name name;
    private String recharge;
    private Integer cost;
    private String description;
}
