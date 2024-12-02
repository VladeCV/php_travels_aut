package testSuite;

import enums.MenuOption;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.PaymentSection;
import util.ScrollUtil;

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

        //Booking data
        //Set first name, last name, email, phone, address
        personalInformationSection.firstNameTextBox.setText("CAMILO");
        personalInformationSection.lastNameTextBox.setText("CABRERA");
        personalInformationSection.emailTextBox.setText("vladr@gmail.com");
        personalInformationSection.phoneTextBox.setText("1234567890");
        personalInformationSection.addressTextBox.setText("Av. Siempre Viva 123");

        //Select nationality
        personalInformationSection.selectNationality("BO");

        ScrollUtil.scrollBy(0, 500);

        //Set data for passengers
        int passengers = 2;
        for (int i = 1; i <= passengers; i++) {
            if (i == 1) {
                travellerInformationSection.getFirstNameTextBox(i).setText("CAMILO");
            } else {
                travellerInformationSection.getFirstNameTextBox(i).setText("VLADIMIR");

            }
            travellerInformationSection.getLastNameTextBox(i).setText("CABRERA");
            travellerInformationSection.getNationalitySelectControl(i).selectByValue("BO");
            travellerInformationSection.getDayOfBirthSelectControl(i).selectByValue("1");
            travellerInformationSection.getDaySelectControl(i).selectByValue("01");
            travellerInformationSection.getYearSelectControl(i).selectByValue("1990");
            travellerInformationSection.getPassportNumberTextBox(i).setText("123456789");
            travellerInformationSection.getInsuranceDateSelectControl(i).selectByValue("1");
            travellerInformationSection.getInsuranceDaySelectControl(i).selectByValue("01");
            travellerInformationSection.getInsuranceYearSelectControl(i).selectByValue("2020");
            travellerInformationSection.getExpirationDateSelectControl(i).selectByValue("1");
            travellerInformationSection.getExpirationDaySelectControl(i).selectByValue("01");
            travellerInformationSection.getExpirationYearSelectControl(i).selectByValue("2025");
            Thread.sleep(1000);
            ScrollUtil.scrollBy(0, 500);
        }

        //Choose payment method
        paymentSection.paylaterButton.click();
        ScrollUtil.scrollBy(0, 1000);
        Thread.sleep(2000);

        //Accept terms and conditions
        paymentSection.termsAndConditionsButton.click();
        //Confirm booking
        paymentSection.confirmBookingButton.click();
        Thread.sleep(8000);


    }
}
