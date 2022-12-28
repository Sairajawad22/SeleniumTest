package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw1 {
    /*
    HW:
goto https://chercher.tech/practice/frames

1.check the checkBox
2.Select BabyCat from drop dwon
3. Send text in text box "DONE"
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");


        //Part1:- check the checkBox
        driver.switchTo().frame(0);
        WebElement subFrame = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(subFrame);
        WebElement chekBox = driver.findElement(By.xpath("//input[@id='a']"));
        chekBox.click();
        //Part2:-Select BabyCat from dropdown
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
        dropDown.click();
        Select select =new Select(dropDown);
        select.selectByValue("babycat");
        //Part3:-Send text in text box "DONE"
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.xpath("//input"));
        text.sendKeys("Done");

    }
}
