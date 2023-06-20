package club.ttg.bestiary.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.List;

/**
 * Бестиарий.
 */
@Document("bestiary")
public class Beast {
    @Id
    private String id;

    /**
     * Размер существа
     */
    private String size;

    /**
     * Тип существа
     */
    private String type;

    /**
     * Рой
     */
    private Swarm swarm;

    /**
     * Мировоззрение.
     */
    private String alignment;

    /**
     * Имя существа.
     */
    private Name name;

    /**
     * Описание существа.
     */
    private String description;

    /**
     * Класс доспеха.
     */
    private ArmorClass armorClass;

    private Hits hits;
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

    /**
     * Чувства
     */
    private Senses senses;

    /**
     * Уровень опасности.
     */
    private Challenge challenge;

    /**
     * Языки
     */
    private List<String> languages;

    /**
     * Действия
     */
    private List<Action> actions;

    /**
     * Бонусные действия
     */
    private List<Action> bonusActions;

    /**
     * Реакции
     */
    private List<Action> reactions;

    /**
     * Текст для легендарных действий
     */
    private String legendaryText;

    /**
     * Легендарные действия
     */
    private List<Action> legendaryActions;

    /**
     * Мистические действия
     */
    private List<Action> mysticActions;

    /**
     * Описание логова
     */
    private String lairDescription;

    /**
     * Действия логова
     */
    private List<Action> lairActions;

    /**
     * Эффекты логова
     */
    private String lairEffects;

    private List<String> environments;

    /**
     * Источник
     */
    private Source source;

    /**
     * Прочие источники, где упоминается
     */
    private Collection<Source> otherSources;

    /**
     * Ссылки на изображения
     */
    private Collection<String> images;
}
