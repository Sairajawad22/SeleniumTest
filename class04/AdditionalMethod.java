package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethod {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //        goto syntaxProject.com radio button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
       // find the webElement button
        WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));
        // get the text from btn webelement
        String text= btn.getText();
        // print it on consol
        System.out.println("The text in the button is :"+text);
        // get the value of the attribute "id" from this webelement
        String idValue = btn.getAttribute("id");
        //print it on console
        System.out.println("The value of the attribute is :"+idValue);
    }
}