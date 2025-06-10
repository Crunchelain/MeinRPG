package rpg.command;

public class UnknownCommand implements Command {

    @Override
    public boolean execute() {
        System.out.println("Der Befehl ist unbekannt. Gib 'hilfe' ein, um eine Befehlliste auszugeben.");
        return false; //Bricht die Spielschleife nicht.
    }
}
