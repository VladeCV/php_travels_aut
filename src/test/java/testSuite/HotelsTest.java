package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.JavaScriptUtil;
import util.ScrollUtil;

import static enums.MenuOption.HOTELS;

public class HotelsTest extends TestBase {
    @Test
    public void verifyBookingHotels() throws InterruptedException {
        menuSection.getMenuOptionLocator(HOTELS).click();
        hotelsPage.searchByCityLabel.click();
        searchByCitySection.searchCityTxtBox.setText("Dubai");
        searchByCitySection.getCityLocator("Dubai").waitVisibility(5).click();
        hotelsPage.checkinTxtBox.setText("10-10-2024");
        hotelsPage.checkinTxtBox.click();
        hotelsPage.checkoutTxtBox.setText("15-10-2024");
        hotelsPage.checkoutTxtBox.click();
        hotelsPage.travelersRoomsLabel.click();
        travelersRoomsSection.roomsNumberTxtBox.setText("2");
        travelersRoomsSection.adultsNumberTxtBox.setText("2");
        hotelsPage.travelersRoomsLabel.click();
        hotelsPage.searchButton.click();
        hotelsPage.getViewMoreHotelButton("Armani Hotel Dubai").click();
        Assertions.assertEquals("Armani Hotel Dubai", infoHotelPage.getNameHotelLabel("Armani Hotel Dubai").waitVisibility(10).getText(), "It isn't the chosen hotel");
        ScrollUtil.scrollBy(0, 500);
        Thread.sleep(1000);
        ScrollUtil.scrollToElement(infoHotelPage.hotelRoomsLabel);
        infoHotelPage.bookNowButton.click();

        // Personal Information
        hotelBookingPage.firstNameTxtBox.setText("Carlos");
        hotelBookingPage.lastNameTxtBox.setText("Martinez");
        hotelBookingPage.emailTxtBox.setText("prueba_carlos@gmail.com");
        hotelBookingPage.phoneTxtBox.setText("7894561");
        hotelBookingPage.addressTxtBox.setText("Av. Costanera");
        hotelBookingPage.currentCountryLabel.click();
        hotelBookingPage.searchCountryTxtBox.setTextAndEnter("Bolivia");

        // Datos de entrada
        String[][] datosPersonas = {
                {"Mr", "Carlos", "Martinez"},
                {"Mrs", "María", "Gomez"}
        };

        // Travellers Information
        for (int i = 1; i <= datosPersonas.length ; i++) {
            String title = datosPersonas[i - 1][0];
            String nombre = datosPersonas[i - 1][1];
            String apellido = datosPersonas[i - 1][2];

            hotelBookingPage.selectTitle(i, title);
            hotelBookingPage.firstNameTraveler(i).setText(nombre);
            hotelBookingPage.lastNameTraveler(i).setText(apellido);
        }

        // Payment Methods
        ScrollUtil.scrollBy(0, 500);
        Thread.sleep(1000);
        ScrollUtil.scrollToElement(hotelBookingPage.paymentMethodsLabel);
        hotelBookingPage.selectPaymentMethods("Bank Transfer").click();

        ScrollUtil.scrollBy(0, 500);
        Thread.sleep(1000);
        ScrollUtil.scrollToElement(hotelBookingPage.agreeTermsConditionCheckBox);
        hotelBookingPage.agreeTermsConditionCheckBox.check();

//        ScrollUtil.scrollToElement(hotelBookingPage.totalPriceLabel);
        String totalPrice = hotelBookingPage.totalPriceLabel.getAttribute("value");

        hotelBookingPage.bookingConfirmButton.click();

        Assertions.assertTrue(invoicePage.payTitleLabel.waitVisibility(10).isDisplayed(), "The element is not displayed");

        String totalPriceInvoice = invoicePage.totalPriceInvoiceLabel.getText();

        // Comparing Prices
        double total = Double.parseDouble(totalPrice);
        double invoice = Double.parseDouble(totalPriceInvoice);

        Assertions.assertEquals(total, invoice, "The price do not match.");

        invoicePage.proceedButton.click();

        Assertions.assertTrue(bankInformationPage.bankInformationLabel.waitVisibility(10).isDisplayed(), "The information page is not displayed");

    }
}
