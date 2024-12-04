package page.flights;

import control.Button;
import org.openqa.selenium.By;

public class PaymentSection {
    public Button paypalButton = new Button(By.xpath("//*[@id=\"gateway_paypal\"]"));

    public Button paylaterButton = new Button(By.xpath("//*[@id=\"gateway_pay_later\"]"));

    public Button bankTransferButton = new Button(By.xpath("//*[@id=\"gateway_bank_transfer\"]"));

    public Button termsAndConditionsButton = new Button(By.xpath("//*[@id=\"agreechb\"]"));

    public Button confirmBookingButton = new Button(By.xpath("//*[@id=\"booking\"]"));


}
