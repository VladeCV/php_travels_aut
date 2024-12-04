package page.hotels;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class InvoicePage {
    public Label payTitleLabel = new Label(By.xpath("//strong[text() = 'Pay With']"));
    public Button proceedButton = new Button(By.xpath("//input[@value = 'Proceed']"));
    public Label totalPriceInvoiceLabel = new Label(By.xpath("//h5//small[text() = 'USD']//following-sibling::strong"));
}
