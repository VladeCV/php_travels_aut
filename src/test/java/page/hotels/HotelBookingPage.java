package page.hotels;

import control.*;
import org.openqa.selenium.By;

public class HotelBookingPage {
    public TextBox firstNameTxtBox = new TextBox(By.xpath("//input[contains(@name, 'first_name')]"));
    public TextBox lastNameTxtBox = new TextBox(By.xpath("//input[contains(@name, 'last_name')]"));
    public TextBox emailTxtBox = new TextBox(By.xpath("//input[contains(@name, 'user[email]')]"));
    public TextBox phoneTxtBox = new TextBox(By.xpath("//input[contains(@name, 'user[phone]')]"));
    public TextBox addressTxtBox = new TextBox(By.xpath("//input[contains(@name, 'user[address]')]"));
    public Label currentCountryLabel = new Label(By.xpath("//select[contains(@name, 'user[country_code]')]//following-sibling::button"));
    public TextBox searchCountryTxtBox = new TextBox(By.xpath("//strong[contains(text(), 'Current Country')]//parent::label//following-sibling::div//input"));
    public Label paymentMethodsLabel = new Label(By.xpath("//h3[text() = 'Payment Methods']"));
    public CheckBox agreeTermsConditionCheckBox = new CheckBox(By.id("agreechb"));
    public Button bookingConfirmButton = new Button(By.id("booking"));
    public Label totalPriceLabel = new Label(By.name("total_price"));

    public void selectTitle(int index, String title) {
        SelectControl titleLabel = new SelectControl(By.xpath("//select[@name = 'title_"+index+"']"));
        titleLabel.selectByValue(title);
    }

    public TextBox firstNameTraveler(int index) {
        return new TextBox(By.xpath("//input[@name = 'firstname_"+index+"']"));
    }

    public TextBox lastNameTraveler(int index) {
        return new TextBox(By.xpath("//input[@name = 'lastname_"+index+"']"));
    }

    public Button selectPaymentMethods(String paymentMethod) {
        return new Button(By.xpath("//strong[contains(text(), '"+paymentMethod.toLowerCase()+"')]//parent::span//ancestor::div[@id = 'pills-home-tab']"));
    }
}
