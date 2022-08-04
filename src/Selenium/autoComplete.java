package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class autoComplete {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.leafground.com/pages/autoComplete.html");

        WebElement textBox=driver.findElement(By.id("tags"));
        textBox.sendKeys("s");

        //I am used the explicit wait for this particular element because, These elements are takes time for present in DOM,
        //So that,I use the explicit wait method

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        List<WebElement> elements=wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy
        (By.xpath("//*[@id=\"wrapper\"]//following::ul[2]"),By.xpath("//*[@id=\"wrapper\"]//following::ul[2]//div")));

       for (WebElement webElement:elements)
       {
           if (webElement.getText().equals("Selenium"))
           {
               webElement.click();
               break;
           }
           else
           {
               System.out.println("it is not appear");
           }
       }
    }
}
