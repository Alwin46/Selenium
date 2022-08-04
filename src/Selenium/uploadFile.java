package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class uploadFile {

    public static void main(String[] args) throws AWTException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.leafground.com/pages/upload.html");

     /*   This uploadButton is doesn't present in DOM properly,it is not to be clickable for selenium ,so I do this way to
         interact with this upload button

        *resolution

        why this bug is affected the button?

        *it required performance and load testing,if we finish these testing then maybe it works properly */

        WebElement uploadButton=driver.findElement(By.name("filename"));
        Actions actions=new Actions(driver);
        actions.moveToElement(uploadButton)
                .click(uploadButton)
                .build().perform();

        StringSelection selection=new StringSelection("D:\\THOR46\\my dreams\\images (3).jpeg");
        Toolkit.getDefaultToolkit().getSystemClipboard().getContents(selection);

        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);



    }
}
