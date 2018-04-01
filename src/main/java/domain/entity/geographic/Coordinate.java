package domain.entity.geographic;

import domain.entity.Entity;

/**
 * Координаты сущности.
 *
 *
 *
 *
 *
 */
public class Coordinate extends Entity {

    /**
     * Коорданата по оси X.
     */
    private Long x;

    /**
     * Координата по оси Y.
     */
    private Long y;

    /**
     * Широта.
     */
    private Double latitude;

    /**
     * Долгота.
     */
    private Double longitude;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
