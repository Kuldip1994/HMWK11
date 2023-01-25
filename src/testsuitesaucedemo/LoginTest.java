package testsuitesaucedemo;

import browserfactorysaucedemo.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseurl = "https://www.saucedemo.com/";

    @Before
    public void setup(){
        openBrowser(baseurl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValid(){

        WebElement username = driver.findElement(By.id("user-name")); //enter username in to user field
        username.sendKeys("standard_user"); //sending key to username  field.

        WebElement password = driver.findElement(By.id("password")); //enter password into password field
        password.sendKeys("secret_sauce"); // send keys to password field

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));  //clicking on button by xpath
        loginButton.click(); // click buttpm

        WebElement verifytext = driver.findElement(By.xpath("//span[contains(text(),'Products')]")); //verify text by xpath
        verifytext.getText(); //get text

    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage (){

        WebElement userName = driver.findElement(By.id("user-name")); //enter username in to user field
        userName.sendKeys("standard_user"); //sending key to username  field.

        WebElement Password = driver.findElement(By.id("password")); //enter password into password field
        Password.sendKeys("secret_sauce"); // send keys to password field

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));  //clicking on button by xpath
        loginButton.click(); // click buttpm

        WebElement backPack = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")); //verifying products by text.
        backPack.getText();

        WebElement Bikelight = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bike Light')]"));
        Bikelight.getText();

        WebElement Tshirt = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bolt T-Shirt')]"));
        Tshirt.getText();

        WebElement fleece = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Fleece Jacket')]"));
        fleece.getText();

        WebElement Onesie = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Onesie')]"));
        Onesie.getText();

        WebElement redTshirt = driver.findElement(By.xpath("//div[contains(text(),'Test.allTheThings() T-Shirt (Red)')]"));
        redTshirt.getText();




    }
}

