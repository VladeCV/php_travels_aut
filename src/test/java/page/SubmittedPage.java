package page;

import control.TextBox;
import org.openqa.selenium.By;

public class SubmittedPage {
    public TextBox finalMessage = new TextBox(By.xpath("//h2[contains(@class, 'sec__title')]//strong"));
}
