package rpg.command;

import java.util.Locale;
import java.util.Scanner;

public class Parser {
    private Scanner reader;

    public Parser() {
        this.reader = new Scanner(System.in);
    }

    /**
     * Reads the next line and returns it as command-object.
     * @return the command from the playercharachter.
     */
    public Command getCommand() {
        System.out.println("> "); //Inputsign

        String inputLine = reader.nextLine();
        String[] words = inputLine.trim().toLowerCase().split(" ");

        String commandWord = words[0];

        if(commandWord.equals(CommandWord.QUIT.toString())) {
            return new QuitCommand();
        }

        // Other If-Statements for more commands...

        // If it is an unknown command
        return new UnknownCommand();
    }
}
