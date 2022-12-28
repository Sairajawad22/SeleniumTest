package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hw2 {
    /*
    HW2
1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title
     */
    public static void main(String[] args) {
        // set the path to the driver to link it with our class. On mac you don't need exe
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        // create a WebDriver instance

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // go to ebay.com
        driver.get("https://www.ebay.com/");
        // Maximize the window
        driver.manage().window().maximize();
        WebElement ebayWebsite = driver.findElement(By.xpath("//select[@name='_sacat']"));
        Select select = new Select(ebayWebsite);
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            WebElement option = options.get(i);
            String text = option.getText();
            System.out.println(text);
            if (text.equalsIgnoreCase("Computers/Tablets & Networking")) {
                select.selectByIndex(i);
            }
        }
        driver.findElement(By.xpath("//input[@id='gh-ac']")).click();
        String title = driver.getTitle();
        System.out.println("The title is : " + title);
        if (title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")) {
            System.out.println(title + " is verified");
        }else{
            System.out.println(title+" is not verified");
        }
    }
}