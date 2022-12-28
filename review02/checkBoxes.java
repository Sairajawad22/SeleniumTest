package review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        // create a WebDriver instance

        WebDriver driver = new ChromeDriver();
// open the url
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        // find the checkBox
        List<WebElement> checkbxes = driver.findElements(By.xpath("//input[@name='color']"));
        // what does this list conatians
        //        it contains all the 6 webelements
        for(WebElement checkbx:checkbxes){
            String color = checkbx.getAttribute("value");
            if(color.equalsIgnoreCase("blue"));
            checkbx.click();
            break;
        }
    }
}