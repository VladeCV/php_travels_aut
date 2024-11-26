package page;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class HotelsPage {
    public Label searchByCityLabel = new Label(By.xpath("//b[contains(@role, 'presentation')]"));
    public TextBox checkinTxtBox = new TextBox(By.id("checkin"));
    public TextBox checkoutTxtBox = new TextBox(By.id("checkout"));
    public Label travelersRoomsLabel = new Label(By.xpath("//a[@data-toggle = 'dropdown']"));
    public Button searchButton = new Button(By.xpath("//button[@type = 'submit']"));

    public Button getViewMoreHotelButton(String nameHotel) {
        return new Button(By.xpath("//strong[text() = '"+nameHotel+"']//parent::h5//parent::div//parent::div//following-sibling::div//a[contains(text(), 'View More')]"));
    }
}
