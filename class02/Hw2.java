package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        // create a WebDriver instance

        WebDriver driver = new ChromeDriver();
        // go to fb.com
        driver.get("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Saira");
        driver.findElement(By.name("lastname")).sendKeys("Jawad");
        driver.findElement(By.name("reg_email__")).sendKeys("hfdffhgf@yahoo.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("hjsdg1234736");
        driver.findElement(By.id("month")).sendKeys("January");
        driver.findElement(By.id("day")).sendKeys("22");
        driver.findElement(By.id("year")).sendKeys("1995");
        driver.findElement(By.className("_58mt")).click();
        Thread.sleep(2000);

    }
}
