package rpg.command;

/**
 * Interface for command-classes in the Game.
 * Represents every command that the player can use.
 */
public interface Command {
    /**
     * Executes the command.
     * @return true if game shoud be terminated
     */
    boolean execute();
}
