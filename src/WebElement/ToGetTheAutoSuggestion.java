package WebElement;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ToGetTheAutoSuggestion {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(2000);
        List<WebElement> autoSuggestions = driver.findElements(By.xpath("//span[text()='selenium']"));
        for (WebElement suggestion : autoSuggestions) {
            System.out.println(suggestion.getText());
        }
    }
}
