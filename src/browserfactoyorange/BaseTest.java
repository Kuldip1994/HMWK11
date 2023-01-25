package browserfactoyorange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl){
        ChromeOptions options = new ChromeOptions(); // setting Webdriver
        driver = new ChromeDriver(options);
        driver.get(baseUrl); //launch the URL
        driver.manage().window().maximize(); // maximise the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // //implicit time to driver

    }
    public void closeBrowser (){
        driver.quit();
    }
}
