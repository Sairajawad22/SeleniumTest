package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxDemo {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        // go to ebay.com
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        // maximize
        driver.manage().window().maximize();
        // find the check box
        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
        // click on it
        checkBox.click();

    }
}