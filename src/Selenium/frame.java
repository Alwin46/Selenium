package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.List;

public class frame {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.leafground.com/pages/frame.html");

        driver.switchTo().frame(0);
        WebElement frame1=driver.findElement(By.id("Click"));
        frame1.click();
        System.out.println("findFrame1 :"+frame1.getText());
        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");
        WebElement frame2=driver.findElement(By.id("Click1"));
        frame2.click();
        driver.switchTo().defaultContent();

        List <WebElement> frame3=driver.findElements(By.tagName("iframe"));
        System.out.println("No_Of_frames :"+frame3.size());


    }
}
