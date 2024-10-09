package page;

import control.Button;
import control.Label;
import control.SelectControl;
import control.TextBox;
import org.openqa.selenium.By;

public class HotelsPage {
    public Label searchByCityLabel = new Label(By.xpath("//b[contains(@role, 'presentation')]"));
    public TextBox checkinTxtBox = new TextBox(By.id("checkin"));
    public TextBox checkoutTxtBox = new TextBox(By.id("checkout"));
    public Label travelersRoomsLabel = new Label(By.xpath("//a[@data-toggle = 'dropdown']"));
    public Button searchButton = new Button(By.xpath("//button[@type = 'submit']"));
}
