package testSuite;

import enums.MenuOption;
import org.junit.jupiter.api.Test;

public class FlightsTest extends TestBase {
    @Test
    public void verifyBookingFlights() {
        menuSection.getMenuOptionLocator(MenuOption.FLIGHTS).click();
        //Select one way
        searchDestinySection.oneWayButton.click();
        //Select flight type
        searchDestinySection.selectFlightType("business");
        //Set departure date
        searchDestinySection.setDepartureDate("06-12-2024");
        //Set travelers
        searchDestinySection.travellersButton.click();
        searchDestinySection.childCountButton.click();

    }
}
