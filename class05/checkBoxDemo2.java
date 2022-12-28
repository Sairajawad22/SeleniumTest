package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxDemo2 {
        public static void main(String[] args) {
            // set the path to the driver to link it with our class
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
            // create a WebDriver instance
            WebDriver driver = new ChromeDriver();
            // go to syntaxprojects.com
            driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
            // maximize
            driver.manage().window().maximize();
            // find all the check boxes
            List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
            // traverse through list of checkboxes to find the desire one
            for(WebElement checkBox:checkboxes){
                // get the attribute value to check if this is the right option to select
                String optionName = checkBox.getAttribute("value");
//            if condition to make sure it is the right checkbox
                if(optionName.equalsIgnoreCase("Option-3")){
//                if passed click on it
                    checkBox.click();
                }
            }
            }
        }
