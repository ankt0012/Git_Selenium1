package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
        driver.findElement(By.id("email")).sendKeys("akraf20@gmail.com");

        WebElement element = driver.findElement(By.xpath("//button[contains(text(), 'Continue')]"));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

}
/*
 * 
 * Explicit Wait --> Check the condition-->whether it is satisfied or not-->(if
 * not) whetherr the duration is over-->(if no)0.5sec wait(this is called
 * Polling period/ frequency/ Interval)-->chech again
 * 
 */