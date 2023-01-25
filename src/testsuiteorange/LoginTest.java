package testsuiteorange;

import browserfactoyorange.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        WebElement username = driver.findElement(By.name("username")); //enter email id in to email field
        username.sendKeys("Admin"); ////sending key to email id  field.

        WebElement password = driver.findElement(By.name("password")); //enter password into password field
        password.sendKeys("admin123"); //// send keys to password field

        WebElement loginButton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")); //clicking on button by xpath
        loginButton.click(); //to click on the login button


        WebElement verifyText = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")); // verify dashword as unable to find welcome message
        verifyText.getText(); //get text


    }

    @After
    public void TearDown() {
        closeBrowser();
    }
}
