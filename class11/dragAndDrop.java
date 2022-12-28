package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("https://jqueryui.com/droppable/");
        //        switch the focus to the iframe
        // there are 3 methods to switch to iframe 1)by index 2) by neme, class 3) by web elements
        driver.switchTo().frame(0);

//        dragable -> //div[@id='draggable']
        WebElement dragableElement = driver.findElement(By.xpath("//div[@id='draggable']"));

//        drop location -> //div[@id='droppable']
        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));

// use action class
        Actions action= new Actions(driver);

      // action.dragAndDrop(dragableElement,dropLocation).perform();
//        or u can use this also
        // .build method combine all the other methods together( chains methods together)
      action.clickAndHold(dragableElement).moveToElement(dropLocation).release().build().perform();

    }
    }
