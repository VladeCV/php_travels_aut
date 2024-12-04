package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.flights.*;
import page.home.MenuSection;
import page.hotels.*;
import page.visa.SubmissionFormPage;
import page.visa.SubmittedPage;
import page.visa.VisaPage;
import session.Session;
import util.GetProperties;

import java.time.Duration;

public class TestBase {
    MenuSection menuSection = new MenuSection();
    HotelsPage hotelsPage = new HotelsPage();
    SearchByCitySection searchByCitySection = new SearchByCitySection();
    TravelersRoomsSection travelersRoomsSection = new TravelersRoomsSection();
    InfoHotelPage infoHotelPage = new InfoHotelPage();
    HotelBookingPage hotelBookingPage = new HotelBookingPage();
    InvoicePage invoicePage = new InvoicePage();
    BankInformationPage bankInformationPage = new BankInformationPage();
    SearchDestinySection searchDestinySection = new SearchDestinySection();
    SelectFlightSection selectFlightSection = new SelectFlightSection();
    PersonalInformationSection personalInformationSection = new PersonalInformationSection();
    TravellerInformationSection travellerInformationSection = new TravellerInformationSection();
    PaymentSection paymentSection = new PaymentSection();
    VisaPage visaPage = new VisaPage();
    SubmissionFormPage submissionFormPage = new SubmissionFormPage();
    SubmittedPage submittedPage = new SubmittedPage();
    InvoiceDetailsPage invoiceDetailsPage = new InvoiceDetailsPage();

    @BeforeEach
    public void setUp() {
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
        Session.getInstance().getBrowser().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    public void tearDown() {
        Session.getInstance().closeSession();
    }
}
