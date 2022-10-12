package ScreenShots;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenOfWebpage {
    public static void main(String[] args) throws InterruptedException {

        Date date = new Date();
        String sysdate = date.toString().replace(" ", "_").replace(":", "_");
        System.out.println(sysdate);

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/select-menu");

    }

}
