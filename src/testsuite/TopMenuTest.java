package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseurl = "https://demo.nopcommerce.com/"; //declared string for url

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.linkText("Computers")).click(); // click on the computer tab

        WebElement verifythetext = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));  //verify the text 'Computer' using xpath to verfiy
        verifythetext.getText();

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        driver.findElement(By.linkText("Electronics")).click();// click on Electronics tab

        WebElement verifythetext = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));  //verify the text 'Electronics' using xpath to verfiy
        verifythetext.getText();
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        driver.findElement(By.linkText("Apparel")).click(); //click on the apparel

        WebElement veriftthetext = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]")); //verify the text 'apparel' using xpath to verfiy
        veriftthetext.getText();
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully (){
        driver.findElement(By.linkText("Digital downloads")).click(); // click on Digital downloads tab

        WebElement verifythetext = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]")); //verify the text 'Digital downloads' using xpath to verfiy
        verifythetext.getText();
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully (){
        driver.findElement(By.linkText("Books")).click(); //click on books tab

        WebElement verifythetext = driver.findElement(By.xpath("//h1[contains(text(),'Books')]")); //verify the text 'books' using xpath to verfiy
        verifythetext.getText();
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully (){
        driver.findElement(By.linkText("Jewelry")).click(); //click on Jewelry tab

        WebElement verifythetext = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]")); //verify the text 'Jewelry' using xpath to verfiy
        verifythetext.getText();
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully (){
        driver.findElement(By.linkText("Gift Cards")).click(); //click on the giftcard

        WebElement verifythetext = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]")); //verify the text 'giftcard' using xpath to verfiy
        verifythetext.getText();
    }
    @After
    public void Teardown(){
        closeBrowser();
    }
}