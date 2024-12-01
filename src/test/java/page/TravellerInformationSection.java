package page;

import control.SelectControl;
import control.TextBox;
import org.openqa.selenium.By;

public class TravellerInformationSection {
    public TextBox firstNameTextBox = new TextBox(By.xpath("//*[@id=\"fadein\"]//input[@name=\"first_name_1\"]"));
    public TextBox lastNameTextBox = new TextBox(By.xpath("//*[@id=\"fadein\"]//input[@name=\"last_name_1\"]"));
    public SelectControl nationalitySelectControl = new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name= \"nationality_1\"]"));
    public SelectControl dayOfBirthSelectControl = new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name =\"dob_month_1\"]"));
    public SelectControl daySelectControl = new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name =\"dob_day_1\"]"));
    public SelectControl yearSelectControl = new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name =\"dob_year_1\"]"));
    public TextBox passportNumberTextBox = new TextBox(By.xpath("//*[@id=\"fadein\"]//input[@name=\"passport_1\"]"));

    public SelectControl insuranceDateSelectControl = new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name =\"passport_issuance_month_1\"]"));
    public SelectControl insuranceDaySelectControl = new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name =\"passport_issuance_day_1\"]"));
    public SelectControl insuranceYearSelectControl = new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name =\"passport_issuance_year_1\"]"));

    public SelectControl expirationDateSelectControl = new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name =\"passport_month_expiry_1\"]"));
    public SelectControl expirationDaySelectControl = new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name =\"passport_day_expiry_1\"]"));
    public SelectControl expirationYearSelectControl = new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name =\"passport_year_expiry_1\"]"));


    public TextBox getFirstNameTextBox(int passengerNumber) {
        return new TextBox(By.xpath("//*[@id=\"fadein\"]//input[@name=\"first_name_" + passengerNumber + "\"]"));
    }

    public TextBox getLastNameTextBox(int passengerNumber) {
        return new TextBox(By.xpath("//*[@id=\"fadein\"]//input[@name=\"last_name_" + passengerNumber + "\"]"));
    }

    public SelectControl getNationalitySelectControl(int passengerNumber) {
        return new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name=\"nationality_" + passengerNumber + "\"]"));
    }

    public SelectControl getDayOfBirthSelectControl(int passengerNumber) {
        return new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name=\"dob_month_" + passengerNumber + "\"]"));
    }

    public SelectControl getDaySelectControl(int passengerNumber) {
        return new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name=\"dob_day_" + passengerNumber + "\"]"));
    }

    public SelectControl getYearSelectControl(int passengerNumber) {
        return new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name=\"dob_year_" + passengerNumber + "\"]"));
    }

    public TextBox getPassportNumberTextBox(int passengerNumber) {
        return new TextBox(By.xpath("//*[@id=\"fadein\"]//input[@name=\"passport_" + passengerNumber + "\"]"));
    }

    public SelectControl getInsuranceDateSelectControl(int passengerNumber) {
        return new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name=\"passport_issuance_month_" + passengerNumber + "\"]"));
    }

    public SelectControl getInsuranceDaySelectControl(int passengerNumber) {
        return new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name=\"passport_issuance_day_" + passengerNumber + "\"]"));
    }

    public SelectControl getInsuranceYearSelectControl(int passengerNumber) {
        return new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name=\"passport_issuance_year_" + passengerNumber + "\"]"));
    }

    public SelectControl getExpirationDateSelectControl(int passengerNumber) {
        return new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name=\"passport_month_expiry_" + passengerNumber + "\"]"));
    }

    public SelectControl getExpirationDaySelectControl(int passengerNumber) {
        return new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name=\"passport_day_expiry_" + passengerNumber + "\"]"));
    }

    public SelectControl getExpirationYearSelectControl(int passengerNumber) {
        return new SelectControl(By.xpath("//*[@id=\"fadein\"]//select[@name=\"passport_year_expiry_" + passengerNumber + "\"]"));
    }

}