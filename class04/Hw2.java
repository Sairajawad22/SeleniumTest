package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    public static void main(String[] args) {
        /*
        HW 2
HRMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.

Hint:
you can use if else condition for verification of message
         */
         System.setProperty("webdriver.chrome.driver","driver/chromedriver");
         WebDriver driver=new ChromeDriver();
         driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement textBox = driver.findElement(By.cssSelector("input#txtUsername"));
        textBox.sendKeys("Admin");
        WebElement textBox1 = driver.findElement(By.cssSelector("input#txtPassword"));
        textBox1.sendKeys("");
        WebElement textBox2 = driver.findElement(By.cssSelector("input#btnLogin"));
        textBox2.click();
        WebElement hasMsg = driver.findElement(By.cssSelector("span#spanMessage"));
      String displayMsg  =hasMsg.getText();
        boolean displayStatus = hasMsg.isDisplayed();

        if(displayStatus){
            System.out.println("Password cannot be empty is displayed :"+displayStatus);
        }else {
            System.out.println("Pasword cannot be empty is not displayed :"+displayStatus);
        }
    }
}
