package club.ttg.bestiary;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("bestiary")
public class Beast {
    @Id
    private String id;
    /**
     * Имя существа.
     */
    private Name name;
    /**
     * Класс доспеха.
     */
    private ArmorClass armorClass;
    /**
     * Скорость.
     */
    private Speed speed;

    /**
     * Характеристики
     */
    private Abilities abilities;
    /**
     * Спасброски.
     */
    private List<SavingThrow> savingThrows;
    /**
     * Навыки
     */
    private List<Skill> skills;
    /**
     * Сопротивления к урону
     */
    private List<String> damageResistances;
    /**
     * Иммунитеты к урону
     */
    private List<String> damageImmunities;
    /**
     * Уязвимости к урону
     */
    private List<String> damageVulnerabilities;
    /**
     * Иммунитеты к состояниям
     */
    private List<String> conditionImmunities;
    private Senses senses;
}
