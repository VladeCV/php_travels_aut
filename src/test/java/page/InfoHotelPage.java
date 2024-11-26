package page;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class InfoHotelPage {
    public Button bookNowButton = new Button(By.xpath("//button[@type = 'submit']"));

    public Label getNameHotelLabel(String nameHotel) {
        return new Label(By.xpath("//div[contains(@class, 'h4')]//strong[text() = '"+nameHotel+"']"));
    }
}

// Armani Hotel Dubai
