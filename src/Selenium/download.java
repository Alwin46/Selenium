package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class download {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.leafground.com/pages/download.html");

        WebElement download = driver.findElement(By.linkText("Download Excel"));
        download.click();
        //These three Download linkText is not working as expected,I think it is a bug/defect
        //So ,I get the already downloaded file in my system downloads ,because I show some example for downloading and verifying
        //with selenium

        File file = new File("C:\\Users\\LENOVO\\Downloads");
        File[] getFiles = file.listFiles();

        for (File file1 : getFiles)
        {
            if (file1.getName().equals("chromedriver_win32"))
            {
                System.out.println("File is appear in downloads");
                break;
            }

            //I am not use the else statement,because,listFiles method can get all files from downloads
            // if I mention the else statement then the compiler through the else statement until then for that particular file

        }
    }
}


