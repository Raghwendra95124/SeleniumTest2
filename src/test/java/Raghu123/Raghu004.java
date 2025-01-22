package Raghu123;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Raghu004 {
    @Test
    public void emedicozlogin(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
    }
}
