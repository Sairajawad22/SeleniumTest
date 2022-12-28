package myOwnPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class practice {
    public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // maximize screen
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        //        click on the button "change text to selenium webDriver"
        WebElement button1 = driver.findElement(By.xpath("//button[@id='populate-text']"));
        button1.click();

//        get the text Selenium WebDriver
        WebElement webDriverText = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
//        print out text on the screen
        System.out.println(webDriverText.getText());

    }
}
