package testsuiteherokuapp;

import browserfactoryherokuapp.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseurl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setup(){
        openBrowser(baseurl);

    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        WebElement username = driver.findElement(By.id("username"));//enter username in to email field
        username.sendKeys("tomsmith");//sending key to username  field.

        WebElement password = driver.findElement(By.id("password")); //enter password into password field
        password.sendKeys("SuperSecretPassword!");// send keys to password field

        WebElement loginbutton = driver.findElement(By.xpath("//button[@class='radius']//i[@class='fa fa-2x fa-sign-in']")); //clicking on button by xpath
        loginbutton.click();//to click on the login button

        WebElement verifytext = driver.findElement(By.xpath("//h4[contains(text(),'Welcome to the Secure Area. When you are done click logout below.')]")); // verify message
        verifytext.getText(); //get text

    }
    @Test
    public void verifyTheUsernameErrorMessage(){

        WebElement username = driver.findElement(By.id("username")); //enter username in to email field
        username.sendKeys("tomsmith1"); //sending key to username  field.

        WebElement password = driver.findElement(By.id("password")); //enter password into password field
        password.sendKeys("SuperSecretPassword!"); // send keys to password field

        WebElement loginbutton = driver.findElement(By.xpath("//button[@class='radius']//i[@class='fa fa-2x fa-sign-in']")); //clicking on button by xpath
        loginbutton.click();//to click on the login button

        WebElement errormessage = driver.findElement(By.xpath("//div[@class='flash error']")); //finding error message by xpath
        errormessage.getText(); //get text

    }
    @Test
    public void verifyThePasswordErrorMessage(){
        WebElement username = driver.findElement(By.id("username")); //enter username in to email field
        username.sendKeys("tomsmith"); //sending key to username  field.

        WebElement password = driver.findElement(By.id("password")); //enter password into password field
        password.sendKeys("SuperSecretPassword"); // send keys to password field

        WebElement loginbutton = driver.findElement(By.xpath("//button[@class='radius']//i[@class='fa fa-2x fa-sign-in']")); //clicking on button by xpath
        loginbutton.click();//to click on the login button

        WebElement errormessage = driver.findElement(By.xpath("//div[@class='flash error']")); //finding error message by xpath
        errormessage.getText(); //get text

    }
    @After
    public void Teardown(){
        closeBrowser();
    }

}
