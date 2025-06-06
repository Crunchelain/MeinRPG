package rpg.model;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private String name;
    private String description;
    private Map<String, Location> exits;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
        this.exits = new HashMap<>();
    }

    public void addExits(String direction, Location location) {
        this.exits.put(direction, location);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Location> getExits() {
        return exits;
    }

    public Location getExit(String direction) {
        return this.exits.get(direction);
    }
}
