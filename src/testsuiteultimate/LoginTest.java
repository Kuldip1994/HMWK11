package testsuiteultimate;

import browserfactoryultimate.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseurl = "https://courses.ultimateqa.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        WebElement loginLink = driver.findElement(By.xpath("//li[@class='header__nav-item header__nav-sign-in']")); //using xpath to click on the link
        loginLink.click(); //asking to click on the link

        WebElement verifyText = driver.findElement(By.xpath("//h2[contains(text(),'Welcome Back!')]")); //using xpath to verify text
        verifyText.getText(); // verify text
    }
    @Test
    public void verifyTheErrorMessage(){
        WebElement loginLink = driver.findElement(By.xpath("//li[@class='header__nav-item header__nav-sign-in']")); //using xpath to click on the link
        loginLink.click(); //asking to click on the link

        WebElement emailField = driver.findElement(By.id("user[email]")); //enter email id in to email field
        emailField.sendKeys("Paul1@gmail.com"); //sending key to email id  field.

        WebElement passwordField = driver.findElement(By.id("user[password]")); //enter password into password field
        passwordField.sendKeys("123456"); //to click on the login button

        WebElement loginButton = driver.findElement(By.xpath("//button[@class='button button-primary g-recaptcha']")); //clicking on button by xpath
        loginButton.click();

        WebElement verifyerror = driver.findElement(By.xpath("//li[contains(text(),'Invalid email or password.')]")); //verifing error by xpath
        verifyerror.getText(); //asking to get text


    }
}
