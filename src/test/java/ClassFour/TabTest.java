package ClassFour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class TabTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        System.out.println("main Window: "+ driver.findElement(By.className("text-center")).getText());
        Thread.sleep(2000);

        String parentPage = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/sample");
        Thread.sleep(2000);
        System.out.println("Inside Child: "+driver.findElement(By.className("sampleHeading")).getText());
        driver.switchTo().window(parentPage);
        Thread.sleep(2000);


//        System.out.println("Second Time Window: "+ driver.findElement(By.className("text-center")).getText());
//        driver.switchTo().newWindow(WindowType.WINDOW);
//        driver.navigate().to("https://demoqa.com/sample");
//        Thread.sleep(2000);
//        System.out.println("Inside2 Child: "+driver.findElement(By.className("sampleHeading")).getText());
//        driver.switchTo().window(parentPage);
//        Thread.sleep(2000);
        driver.quit();


    }
}
