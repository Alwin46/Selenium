package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class selectable {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.leafground.com/pages/selectable.html");

        List<WebElement> selectables = driver.findElements(By.xpath("//*[@id=\"selectable\"]//following::li"));
        Actions actions = new Actions(driver);

        //This is one way for these selectable elements

       /* actions.clickAndHold(selectables.get(0))
                .clickAndHold(selectables.get(1))
                .clickAndHold(selectables.get(2))
                .clickAndHold(selectables.get(3))
                .clickAndHold(selectables.get(4))
                .clickAndHold(selectables.get(5))
                .build().perform();*/

        //And this is the another way for interact with selectable elements
        actions.keyDown(Keys.CONTROL)
                .click(selectables.get(0))
                .click(selectables.get(1))
                .click(selectables.get(2))
                .build().perform();

    }
}
