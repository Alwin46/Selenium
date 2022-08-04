package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class dropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.leafground.com/pages/Dropdown.html");

        WebElement DropDown1=driver.findElement(By.id("dropdown1"));
        Select select1=new Select(DropDown1);

        select1.selectByIndex(1);
        select1.selectByValue("3");
        select1.selectByVisibleText("Loadrunner");


        List<WebElement> getDropdowns=driver.findElements(By.xpath("//*[@id=\"dropdown1\"]//*"));
        int No_Of_Dropdowns=getDropdowns.size();
        System.out.println("size_of_dropdown :"+No_Of_Dropdowns);

        DropDown1.sendKeys("UFT/QTP");

        List<WebElement> SelectAll=driver.findElements
                (By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[1]//following::option"));

        for (WebElement webElement:SelectAll)
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
