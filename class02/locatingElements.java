package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) throws InterruptedException {

        //  got to Fb.com
        // Enter Username
        // Enter Password
        //click login
        // set the path to the driver to link it with our class. On mac you don't need exe
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        // create a WebDriver instance

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // go to fb.com
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        // Maximize the window
        driver.manage().window().maximize();
        // inter the Username in the TextBox
        //1. locate the element and send the keys
        driver.findElement(By.id("email")).sendKeys("abracadbara");

// enter the password in the TextBox
        driver.findElement(By.name("pass")).sendKeys("waow12345678");
//it is working now check it once once pleaase
        //click the login
        driver.findElement(By.name("login")).click();

        // for the following task to work please make sure that you comment the login functionality
        //Task 2
        // click on forgot password
        //  driver.findElement(By.linkText("Forgot password?")).click();

        // for the following task to work please make sure that you comment the task2 and login functionality
        // Task3
        // click on forgot password using Partial linkText locator
        //  driver.findElement(By.partialLinkText("Forgot")).click();

    }
}
