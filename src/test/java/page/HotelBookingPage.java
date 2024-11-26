package page;

import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class HotelBookingPage {
    public TextBox firstNameTxtBox = new TextBox(By.xpath("//input[contains(@name, 'first_name')]"));
    public TextBox lastNameTxtBox = new TextBox(By.xpath("//input[contains(@name, 'last_name')]"));
    public TextBox emailTxtBox = new TextBox(By.xpath("//input[contains(@name, 'user[email]')]"));
    public TextBox phoneTxtBox = new TextBox(By.xpath("//input[contains(@name, 'user[phone]')]"));
    public TextBox addressTxtBox = new TextBox(By.xpath("//input[contains(@name, 'user[address]')]"));
    public Label currentCountryLabel = new Label(By.xpath("//select[contains(@name, 'user[nationality]')]//following-sibling::button"));
    public TextBox searchCountryTxtBox = new TextBox(By.xpath("//strong[contains(text(), 'Current Country')]//parent::label//following-sibling::div//input"));

    public Label selectCountryOfListLabel(String country) {
        return new Label(By.xpath("//strong[contains(text(), 'Current Country')]//parent::label//following-sibling::div//span[contains(text(), '"+country+"')]"));
    }
}
