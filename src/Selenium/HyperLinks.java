package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HyperLinks{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.leafground.com/pages/Link.html");

        WebElement link1=driver.findElement(By.linkText("Go to Home Page"));
        link1.click();
        driver.navigate().back();

        WebElement link2=driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
        System.out.println("when we click the link2 then it is redirecting to :"+link2.getAttribute("href"));

        WebElement link3=driver.findElement(By.linkText("Verify am I broken?"));
        link3.click();

        if (driver.getTitle().contains("404"))
        {
            System.out.println("it is broken link ");
        }
        else
        {
            System.out.println("it is not broken link");
        }

        driver.navigate().back();

        int links=driver.findElements(By.tagName("a")).size();
        System.out.println("no_Of_Links :"+links);

    }
        }
