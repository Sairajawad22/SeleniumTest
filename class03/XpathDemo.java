package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {

        // set the path to the driver to link it with our class. On mac you don't need exe
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        // create a WebDriver instance

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // go to fb.com
        driver.get("https://www.facebook.com/");
        /*
         Enter Username
         1.-----Xpath to identify by attribute------
         Syntax.  tagname[@attribute='attribute value']
         */
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abracadaba");

       // driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Abcd1324");
        /*
         click on forgot password
         2.-----Xpath to identify by text------
          tagname[text() = 'text value']
         */

        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
        /*
        3.----Xpath to identify by contains Method------

         ****for attributes****
       tagname[contains(@attribute, 'partial attribute value')]
         */
////button[contains(@type,'sub')]
    }
}
