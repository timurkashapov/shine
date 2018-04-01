package domain.entity;

public abstract class Entity {

    /**
     * идентификатор сущности.
     */
    private String guid;

    /**
     * Название.
     */
    private String name;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
