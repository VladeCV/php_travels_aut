package page;

import control.SelectControl;
import control.TextBox;
import org.openqa.selenium.By;

public class TravelersRoomsSection {
    public TextBox roomsNumberTxtBox = new TextBox(By.id("hotels_rooms"));
    public TextBox adultsNumberTxtBox = new TextBox(By.id("hotels_adults"));
    public TextBox childsNumberTxtBox = new TextBox(By.id("hotels_childs"));
    public SelectControl childAgeSelect = new SelectControl(By.xpath("//strong[text() = 'Child Age']//ancestor::p//following-sibling::div//select"));
    public SelectControl nationalitySelect = new SelectControl(By.id("nationality"));
}
