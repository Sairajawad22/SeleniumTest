package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        // create a WebDriver instance

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://syntaxprojects.com/basic-first-form-demo.php");

        // get the webElement text box
       // driver.findElement(By.cssSelector("input[placeholder*='Please enter']")).sendKeys("Abshddfjfj");
        // another method of doing the above operation
        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder*='Please enter']"));
        textBox.sendKeys("Abshddfjfj");
        // press the button to show mag
        WebElement button = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        button.click();
    }
}
