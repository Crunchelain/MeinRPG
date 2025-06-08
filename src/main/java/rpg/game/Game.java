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

        tavern.addExits("TAVERNENTÜRE", tavern);
        market.addExits("TAVERNENTÜRE", market);

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


    }
}
