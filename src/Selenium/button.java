package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class button {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("http://www.leafground.com/pages/Button.html");

        WebElement button1=driver.findElement(By.id("home"));
        button1.click();
        driver.navigate().back();

        WebElement button2=driver.findElement(By.id("position"));
        Point point=button2.getLocation();
        int Y=point.getY();
        int X=point.getX();

        System.out.println("Y :"+Y);
        System.out.println("X :"+X);

        WebElement button3=driver.findElement(By.id("color"));
        String color=button3.getCssValue("background-color");
        System.out.println("button Color :"+color);

        WebElement button4=driver.findElement(By.id("size"));
        int height=button4.getSize().getHeight();
        int weight=button4.getSize().getWidth();

        System.out.println("height :"+height);
        System.out.println("weight :"+weight);

    }
}
