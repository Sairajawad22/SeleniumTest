package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class Hw3 {
    /*
    HomeWork3: (do not use thread .sleep  or Explicit wait)
1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
2.Click on start button
3. get the text Welcome Syntax technologies and print on console

the text will be Empty

write down  whatever the reason you understand  of text being empty after exploring DOM
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        // click on the start button
        WebElement startBtn = driver.findElement(By.id("startButton"));
        startBtn.click();
        // find the text
        WebElement welcomeText = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text = welcomeText.getText();
        System.out.println("The text is :"+text);
        /* The reason we don't get anything in the console is that there is no synchronization between DOM and the UI. For example,
 the element was found in DOM while it was not display the UI.
*/

    }
}
