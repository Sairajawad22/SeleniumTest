package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrder {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class. On mac you don't need exe
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        // create a WebDriver instance

        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        // maximize the window
        driver.manage().window().maximize();
        // enter the Username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // enter the password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //click login
        driver.findElement(By.className("button")).click();
        // Make sure that title is correct i.e   Web Orders
        // get the tile of the page
        String title = driver.getTitle();

        if (title.equalsIgnoreCase("Web Orders")) {
            System.out.println("The title is correct :" + title);

        } else {
            System.out.println("The title is incorrect :"+ title);
        }
        driver.quit();
    }
}
