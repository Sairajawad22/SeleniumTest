package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Bilal");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.lastName")).sendKeys("Jawad");
        driver.findElement(By.name("customer.address.street")).sendKeys("5501 Seminary rd");
        driver.findElement(By.name("customer.address.city")).sendKeys("Falls Church");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("22041");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("36472638263");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.ssn")).sendKeys("7463864");
        driver.findElement(By.name("customer.username")).sendKeys("SJ5463");
        driver.findElement(By.name("customer.password")).sendKeys("gdty4637");
        driver.findElement(By.name("repeatedPassword")).sendKeys("gdty4637");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.quit();


    }
}
