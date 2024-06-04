package ClassTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class ParaBankNameTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();

        System.out.println("==============Web Information==============");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        List<WebElement> webElements = driver.findElements(By.tagName("a"));

        for (WebElement element: webElements){
            System.out.println(element.getText() +" "+element.getAttribute("href"));
        }

        driver.findElement(By.name("username")).sendKeys("user123");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("secret321");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Log In']")).click();

        Thread.sleep(2000);
        driver.quit();


    }
}
