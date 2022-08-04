package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Window
{
    public static void main(String[] args)
    {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.leafground.com/pages/Window.html");

        String oldWindow=driver.getWindowHandle();

        WebElement window1=driver.findElement(By.id("home"));
        window1.click();

        Set<String> newWindow1=driver.getWindowHandles();

        for (String allWindow1:newWindow1)
        {
            if (!allWindow1.equals(oldWindow))
            {
                driver.switchTo().window(allWindow1);
                WebElement edit=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
                edit.click();

                WebElement email=driver.findElement(By.id("email"));
                email.sendKeys("alwin5177@gmail.com");

                WebElement append=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
                append.sendKeys(" "+"Alwin");

                WebElement getText=driver.findElement(By.name("username"));
                System.out.println("textValue :"+getText.getAttribute("value"));

                WebElement clear=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
                clear.clear();

                driver.close();
                driver.switchTo().window(oldWindow);

            }

        }

        WebElement window2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
        window2.click();

        Set<String> newWindow2=driver.getWindowHandles();
        System.out.println("NO_OF_windows :"+newWindow2.size());

        for (String allWindow2:newWindow2)
        {
            if (!allWindow2.equals(oldWindow))
            {
                driver.switchTo().window(allWindow2);
                driver.close();
                driver.switchTo().window(oldWindow);
            }
        }

        WebElement window3=driver.findElement(By.xpath("//*[@id=\"color\"]"));
        window3.click();

        Set<String> newWindow3=driver.getWindowHandles();

        for (String allWindows3:newWindow3)
        {
            if (!allWindows3.equals(oldWindow))
            {
                driver.switchTo().window(allWindows3);
                driver.close();
                driver.switchTo().window(oldWindow);
            }
        }

    }
}
