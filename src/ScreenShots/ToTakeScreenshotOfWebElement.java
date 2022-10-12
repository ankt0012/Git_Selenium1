package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenshotOfWebElement {
    public static void main(String[] args) throws IOException {

        Date date = new Date();
        String sysdate = date.toString().replace(" ", "_").replace(":", "_");
        System.out.println(sysdate);

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/select-menu");

        WebElement element = driver.findElement(By.xpath("//div[text()="));
        File source = element.getScreenshotAs(OutputType.FILE);
        File destination = new File("./ScreenShots/elementShot" + sysdate + ".png");
        Files.copy(source, destination);

    }

}
