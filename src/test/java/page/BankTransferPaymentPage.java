package page;

import control.Button;
import control.Control;
import org.openqa.selenium.By;

public class BankTransferPaymentPage {
    public Control iframePaypal = new Control(By.xpath("//iframe[@title='PayPal']"));
    public Button paypalButton = new Button(By.xpath("//div[@data-funding-source='paypal']"));
}
