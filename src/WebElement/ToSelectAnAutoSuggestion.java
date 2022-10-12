package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class ToSelectAnAutoSuggestion {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(2000);
        List<WebElement> autoSuggestions = driver.findElements(By.xpath("//span[text()='selenium']"));
        for(WebElement suggestion: autoSuggestions){
//            System.out.println(suggestion.getText());
            String suggestionText = suggestion.getText();
            if(suggestionText.equals("selenium testing")){
                suggestion.click();
                break;
            }
        }
    }
}
