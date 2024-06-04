package ClassTwo.LUMA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestByLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
        driver.manage().window().maximize();

        System.out.println("===============Website Information===============");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

//        driver.findElement(By.linkText("Create an Account")).click();
        driver.findElement(By.partialLinkText("got Yo")).click();

        Thread.sleep(2000);
        driver.quit();

    }
}
