package testsuite;

import browserfactory.BaseTest;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest { // extended Basetest which will allow me to reuse the codes

    String baseurl = "https://demo.nopcommerce.com/"; //declared string for url

    @Before //this will be opened before test is excuted
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void login() {
        WebElement loginInLink = driver.findElement(By.className("ico-login")); ////click on login link
        loginInLink.click(); //asking to click login
        //verify welcome message
        WebElement welcomeMsg = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")); //using xpath
        String actualText = welcomeMsg.getText();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldLoginSuccessFullyWithValidCredentials() {

        WebElement loginInLink = driver.findElement(By.className("ico-login"));//click on login link
        loginInLink.click();


        WebElement emailIdField = driver.findElement(By.id("Email")); //enter email id in to email field
        emailIdField.sendKeys("john1234@gmail.com"); //sending key to email id  field.


        WebElement passwordField = driver.findElement(By.name("Password")); //enter password into password field
        passwordField.sendKeys("password");// send keys to password field

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]")); //click on login button
        loginButton.click();
        WebElement logOutLink = driver.findElement(By.className("ico-logout")); //
        String actualText = logOutLink.getText();
        String expectedText = "Log out";
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void verifyTheErrorMessage() {
        WebElement logInLink = driver.findElement(By.className("ico-login")); //login link
        logInLink.click(); //asking to click  login

        WebElement emailField = driver.findElement(By.id("Email"));    //enter email id in to email field
        emailField.sendKeys("john1232@gmail.com");

        WebElement passwordField = driver.findElement(By.name("Password")); //enter password into password field
        passwordField.sendKeys("123456");

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]")); //click on login button
        loginButton.click();

        WebElement verifyErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")); //using xpath to finding error
        verifyErrorMessage.getText();

    }
    @After
    public void Teardown(){
        closeBrowser(); //closing browser
    }

}


