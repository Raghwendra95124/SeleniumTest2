package Raghu123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test

public class Raghu001 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin.emedicoz.com/auth_panel/Auth_panel_ini/not_authorize");
        driver.findElement(By.id("login_username"));
//        driver.quit();
//<input type="text" class="form-control" value="" name="email" placeholder="Email" id="login_username">

    }
}
