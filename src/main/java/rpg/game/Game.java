package rpg.game;
import rpg.model.Location;
import rpg.model.PlayerCharacter;

import java.util.Locale;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        //*** Initialisiere Orte ***
        System.out.println("Orte werden geladen");
        Location tavern = new Location("Der silberne Elch",
                "Du betrittst den silbernen Elch. Die kleine Taverne im Dorf Leet.");
        Location market = new Location("Marktplatz",
                "Der Marktplatz von Leet beherbert verschiedene Stände mit allerlei Waren für den Alltagsgebrauch.");

        tavern.addExits("TAVERNENTÜRE", market);
        market.addExits("TAVERNENTÜRE", tavern);

        Location currentLocation = tavern;

        //*** Erstelle den Spielercharakter ***
        Scanner input = new Scanner(System.in);
        System.out.print("Wie ist der Name deines Helden: ");
        String heroName = input.nextLine();
        PlayerCharacter player = new PlayerCharacter(heroName);

        //*** Gamestart ***
        System.out.println("Willkommen in deinem Abenteuer " + player.getName());
        System.out.println("Mit dem Wort Hilfe, kannst du dir die jeweiligen Kommandos anzeigen lassen.");
        System.out.println("Aktuell befindest du dich hier: " + currentLocation.getName());
        System.out.println(currentLocation.getDescription());

        // ---> Spielschleife
        while(true) {
            //Promptzeichen für erwartete Eingabe
            System.out.print("> ");
            String command = input.nextLine();

            String[] commandParts = command.trim().split(" ");

            if(commandParts.length == 0 || commandParts[0].isEmpty()) {
                //Leere Eingaben ignorieren und einfach nochmals Anfragen
                continue;
            }

            String verb = commandParts[0].toLowerCase();

            //Befehl verarbeiten
            //Beenden des Spiels
            if(verb.equalsIgnoreCase("quit")) {
                System.out.println("Das Spiel wird verlassen. Auf ein ander Mal.");
                break;
            } else if (verb.equalsIgnoreCase("gehe")) {
                if(commandParts.length == 2) {
                    String direction = commandParts[1].toUpperCase();
                    Location nextLocation = currentLocation.getExit(direction);

                    if (nextLocation != null) {
                        currentLocation = nextLocation;

                        System.out.println("----------");
                        System.out.println("Aktuell befindest du dich hier: " + currentLocation.getName());
                        System.out.println(currentLocation.getDescription());
                    } else {
                        System.out.println("Du kannst diese Ort nicht betreten: " + direction);
                    }
                }

            } else if (verb.equalsIgnoreCase("Umsehen")) {
                //TODO: Umsehen implementieren.
            } else {
                System.out.println("Unbekannter Befehl. Du kannst dir die Befehle mit hilfe auflisten lassen.");
            }
        }
    }
}
