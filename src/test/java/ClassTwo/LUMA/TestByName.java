package ClassTwo.LUMA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class TestByName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
        driver.manage().window().maximize();
        System.out.println("===============Website Information===============");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.name("login[username]")).sendKeys("User123");
        Thread.sleep(2000);
        driver.findElement(By.name("login[password]")).sendKeys("Secret123");
        Thread.sleep(2000);
        driver.findElement(By.id("send2")).click();

        System.out.println("===========Get Text===========");
        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        for (WebElement element: webElements){
            System.out.println(element.getText()+" "+element.getAttribute("href"));
        }



        Thread.sleep(2000);
        driver.quit();

    }
}
