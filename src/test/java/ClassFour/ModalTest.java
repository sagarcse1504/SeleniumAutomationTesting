package ClassFour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ModalTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/modal-dialogs");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.id("showSmallModal")).click();
        Thread.sleep(2000);
        System.out.println("Element of Modal: "+driver.findElement(By.className("modal-body")).getText());
        driver.findElement(By.id("closeSmallModal")).click();
        Thread.sleep(2000);

        driver.quit();


    }
}
