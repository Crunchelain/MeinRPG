package rpg.game;
import rpg.model.Location;
import rpg.model.PlayerCharacter;

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
        System.out.println("Aktuell befindest du dich hier: " + currentLocation.getName());
        System.out.println(currentLocation.getDescription());

        // ---> Spielschleife
        while(true) {
            //Promptzeichen für erwartete Eingabe
            System.out.print("> ");
            String command = input.nextLine();

            String[] commandParts = command.split(" ");

            //Befehl verarbeiten
            //Beenden des Spiels
            if(command.equalsIgnoreCase("quit")) {
                System.out.println("Das Spiel wird verlassen. Auf ein ander Mal.");
                break;
            }

            if(commandParts.length > 0 && commandParts[0].equalsIgnoreCase("gehe")) {
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

            System.out.println("Unbekannter Befehl.");
        }
    }
}
