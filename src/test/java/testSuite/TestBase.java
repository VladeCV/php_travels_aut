package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.HotelsPage;
import page.MenuSection;
import page.SearchByCitySection;
import page.TravelersRoomsSection;
import session.Session;
import util.GetProperties;

import java.time.Duration;

public class TestBase {
    MenuSection menuSection = new MenuSection();
    HotelsPage hotelsPage = new HotelsPage();
    SearchByCitySection searchByCitySection = new SearchByCitySection();
    TravelersRoomsSection travelersRoomsSection = new TravelersRoomsSection();

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
