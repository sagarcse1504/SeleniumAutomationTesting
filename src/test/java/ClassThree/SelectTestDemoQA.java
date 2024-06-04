package ClassThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTestDemoQA {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Select select = new Select(driver.findElement(By.cssSelector("#oldSelectMenu")));

        select.selectByIndex(2);
        Thread.sleep(2000);

        for (WebElement element : select.getOptions()) {
            System.out.println(element.getText());
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
