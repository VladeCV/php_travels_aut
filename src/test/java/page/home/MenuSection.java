package page.home;

import control.Label;
import enums.MenuOption;
import org.openqa.selenium.By;

public class MenuSection {
    public Label getMenuOptionLocator(MenuOption menuOption) {
        return new Label(By.linkText(menuOption.getMenuOption()));
    }
}
