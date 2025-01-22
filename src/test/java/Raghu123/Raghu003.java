package Raghu123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test

public class Raghu003 {
    public void emedicozpartnerlogin (){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver =new ChromeDriver(options);
       driver.navigate().to("https://admin.emedicoz.com/auth_panel/course_product/course_transactions?period=");
    }
}
