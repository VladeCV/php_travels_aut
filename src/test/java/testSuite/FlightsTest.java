package testSuite;

import enums.MenuOption;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FlightsTest extends TestBase {
    @Test
    public void verifyBookingFlights() throws InterruptedException {
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

        //Select fly from
        searchDestinySection.flyFromButton.click();
        //Select option
        searchDestinySection.clickSearchedDestiny("Alama Iqbal International Airport");
        Thread.sleep(2000);

        //Select fly to
        searchDestinySection.flyToButton.click();
        //Select option
        searchDestinySection.clickSearchedDestiny("Dubai International Airport");
        Thread.sleep(2000);

        //Search flight
        searchDestinySection.searchButton.click();

        //Select Emirates Airline
        selectFlightSection.emiratesAirlineButton.click();
        //Select direct flight
        selectFlightSection.directFlightButton.click();
        //Select high to low
        selectFlightSection.highToLowButton.click();
        Thread.sleep(2000);

        //Select the most expensive flight
        selectFlightSection.topFlightButton.click();
        Thread.sleep(1000);
    }
}
