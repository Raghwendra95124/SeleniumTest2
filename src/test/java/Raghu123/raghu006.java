package Raghu123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class raghu006 {
    @Test

    public void emedicozlogin (){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://admin.emedicoz.com/auth_panel/course_product/course/index");
        WebElement emeilfield = driver.findElement(By.id("login_username"));
        emeilfield.sendKeys("raghwendra@damsdelhi.com");
        WebElement password = driver.findElement(By.id("login_pwd"));
        password.sendKeys("Raghu@123");
        WebElement loginsubmit = driver.findElement(By.xpath("//button[text()='Login']\n"));
        loginsubmit.click();
        WebElement otpinput = driver.findElement(By.xpath("//input[@name='otp[]']\n"));
        otpinput.sendKeys("2000");
        WebElement submit2 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']\n"));
        submit2.click();
        driver.quit();

    }
}
