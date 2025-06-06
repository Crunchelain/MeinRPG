package rpg.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {
    PlayerCharacter testPlayer;

    @BeforeEach
    void setUp() {
        testPlayer = new PlayerCharacter("Testplayer");
    }

    //Character mit korrekten Defaultwerten erstellen
    @Test
    void newPlayerCorrectDefaultStats() {
        //ARRANGE: Vorbereitung. Definition was erwartet wird.
        String expectedName = "Testplayer";
        int expectedLevel = 1;
        int expectedHealthPoints = 100;
        int expectedStrength = 1;
        int expectedConstitution = 1;
        int expectedDexterity = 1;

        //ACT: Aktion. Ausführen des Codes
        testPlayer = new PlayerCharacter(expectedName);

        //ASSERT. Überprüfung. Vergleich Ergebnis und Erwartungen.
        assertEquals(expectedName, testPlayer.getName());
        assertEquals(expectedLevel, testPlayer.getLevel());
        assertEquals(expectedHealthPoints, testPlayer.getHealthPoints());
        assertEquals(expectedStrength, testPlayer.getStrength());
        assertEquals(expectedConstitution, testPlayer.getConstitution());
        assertEquals(expectedDexterity, testPlayer.getDexterity());
    }
}
