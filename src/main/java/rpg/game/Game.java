package rpg.game;
import rpg.model.Location;

public class Game {
    public static void main(String[] args) {

        //*** Initialisiere Orte ***
        System.out.println("Orte werden geladen");
        Location leetTavern = new Location("Der silberne Elch",
                "Es handelt sich um eine berühmte Taverne in Leet");
        Location leetMarket = new Location("Marktplatz",
                "Auf dem Marktplatz von Leet bieten die Händler Waren feil.");

        leetTavern.addExits("WESTEN", leetMarket);
        leetMarket.addExits("OSTEN", leetTavern);

    }
}
