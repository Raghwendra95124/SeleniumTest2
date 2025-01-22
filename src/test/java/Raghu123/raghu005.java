package Raghu123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class raghu005 {
    @Test
    public void emedicozlogin (){
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://admin.emedicoz.com/auth_panel/course_product/course_transactions?period=");
    }
}
