package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // this is the way we can stop execution as
                                                                         // inplicit way(if driver.findElement won't
                                                                         // find element then only webdriver wait until
                                                                         // and unless it will execute without waiting
                                                                         // for fixed time).
        driver.get(
                "https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
        driver.findElement(By.id("email")).sendKeys("akejee15@gmail.com");

    }

}
