package ClassTwo.LUMA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class TestByCssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
        System.out.println("===============Website Information===============");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.cssSelector("#email")).sendKeys("User123");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pass")).sendKeys("Secret123");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[id='send2'] span")).click();

        System.out.println("===========Get Text===========");
        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        for (WebElement element: webElements){
            System.out.println(element.getText()+" "+element.getAttribute("href"));
        }


        Thread.sleep(2000);
        driver.quit();

    }
}
