package rpg.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationTest {
    Location testLocation;
    Location exitLocation;
    @BeforeEach
    void setUp() {
        testLocation = new Location("TestLocation", "Das ist ein Test");
        exitLocation = new Location("ExitTest", "Test für Ausgang");
    }

    @Test
    @DisplayName("Initialisierung korrekt gesetzt")
    void newLocationInitialized() {
        //ARRANGE
        String locationName = "TestLocation";
        String locationDescription = "Das ist ein Test";

        //ACT
        //ACT was done in BeforeEach

        //ASSERT
        assertEquals(locationName, testLocation.getName());
        assertEquals(locationDescription, testLocation.getDescription());
    }

    @Test
    @DisplayName("Neuen Ausgang hinzfuügen")
    void addNewExitToLocation() {
        //ARRANGE
        String testdirection = "TESTEXIT";
        Location expectedExitLocation = new Location();
        Map<String, Location> expectedExit = new HashMap<>();
        expectedExit.put("ExitTest", expectedExitLocation);


        //ACT
        testLocation.addExits("TESTEXIT", exitLocation);

        //ASSERT
        assertEquals(expectedExitLocation, testLocation.getExit(testdirection));
    }
}
