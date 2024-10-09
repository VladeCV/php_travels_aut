package page;

import control.TextBox;
import org.openqa.selenium.By;

public class SearchByCitySection {
    public TextBox searchCityTxtBox = new TextBox(By.xpath("//input[contains(@class, 'field')]"));
}
