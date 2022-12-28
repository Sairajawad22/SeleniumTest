package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Hw1 {
    /*
    **HomeWork 1**
**WindowHandles**
1.goto
http://accounts.google.com/signup
2.click on help and privacy btn
3.click on community Button
4.goto gmail.com page and enter your username in form
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //open gmail.com signup page
        driver.get("http://accounts.google.com/signup");
        // click on help button
        WebElement helpButton = driver.findElement(By.xpath("//a[text()='Help']"));
        helpButton.click();
        // click on privacy button
        WebElement privacyButton = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyButton.click();
        String gmail = driver.getWindowHandle();// in order to avoid loop and use window handle later we store it in a variable
        // The focus of the drive is in the first page (gmail)
        //in order to move help page, we have to get all widows
        Set<String> allWinHandles = driver.getWindowHandles();
        // if we want to switch to help, we should have the title for help.We can get the title in help page from the DOM->head->title
        // The title of the desire page is Google Account Help
        // get all the window handles
        for (String handle : allWinHandles) {
            // switch the focus to the current handle from the list
            driver.switchTo().window(handle);
            // get the title of the window to which the driver has switched
            String title = driver.getTitle();
            //  compare if the title is of the help page(Google Account Help)
            if (title.equalsIgnoreCase("Google Account Help")) {
                System.out.println(title);
                break;
            }
        }
        // go to help page and click on the community btn
        WebElement comBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        comBtn.click();

        //goto gmail.com page and enter your username in form
        driver.switchTo().window(gmail);
        WebElement userNmae = driver.findElement(By.xpath("//input[@id='username']"));
        userNmae.sendKeys("Saira Jawad");
    }
}