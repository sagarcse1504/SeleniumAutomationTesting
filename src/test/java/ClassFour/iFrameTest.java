package ClassFour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class iFrameTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        System.out.println("main iFrame: "+ driver.findElement(By.className("text-center")).getText());
        Thread.sleep(2000);
        driver.switchTo().frame("frame1");
        System.out.println("Inside iFrame Content: "+ driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();
        Thread.sleep(2000);

        driver.switchTo().frame("frame2");
        System.out.println("Inside iFrame2 Content: " + driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();
        Thread.sleep(2000);




        driver.quit();

    }
}
