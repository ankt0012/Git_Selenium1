package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ToPerformMouseHoverUsingCoordinates {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://amp.dev/documentation/examples/interactivity-dynamic-content/star_rating/?format=websites");

        WebElement firstStar = driver.findElement(By.id("rating1"));
        Actions action = new Actions(driver);

        // action.moveToElement(driver.findElement(By.xpath("//a[text()='Studio']"))).perform();
        // action.moveToElement(driver.findElement(By.xpath("//a[text()='Studio']"))).click();//.perform();
        action.moveToElement(firstStar, 100, 0).perform();
        // action.click(firstStar).perform();
    }
}
