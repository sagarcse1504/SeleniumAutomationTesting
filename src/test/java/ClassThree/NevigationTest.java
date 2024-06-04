package ClassThree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NevigationTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/select-menu");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);

        WebDriver.Navigation navigate = driver.navigate();
        navigate.to("https://demo.guru99.com/test/newtours/register.php?authuser=1");
        Thread.sleep(2000);
        navigate.back();
        Thread.sleep(2000);
        navigate.forward();
        navigate.refresh();

        driver.quit();

    }
}
