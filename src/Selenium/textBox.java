package Selenium;


import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class textBox {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.leafground.com/pages/Edit.html");

        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("alwin5177@gmail.com");

        WebElement append=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
        append.sendKeys(" "+"Alwin");

        WebElement getText=driver.findElement(By.name("username"));
        String getValue=getText.getAttribute("value");
        System.out.println("text value :"+getValue);

        WebElement clear=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
        clear.clear();

        WebElement disable=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
        if (disable.isEnabled())
        {
            System.out.println("The last TextBox is enabled");
        }
        else
        {
            System.out.println("The last TextBox is disabled");
        }

    }
}
