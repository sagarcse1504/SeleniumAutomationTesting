package ClassThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebinfoTestDemoQA {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
         driver.get("https://demoqa.com/text-box");
         driver.manage().window().maximize();

         System.out.println(driver.getTitle());
         System.out.println(driver.getCurrentUrl());

        WebElement webelement = driver.findElement(By.id("userName"));
        System.out.println("Tag name: "+ webelement.getTagName());
        System.out.println("Position: " + webelement.getRect().x + " " +webelement.getRect().y);

        WebElement element = driver.findElement(By.cssSelector("div[class='element-list collapse show'] li[id='item-1'] span[class='text']"));

        System.out.println(element.getCssValue("font-family"));
        System.out.println(element.getCssValue("color"));
        System.out.println(element.getCssValue("font-size"));
        System.out.println(element.getAttribute("class"));

        Thread.sleep(2000);





         driver.quit();
    }
}
