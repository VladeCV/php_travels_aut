package page;

import control.Label;
import org.openqa.selenium.By;

public class InvoiceDetailsPage {
    public Label bookingStatus = new Label(By.xpath("//*[@id=\"invoice\"]//span[contains(text(), \"unpaid\")]"));
    public Label bookingDate = new Label(By.xpath("//*[@id=\"invoice\"]/table[1]/tbody/tr/th[4]"));
    public Label airlineName = new Label(By.xpath("//*[@id=\"invoice\"]/div[2]/div[1]/div/div[2]/div/small[2]"));
    public Label dateOfFlight = new Label(By.xpath("//*[@id=\"invoice\"]/div[2]/div[2]/div/div[2]/div/div/span[1]"));

}
