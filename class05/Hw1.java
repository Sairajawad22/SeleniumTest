package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    /*
    HW1
1.Go to facebook
2.click on create New Account
3.Fill out the whole form
4.Take screen shot of filled out form manually and share in HW channel along with code
     */
    public static void main(String[] args) throws InterruptedException {
        // set the path to the driver to link it with our class. On mac you don't need exe
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        // create a WebDriver instance

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // go to fb.com
        driver.get("https://www.facebook.com/");
        // Maximize the window
        driver.manage().window().maximize();
        //click on create New Account
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(2000);
        WebElement name = driver.findElement(By.name("firstname"));
         name.sendKeys("Bilal");
        Thread.sleep(2000);
        WebElement lastName = driver.findElement(By.name("lastname"));
       lastName.sendKeys("Jawad");
        Thread.sleep(2000);
        WebElement userEmail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        userEmail.sendKeys("bilaljawad12@gmail.com");
        Thread.sleep(2000);
        WebElement userConformEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        userConformEmail.sendKeys("bilaljawad12@gmail.com");
        Thread.sleep(2000);
        WebElement userPassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        userPassword.sendKeys("Abracdajhd12");
        Thread.sleep(2000);
        WebElement userBirthayMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        userBirthayMonth.sendKeys("Jan");
        Thread.sleep(2000);
        WebElement uerBirthDay = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        uerBirthDay.sendKeys("15");
        Thread.sleep(2000);
        WebElement userBirthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        userBirthYear.sendKeys("2000");
        WebElement userGender = driver.findElement(By.xpath("//label[text()='Male']"));
        Thread.sleep(2000);
        userGender.click();


    }
}
