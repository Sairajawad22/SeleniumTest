package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw {
    /*
    Click on start practicing
     click on simple form demo
     enter any text on first text box
     click on show message
     quit the browser
     */
        public static void main(String[] args) throws InterruptedException {

            // set the path to the driver to link it with our class. On mac you don't need exe
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
            // create a WebDriver instance

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(" http://syntaxprojects.com/");
            driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//a[contains(@class,'list')]")).click();
            driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[contains(text(),'Show')]")).click();
           // driver.quit();
        }
    }