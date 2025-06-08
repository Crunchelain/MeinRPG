package rpg.model;

public class PlayerCharacter {
    private final String name;
    private int level;
    private int healthPoints;
    private int strength;
    private int constitution;
    private int dexterity;
    private int skillPoints;

    public PlayerCharacter(String name) {
        this.name = name;
        this.level = 1;
        this.healthPoints = 100;
        this.strength = 1;
        this.constitution = 1;
        this.dexterity = 1;
        this.skillPoints = 10;
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getConstitution() {
        return this.constitution;
    }

    public int getDexterity() {
        return this.dexterity;
    }

    public int getSkillPoints() {
        return this.skillPoints;
    }
}
