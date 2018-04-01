package util;

import domain.entity.Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntityUtilities implements Utilities {

    public static <String, E extends Entity> Map<String, E> mapEntitiesByName(List<E> entities) {
        Map map = new HashMap<String, E>();
        if (!entities.isEmpty()) {
            for (Entity entity : entities) {
                map.put(entity.getName(), entity);
            }
        }
        return map;
    }
}
