package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.ScrollUtil;

import static enums.MenuOption.VISA;

public class VisaTest extends TestBase {
    @Test
    public void verifyVisaRegister() throws InterruptedException {
        menuSection.getMenuOptionLocator(VISA).click();
        Thread.sleep(1000);
        visaPage.fromCountryLabel.click();
        visaPage.fromCountryTextBox.setText("Bolivia");
        visaPage.getCityLocator("Bolivia").waitVisibility(5).click();
        visaPage.toCountryLabel.click();
        visaPage.toCountryTextBox.setText("Spain");
        visaPage.getCityLocator("Spain").waitVisibility(5).click();
//        visaPage.dateLabel.click();
//        visaPage.selectDate("05", "12", "2024");
        visaPage.searchButton.click();

        // Submission Form Page
        submissionFormPage.firstNameTextBox.setText("Gerson");
        submissionFormPage.lastNameTextBox.setText("Andrade");
        submissionFormPage.emailTextBox.setText("prueba@gmail.com");
        submissionFormPage.phoneTextBox.setText("78945612");
        submissionFormPage.numberOfDayTextBox.setText("25");
        submissionFormPage.dateTextBox.setText("05-12-2024");
        submissionFormPage.submissionFormLabel.click();
        submissionFormPage.entryTypeSelect.selectByValue("multiple");
        submissionFormPage.visaTypeSelect.selectByValue("family_visit");
        submissionFormPage.notesTextBox.setText("Aplicacion de visa");
        ScrollUtil.scrollBy(0, 500);
        Thread.sleep(1000);
        ScrollUtil.scrollToElement(submissionFormPage.submitButton);
        submissionFormPage.submitButton.click();


        Assertions.assertEquals("Submitted", submittedPage.finalMessage.waitVisibility(10).getText(), "The process had errors");

    }
}
