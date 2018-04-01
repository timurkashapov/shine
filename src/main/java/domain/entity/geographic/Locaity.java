package domain.entity.geographic;

import domain.entity.Entity;
import util.EntityUtilities;

import java.util.List;
import java.util.Map;

/**
 * Населенный пункт.
 *
 *
 *
 *
 */
public class Locaity extends Entity {

    /**
     * Название района.
     */
    private String districtName;

    /**
     * Название области.
     */
    private String regionName;

    /**
     * Станции.
     */
    List<Station> stations;

    /**
     * Добавление станции.
     * @param station станция.
     */
    public void addStation(final Station station) {
        stations.add(station);
    }

    /**
     * Удаление станции по названию станции.
     * @param name название станции.
     */
    public void delStation(final String name) {
        final Map<String, Station> map = EntityUtilities.mapEntitiesByName(stations);
        if (! map.isEmpty()) {
            if (map.containsKey(name)) {
                map.remove(name);
            }
        }
    }




}
