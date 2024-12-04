package page.flights;

import control.SelectControl;
import control.TextBox;
import org.openqa.selenium.By;

public class PersonalInformationSection {
    public TextBox firstNameTextBox = new TextBox(By.xpath("//*[@id=\"fadein\"]//input[@name = \"user[first_name]\"]"));
    public TextBox lastNameTextBox = new TextBox(By.xpath("//*[@id=\"fadein\"]//input[@name = \"user[last_name]\"]"));
    public TextBox emailTextBox = new TextBox(By.xpath("//*[@id=\"fadein\"]//input[@name = \"user[email]\"]"));
    public TextBox phoneTextBox = new TextBox(By.xpath("//*[@id=\"fadein\"]//input[@name = \"user[phone]\"]"));
    public TextBox addressTextBox = new TextBox(By.xpath("//*[@id=\"fadein\"]//input[@name = \"user[address]\"]"));
    public SelectControl nationalitySelectControl = new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name = \"user[nationality]\"]"));

    public void selectNationality(String nation) {
        nationalitySelectControl.selectByValue(nation);
    }
}
