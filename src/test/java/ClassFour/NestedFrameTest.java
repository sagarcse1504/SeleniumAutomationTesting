package ClassFour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class NestedFrameTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        System.out.println("main iFrame: "+ driver.findElement(By.className("text-center")).getText());
        Thread.sleep(2000);
        driver.switchTo().frame("frame1");
        System.out.println("IFrame content: "+ driver.findElement(By.id("frame1")).getText());

        Thread.sleep(2000);

        driver.quit();
    }
}
