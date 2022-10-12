package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ToMoveToElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.myntra.com/");

        Actions action = new Actions(driver);
        // action.moveToElement(driver.findElement(By.xpath("//a[text()='Studio']"))).perform();
        action.moveToElement(driver.findElement(By.xpath("//a[text()='Studio']"))).click().perform();
    }
}
