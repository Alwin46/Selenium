package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.time.Duration;

public class images {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("http://www.leafground.com/pages/Image.html");

        WebElement image1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
        image1.click();
        driver.navigate().back();

        WebElement image2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
        if (image2.getAttribute("naturalWidth").equals("0"))
        {
            System.out.println("it is broken image");
        }
        else
        {
            System.out.println("it is not a broken image");
        }

        WebElement image3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img"));

        Actions actions=new Actions(driver);
        actions.moveToElement(image3)
                .click(image3)
                .build().perform();

        driver.navigate().back();

    }
}
