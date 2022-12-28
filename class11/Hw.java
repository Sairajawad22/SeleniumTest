package class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Hw {

        /*
        goto https://demo.guru99.com/test/simple_context_menu.html
right click  on the button, select edit and handle the alert
         */
        public static void main(String[] args) throws InterruptedException {
            //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
            // create a WebDriver instance
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
            driver.manage().window().maximize();
            //  go to the website
            driver.get("https://demo.guru99.com/test/simple_context_menu.html");
            // right-click on the button
            WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
            Actions actions=new Actions(driver);
            actions.contextClick(rightClick).perform();
            // select edit
            WebElement editBtn = driver.findElement(By.xpath("//span[text()='Edit']"));
            editBtn.click();
            // handle the alert
           Alert alert =driver.switchTo().alert();
            Thread.sleep(1000);
            alert.accept();
            // double-click the button
            WebElement doubleClickMe = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
           actions.doubleClick(doubleClickMe).perform();
            // handle the alert
            driver.switchTo().alert();
            Thread.sleep(1000);
            alert.accept();


}
}
