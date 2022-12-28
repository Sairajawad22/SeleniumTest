package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Hw {
    /*
    http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
got to the url
click on PIM
click on Employee List
from the table choose one id (it must be from the first page)
and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)
the user name is
admin
the password is
Hum@nhrm123
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
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("admin");
        WebElement userPass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        userPass.sendKeys("Hum@nhrm123");
        WebElement logInBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        logInBtn.click();
        // click on PIM
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimBtn.click();
        //click on Employee List
       WebElement empList = (WebElement) driver.findElement(By.xpath("//a[text()='Employee List']"));
        empList.click();
// from the table choose one id (it must be from the first page)
//and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)

        List<WebElement> columId = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (int i = 0; i < columId.size(); i++) {
            String colText = columId.get(i).getText();
            if (colText.equalsIgnoreCase("45031A")) {
                // //table[@id='resultTable']/tbody/tr[20]/td[2]
                WebElement columChekBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                columChekBox.click();
            }

        }
    }
    }

