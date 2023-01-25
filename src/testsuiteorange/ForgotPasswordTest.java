package testsuiteorange;

import browserfactoyorange.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {

    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);

    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //forgot password button
        WebElement forgotpasswordLink = driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        forgotpasswordLink.click();
        //website doesn'thave forgot password link after you click on forgot password,but i have verify rest password text.
        WebElement verifytext = driver.findElement(By.xpath("//form[@class='oxd-form']//h6[text()='Reset Password']"));
        verifytext.getText();

    }

    @After
    public void TearDown() {
        closeBrowser();
    }
}
