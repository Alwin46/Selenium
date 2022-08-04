package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;


public class sortable {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.leafground.com/pages/sortable.html");

        List<WebElement> sortables=driver.findElements(By.xpath("//*[@id=\"sortable\"]//following::li"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(sortables.get(4))
                .moveToElement(sortables.get(2))
                .release().build().perform();

    }
}
