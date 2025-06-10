package rpg.command;

/**
 * All valid commands in the game
 */

public enum CommandWord {
    //One constant for each command
    GEHE("gehe"),
    HILFE("hilfe"),
    QUIT("quit"),
    UMSEHEN("umsehen"),
    SCHAU("schau"),
    UNKNOWN("?");

    private String commandString;

    /**
     * Constructor sets the string of the command
     * @param commandInput is the command input
     */
    CommandWord(String commandInput) {
        this.commandString = commandInput;
    }

    /**
     * Returns the command as a String
     * @return command as string.
     */
    @Override
    public String toString() {
        return commandString;
    }

}
