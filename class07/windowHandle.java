package class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // task: go to gmail signup and get the window handle
        // go to gmail sign up page

        driver.get("http://accounts.google.com/signup");

        //get the window handle for the current page

        String gmailHandle = driver.getWindowHandle();// return only one window. it returns gmail.com code only.
        // The code that we get from goole is unique for everyone and is unique for every section.
        // the code is dynamic to save memory

        // print this on screen

        System.out.println("The handle of the current page is :"+gmailHandle);


    }
    }
