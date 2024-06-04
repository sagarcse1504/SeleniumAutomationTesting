package ClassFour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.time.Duration;

public class AutomationPracticeForm {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.id("name")).sendKeys("Sagar Arafat");
        driver.findElement(By.id("email")).sendKeys("sagar@gmail.com");
       // driver.findElement(By.id("gender")).click();




        // identify radio button then click
       // WebElement radiobtn = driver.findElement(By.xpath("//*[@id='gender']"));
        WebElement radiobtn = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        radiobtn.click();


        // verify if radio button is selected
        boolean result = radiobtn.isSelected();
        System.out.println("Checking if a radio button is selected: " + result);

        driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("01774630784");
        driver.findElement(By.cssSelector("#dob")).click();
        Thread.sleep(3000);


        driver.findElement(By.id("dob")).sendKeys("2/2/1998");
        driver.findElement(By.id("subjects")).sendKeys("CSE");
        WebElement checkBox = driver.findElement(By.xpath("//*[@id='hobbies']"));
        // click the checkbox
        checkBox.click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        // check if a checkbox is selected
        boolean result1 = checkBox.isSelected();
        System.out.println("Checking if a checkbox is selected: " + result1);

// identify element with xpath for file upload
        WebElement m = driver.findElement(By.xpath("//input[@id='picture']"));

        // getting file path to be uploaded
        File f = new File("E://CV of Sagar/2in.jpg");
        System.out.println("Getting the file path to be uploaded: " + f.getAbsolutePath());

        // uploading file with path of file uploaded
        m.sendKeys(f.getAbsolutePath());

        // check if file uploaded successfully
        if (m.getAttribute("value").equalsIgnoreCase("Picture.png")) {
            System.out.println("File uploaded successfully ");
        } else {
            System.out.println("File uploaded unsuccessfully ");
        }



        driver.findElement(By.cssSelector("option[value='Haryana']")).click();
        driver.findElement(By.cssSelector("option[value='Haryana']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.cssSelector("input[value='Login']")).click();

       // Thread.sleep(2000);
        driver.quit();


        }
    }
