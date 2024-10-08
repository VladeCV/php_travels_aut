package page;

import control.Label;
import org.openqa.selenium.By;

public class MenuSection {
    public Label menuOption(String menuOption) {
        return new Label(By.linkText("menuOption"));
    }
}
