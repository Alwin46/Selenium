package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class checkBox {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.leafground.com/pages/checkbox.html");

        WebElement checkBox1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
        checkBox1.click();

        WebElement checkBox2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
        if (checkBox2.isSelected())
        {
            System.out.println("checkBox2 is selected");
        }
        else
        {
            System.out.println("checkBox2 is not selected");
        }


        WebElement thirdCheckBox1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
        WebElement thirdCheckBox2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
        if (thirdCheckBox1.isSelected())
        {
            thirdCheckBox1.click();
        }
        else
        {
            thirdCheckBox2.click();
        }

       List <WebElement> CheckBox3=driver.findElements
               (By.xpath("//*[@id=\"contentblock\"]/section/div[4]/label//following::input"));

        for (WebElement webElement: CheckBox3)
        {
            if (webElement.isSelected())
            {
                System.out.println("it is selected");
            }

            else
            {
                webElement.click();
            }
        }

    }
}
