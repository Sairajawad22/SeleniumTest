package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class wait {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
    // create a WebDriver instance
    WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
// go to facebook.com
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        // click on the start button
        WebElement startBtn = driver.findElement(By.id("startButton"));
        startBtn.click();
        // find the text
        WebElement welcomeText = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text = welcomeText.getText();
        System.out.println("The text is :"+text);
/* The reason we don't get anything in the console is that after the element is found the implicit waite is not waiting for 20 seconds
In this example the element was found in DOM while THE ELEMENT WAS NOT DISPLAY in the UI, In the DOM we got
the massage that display is none that is why we get empty in the console.
Or in simple word we found the text in DOM before it appeared in UI.

In such a scenario the implicit wait is not working because the DOM and the UI are not synchronised with each other
*/

        // implicit waite is going to waite until the element is found
}
}