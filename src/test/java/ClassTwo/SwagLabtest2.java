package ClassTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class SwagLabtest2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        System.out.println("==============Web Information==============");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        List<WebElement> webElements = driver.findElements(By.tagName("a"));

        for (WebElement element: webElements){
            System.out.println(element);
        }

        driver.findElement(By.name("user-name")).sendKeys("standard_user");

        driver.findElement(By.name("password")).sendKeys("secret_sauce");
//        Thread.sleep(2000);
        driver.findElement(By.name("login-button")).click();


        Thread.sleep(2000);
        driver.quit();


    }
}
