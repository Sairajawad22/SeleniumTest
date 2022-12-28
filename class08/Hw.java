package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
/*
go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
 */

public class Hw {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // maximize screen
        driver.manage().window().maximize();
        //  Go to the website https://the-internet.herokuapp.com/dynamic_controls
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        // click on checkbox
        WebElement checkBtn = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBtn.click();
        //click on remove
        WebElement removeBtn = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeBtn.click();
        // verify the text
        WebElement text= driver.findElement(By.xpath("//p[@id='message']"));
        String verifyText1 = text.getText();
        if(verifyText1.equalsIgnoreCase("It's gone!")){
            System.out.println("The text is :"+verifyText1);
        }else {
            System.out.println("There is no text such as the text is gone");
        }

        //3) click on enable verify the textbox is enabled
        WebElement enableBtn = driver.findElement(By.xpath("//button[text()='Enable']"));
        enableBtn.click();
        WebElement text2 = driver.findElement(By.xpath("//p[@id='message']"));
        String verifyText2 = text2.getText();
    if(verifyText2.equalsIgnoreCase("It's enabled!")){
    System.out.println("The text is :"+verifyText2);

    }else{
        System.out.println("There is no text such as enable text");
    }
    //enter text and click disable
        WebElement enterText = driver.findElement(By.xpath("//input[@type='text']"));
        enterText.sendKeys("Hello");
        WebElement disableBtn = driver.findElement(By.xpath("//button[text()='Disable']"));
        disableBtn.click();

        //verify the textbox is disabled
        WebElement disableText = driver.findElement(By.xpath("//p[@id='message']"));
        String disable = disableText.getText();
        if(disable.equalsIgnoreCase("It's disabled!")){
            System.out.println("The text is "+disable);
        }else{
            System.out.println("There is no text such as disable ");
        }
}
 }
