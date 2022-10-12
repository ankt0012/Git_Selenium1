package DropDowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ToDeselect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/select-menu");

        Actions action = new Actions(driver);
        action.sendKeys((Keys.PAGE_DOWN));

        WebElement element = driver.findElement(By.id("cars"));
        Select select = new Select(element);

        select.selectByIndex(3);
        Thread.sleep(20000);
        select.selectByVisibleText("Volvo");
        Thread.sleep(20000);
        select.selectByValue("saab");

        Thread.sleep(20000);
        select.deselectByIndex(1);
        Thread.sleep(20000);
        select.deselectByVisibleText("Volvo");
        Thread.sleep(20000);
        select.deselectByValue("audi");

        select.selectByIndex(3);
        select.selectByVisibleText("Volvo");
        select.selectByValue("saab");

        select.deselectAll();

    }

}
