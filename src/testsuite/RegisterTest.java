package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {

    String baseurl = "https://demo.nopcommerce.com/"; //declared string for url

    @Before
    public void setup() {
        openBrowser(baseurl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully (){
        WebElement registerLink = driver.findElement(By.className("ico-register")); // find by class name
        registerLink.click(); //click on register link

        WebElement verifyText = driver.findElement(By.xpath("//h1[contains(text(),'Register')]")); //verify the text 'Register' using xpath to verify

    }
    @Test

    public void userSholdRegisterAccountSuccessfully (){

        WebElement registerlink = driver.findElement(By.className("ico-register")); // find by class name
        registerlink.click(); //click on register link

        WebElement genderRadio = driver.findElement(By.xpath("//div[@class='gender']//input[@id='gender-male']")); //find gender male by id
        genderRadio.click();//click on male.

        WebElement firstname = driver.findElement(By.id("FirstName")); //find firstname by id
        firstname.sendKeys("Paul"); //enter firstname by sendkey

        WebElement lastname = driver.findElement(By.id("LastName"));//find last name by id
        lastname.sendKeys("Patel");//enter lastname by sendkey

        WebElement Day = driver.findElement(By.name("DateOfBirthDay")); // select birthday by day
        Select select=new Select(Day); // select day
        select.selectByValue("15");  // select with value

        WebElement Month = driver.findElement(By.name("DateOfBirthMonth")); // select birthday by month
        Select select1 = new Select(Month); // select month
        select1.selectByVisibleText("February");// select with visible text

        WebElement Year = driver.findElement(By.name("DateOfBirthYear")); // select birthday by month
        Select select2 = new Select(Year); // select year
        select2.selectByValue("1994"); // select with value

        WebElement emailAddress = driver.findElement(By.id("Email"));  //enter email id in to email field
        emailAddress.sendKeys("Paul2@gmail.com"); //sending key to email id  field.

        WebElement Password = driver.findElement(By.name("Password")); //enter password into password field
        Password.sendKeys("skyline");// send keys to password field

        WebElement confirmPassword = driver.findElement(By.name("ConfirmPassword")); //confirm password into password field
        confirmPassword.sendKeys("skyline"); // send keys to password field

        WebElement registerButton = driver.findElement(By.xpath("//button[@name='register-button']")); //xpath for register button
        registerButton.click(); //click on login button

        WebElement verifyText = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")); //used xpath to find text
        verifyText.getText();


    }

}
