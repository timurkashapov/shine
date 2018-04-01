package domain.entity.geographic;

public enum StationType {
    AUTO("Автомобильная"),
    AERO("Аэропорт"),
    RAILWAY("Железнодорожная");

    /**
     * Наименование.
     */
    private String name;

    StationType(String name) {
        this.name = name;
    }
}
