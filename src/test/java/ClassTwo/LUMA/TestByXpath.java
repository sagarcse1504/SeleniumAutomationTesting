package ClassTwo.LUMA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestByXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
        driver.manage().window().maximize();

        System.out.println("===============Website Information===============");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("User123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Secret123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]/span[1]")).click();


        Thread.sleep(2000);
        driver.quit();

    }
}
