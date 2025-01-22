package Raghu123;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Raghu002 {
@Test
    public void Testingloginpage (){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.emedicoz.com/");
//        System.out.println(driver.getTitle());
    WebElement inputsignbutton = driver.findElement(By.className("loginbtnSignupbtn"));
    inputsignbutton.click();
    WebElement mobileInputBox = driver.findElement(By.xpath("//input[@type='tel']"));
    mobileInputBox.sendKeys("9512433922");
    WebElement continueBtn = driver.findElement(By.className("common-bottom-btn"));
    continueBtn.click();
    WebElement continue1 = driver.findElement(By.xpath("//button[contains(text(), 'Logout & Continue')]"));
    continue1.click();


    }
}
