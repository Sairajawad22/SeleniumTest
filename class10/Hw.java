package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Hw {
    /*
    Go to syntax hrms .
Go-to the recruitment tab.
From the calendar  just select a date
8 August 2023

     */
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%C3%A2%C2%80%C2%9D");
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("admin");
        WebElement userPass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        userPass.sendKeys("Hum@nhrm123");
        WebElement logInBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        logInBtn.click();
        WebElement req = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        req.click();
        WebElement caleBtn = driver.findElement(By.id("candidateSearch_fromDate"));
        caleBtn.click();

        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select=new Select(month);
        select.selectByVisibleText("Aug");

        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1=new Select(year);
        select1.selectByVisibleText("2023");

        List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td"));
        for (var day:days) {
            String dayText = day.getText();
            if(dayText.equalsIgnoreCase("8")){
                day.click();
            }
        }



    }
}
