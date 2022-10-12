package ActiveElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * ToUseOfActiveElementOfActiLogin
 */
public class ToUseOfActiveElementOfActiLogin {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");

        WebElement activElement = driver.switchTo().activeElement();
        activElement.sendKeys("Ankit");

    }
}