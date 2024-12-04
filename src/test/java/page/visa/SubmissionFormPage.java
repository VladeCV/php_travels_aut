package page.visa;

import control.Button;
import control.Label;
import control.SelectControl;
import control.TextBox;
import org.openqa.selenium.By;

public class SubmissionFormPage {
    public Label submissionFormLabel = new Label(By.xpath("//div[contains(text(), 'Submission Form')]"));
    public TextBox firstNameTextBox = new TextBox(By.name("first_name"));
    public TextBox lastNameTextBox = new TextBox(By.name("last_name"));
    public TextBox emailTextBox = new TextBox(By.name("email"));
    public TextBox phoneTextBox = new TextBox(By.name("phone"));
    public TextBox numberOfDayTextBox = new TextBox(By.name("number_of_days"));
    public TextBox dateTextBox = new TextBox(By.name("date"));
    public SelectControl entryTypeSelect = new SelectControl(By.name("entry_type"));
    public SelectControl visaTypeSelect = new SelectControl(By.name("visa_type"));
    public TextBox notesTextBox = new TextBox(By.name("notes"));
    public Button submitButton = new Button(By.id("submit"));
}
