package page;

import control.Button;
import control.SelectControl;
import control.TextBox;
import org.openqa.selenium.By;

public class SearchDestinySection {
    public Button oneWayButton = new Button(By.xpath("//*[@id=\"flights-search\"]//label[@for = \"one-way\"]"));
    public Button roundTripButton = new Button(By.xpath("//*[@id=\"flights-search\"]//label[@for = \"round-trip\"]"));
    public Button flyFromButton = new Button(By.xpath("//*[@id=\"onereturn\"]//label[contains(text(), 'Flying From')]"));
    public Button flyToButton = new Button(By.xpath("//*[@id=\"onereturn\"]//label[contains(text(), 'Destination To')]"));
    public Button travellersButton = new Button(By.xpath("//*[@id=\"onereturn\"]//span[@class = \"guest_flights\"]"));
    public Button childCountButton = new Button(By.xpath("//*[@id=\"onereturn\"]//div[@class = \"dropdown-item child_qty\"]//div[@class = \"qtyInc\"]"));
    public SelectControl flightTypeSelect = new SelectControl(By.id("flight_type"));
    public TextBox departureDateTxtBox = new TextBox(By.id("departure"));
    public TextBox returnDateTxtBox = new TextBox(By.id("return_date"));

    public void selectFlightType(String flightType) {
        flightTypeSelect.selectByValue(flightType);
    }

    public void setDepartureDate(String departureDate) {
        departureDateTxtBox.setText(departureDate);
    }

    public void setReturnDate(String returnDate) {
        returnDateTxtBox.setText(returnDate);
    }
}
