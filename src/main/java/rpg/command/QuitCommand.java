package rpg.command;

public class QuitCommand implements Command {

    @Override
    public boolean execute() {
        System.out.println("Das Spiel wird beendet. Auf Wiedersehen!");
        return true; //True bedeutet, dass die Spielschleife beendet werden soll.
    }
}
