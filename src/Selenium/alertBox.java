package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class alertBox {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.leafground.com/pages/Alert.html");

        WebElement alertBox1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
        alertBox1.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement alertBox2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
        alertBox2.click();
        alert=driver.switchTo().alert();
        alert.accept();

        WebElement alertBox3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
        alertBox3.click();
        alert=driver.switchTo().alert();
        alert.sendKeys(" "+"Alwin ok");
        alert.accept();

        WebElement alertBox4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/button"));
        alertBox4.click();
        alert=driver.switchTo().alert();
        alert.accept();

    }
}
