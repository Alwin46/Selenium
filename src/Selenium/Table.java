package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Table {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.leafground.com/pages/table.html");

       int tableCoilums=driver.findElements(By.xpath("//th")).size();
        System.out.println("table columns :"+tableCoilums);

       int tableRows=driver.findElements(By.xpath("//tr[1]//following::tr")).size();
        System.out.println("table Rows :"+tableRows);

       List<WebElement> LearnToInteractWithElements=driver.findElements
               (By.xpath("//*[contains(text(),\"Learn to\")]//following::td[1]"));

       for (WebElement webElement:LearnToInteractWithElements)
       {
           System.out.println("Learn to interact with Elements :"+webElement.getText());
       }

        ArrayList<Integer> list=new ArrayList<Integer>();

       List<WebElement> checkLeast=driver.findElements(By.xpath("//td[2]"));
       for (WebElement webElement1:checkLeast)
       {
          String values=webElement1.getText().replace("%","");
          list.add(Integer.parseInt(values));
       }

        System.out.println(list);
        int minValue=Collections.min(list);
        System.out.println("minimum value in these values :"+minValue);

        String finalMinVlaue=Integer.toString(minValue) + "%";
        System.out.println(finalMinVlaue);
        String finalLink= "//*[contains(text()," +"'"+ finalMinVlaue +"'"+ ")]//following::td[1]";

        WebElement clickMinNumber=driver.findElement(By.xpath(finalLink));
        clickMinNumber.click();

    }
}
