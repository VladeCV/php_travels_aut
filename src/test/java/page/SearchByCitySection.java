package page;

import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class SearchByCitySection {
    public TextBox searchCityTxtBox = new TextBox(By.xpath("//input[contains(@class, 'field')]"));

    public Label getCityLocator(String city) {
      return new Label(By.xpath("//li[contains(text(), '"+city+"')]"));
    }
}
