package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
HW1
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify the message "Welcome Admin " is there on the top right corner
 */

public class Hw1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement textBox = driver.findElement(By.cssSelector("input#txtUsername"));
        textBox.sendKeys("Admin");
        WebElement textBox1 = driver.findElement(By.cssSelector("input#txtPassword"));
        textBox1.sendKeys("Hum@nhrm123");
        WebElement textBox3 = driver.findElement(By.cssSelector("input#btnLogin"));
        textBox3.click();
        WebElement hasMsg = driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
        String title=hasMsg.getText();
        System.out.println("Massage on top right corner is :"+title);

    }
}
