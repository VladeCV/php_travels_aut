package page;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class BankInformationPage {
    public Label bankInformationLabel = new Label(By.xpath("//div[@class='card']"));
    public Button backToInvoiceButton = new Button(By.xpath("//div[@class='btn']"));
    public Button confirmButton = new Button(By.xpath("//a[@class='yes']"));
}
