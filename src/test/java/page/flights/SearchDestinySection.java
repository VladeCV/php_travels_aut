package page.flights;

import control.Button;
import control.SelectControl;
import control.TextBox;
import org.openqa.selenium.By;

public class SearchDestinySection {
    public Button oneWayButton = new Button(By.xpath("//*[@id=\"flights-search\"]//label[@for = \"one-way\"]"));
    public Button roundTripButton = new Button(By.xpath("//*[@id=\"flights-search\"]//label[@for = \"round-trip\"]"));
    public Button flyFromButton = new Button(By.xpath("//*[@id=\"onereturn\"]/div[1]/div[1]"));
    public Button flyToButton = new Button(By.xpath("//*[@id=\"onereturn\"]/div[2]/div[2]"));
    public SelectControl flyFromSelect = new SelectControl(By.xpath("//*[@id=\"onereturn\"]/div[1]/div[1]"));
    public SelectControl flyToSelect = new SelectControl(By.xpath("//*[@id=\"onereturn\"]/div[2]/div[2]"));
    public Button travellersButton = new Button(By.xpath("//*[@id=\"onereturn\"]//span[@class = \"guest_flights\"]"));
    public Button childCountButton = new Button(By.xpath("//*[@id=\"onereturn\"]//div[@class = \"dropdown-item child_qty\"]//div[@class = \"qtyInc\"]"));
    public SelectControl flightTypeSelect = new SelectControl(By.id("flight_type"));
    public TextBox departureDateTxtBox = new TextBox(By.id("departure"));
    public TextBox returnDateTxtBox = new TextBox(By.id("return_date"));
    public TextBox searchDestinyTxtBox = new TextBox(By.xpath("//*[@id=\"fadein\"]//input[@class = \"select2-search__field\"]"));
    public Button searchButton = new Button(By.xpath("//button[@id=\"flights-search\"]"));

    public void selectFlightType(String flightType) {
        flightTypeSelect.selectByValue(flightType);
    }

    public void setDepartureDate(String departureDate) {
        departureDateTxtBox.setText(departureDate);
    }

    public void setReturnDate(String returnDate) {
        returnDateTxtBox.setText(returnDate);
    }

    public void selectFlyFrom(String flyFrom) {
        flyFromSelect.selectByValue(flyFrom);
    }

    public void selectFlyTo(String flyTo) {
        flyToSelect.selectByValue(flyTo);
    }

    public void searchDestiny(String destiny) {
        searchDestinyTxtBox.setText(destiny);
    }

    public void clickSearchedDestiny(String destiny) {
        new Button(By.xpath("//*[@id=\"select2--results\"]//small[contains(text(), '" + destiny + "')]")).click();
    }

}
