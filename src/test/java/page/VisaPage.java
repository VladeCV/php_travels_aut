package page;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class VisaPage {
    public Label fromCountryLabel = new Label(By.xpath("//select[contains(@class, 'visa_from')]//following-sibling::span//b[contains(@role, 'presentation')]"));
    public TextBox fromCountryTextBox = new TextBox(By.xpath("//input[@class = 'select2-search__field']"));
    public Label toCountryLabel = new Label(By.xpath("//select[contains(@class, 'visa_to')]//following-sibling::span//b[contains(@role, 'presentation')]"));
    public TextBox toCountryTextBox = new TextBox(By.xpath("//input[@class = 'select2-search__field']"));
    public Label dateLabel = new Label(By.id("date"));
    public Button searchButton = new Button(By.xpath("//button[@type='submit']"));

    public Label getCityLocator(String city) {
        return new Label(By.xpath("//li[contains(text(), '"+city+"')]"));
    }

    public void selectDate(String day, String month, String year) {

    }
}
