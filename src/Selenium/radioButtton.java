package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class radioButtton {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.leafground.com/pages/radio.html");

        WebElement radioButton1=driver.findElement(By.id("yes"));
        radioButton1.click();

        WebElement radioButton2=driver.findElement(By.name("news"));
        if (radioButton2.isSelected())
        {
            System.out.println("first radio button is enabled");
        }
        else
        {
            System.out.println("Second radio button is enabled");
        }

        WebElement radioButton3=driver.findElement(By.name("age"));
        radioButton3.click();
    }
}
