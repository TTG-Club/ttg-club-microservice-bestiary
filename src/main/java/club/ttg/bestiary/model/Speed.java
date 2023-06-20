package club.ttg.bestiary.model;

/**
 * Скорость существа.
 */
public class Speed {
    /**
     * Движение по поверхности.
     */
    private int value;
    /**
     * Летая
     */
    private Integer fly;

    /**
     * Парит при полете
     */
    private Boolean hover;

    /**
     * Копая
     */
    private Integer burrow;
    /**
     * Лазая
     */
    private Integer climb;
    /**
     * Плавая
     */
    private Integer swim;
    /**
     * Дополнительная информация о скорости
     */
    private String additional;
}
