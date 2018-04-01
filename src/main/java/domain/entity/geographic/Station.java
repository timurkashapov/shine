package domain.entity.geographic;

import domain.entity.Address;
import domain.entity.Entity;

/**
 * Станция (точка остановки в рейсе).
 *
 *
 *
 *
 */
public class Station extends Entity {

    /**
     * Адрес.
     */
    private Address address;

    /**
     * Координаты (географическое положение).
     */
    private Coordinate coordinates;

    /**
     * Тип.
     */
    private StationType type;

    /**
     * Населенный пункт.
     */
    private Locality locality;

    /**
     * Телефон справочного бюро.
     */
    private String phone;
}
