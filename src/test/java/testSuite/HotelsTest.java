package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static enums.MenuOption.HOTELS;

public class HotelsTest extends TestBase {
    @Test
    public void verifyBookingHotels() throws InterruptedException {
        menuSection.getMenuOptionLocator(HOTELS).click();
        hotelsPage.searchByCityLabel.click();
        searchByCitySection.searchCityTxtBox.setText("Dubai");
        Thread.sleep(2000);
        searchByCitySection.getCityLocator("Dubai").click();
        hotelsPage.checkinTxtBox.setText("10-10-2024");
        hotelsPage.checkinTxtBox.click();
        hotelsPage.checkoutTxtBox.setText("15-10-2024");
        hotelsPage.checkoutTxtBox.click();
        hotelsPage.travelersRoomsLabel.click();
        travelersRoomsSection.roomsNumberTxtBox.setText("2");
        travelersRoomsSection.adultsNumberTxtBox.setText("2");
        hotelsPage.travelersRoomsLabel.click();
        hotelsPage.searchButton.click();



        Thread.sleep(5000);
//        Assertions.assertEquals(hotelsPage.searchByCity.getSelectedText(), "Delhi India", "No se muestra el pais");
    }
}
