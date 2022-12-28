package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hw2 {
    /*
    **HomeWork 2**
*Implicit wait**

1. goto https://syntaxprojects.com/dynamic-data-loading-demo.php

2. click on get New User
3. get the firstname  of user and print it on console
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // go to this url
        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");
        WebElement newUser = driver.findElement(By.xpath("//button[@id='save']"));
        newUser.click();
        WebElement nameText = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String text = nameText.getText();
        System.out.println("The first name is :"+text);
    }
}
