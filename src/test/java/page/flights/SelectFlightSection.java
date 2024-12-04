package page.flights;

import control.Button;
import control.UnorderedList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectFlightSection {
    public Button emiratesAirlineButton = new Button(By.xpath("//*[@id=\"oneway_flights_1\"]"));
    public Button directFlightButton = new Button(By.xpath("//*[@id=\"direct\"]"));
    public Button highToLowButton = new Button(By.xpath("//*[@id=\"data\"]//button[@data-value = \"desc\"]"));
    public UnorderedList flightList = new UnorderedList(By.xpath("//*[@id=\"flight--list-targets\"]"));
    public Button topFlightButton = new Button(By.xpath("//*[@id=\"flight--list-targets\"]/li[1]//div/button[2]"));

    public List<WebElement> getFlightList() {
        flightList.find();
        return flightList.getWebElement().findElements(By.tagName("li"));
    }

}
