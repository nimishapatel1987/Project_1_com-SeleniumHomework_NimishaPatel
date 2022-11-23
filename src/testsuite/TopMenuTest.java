package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //Find the login link and click on the login link
        clickOnElement(By.xpath("//html/body/div[6]/div[2]/ul[1]/li[1]/a"));

        //This is from requirement
        String expectedMessage = "Computers";

        // Find the text element and get the text
        String actualMessage = getTextFromElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));

        // Validate actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // Find log in link and click on login link
        clickOnElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));

        // This is from requirement
        String expectedMessage = "Electronics";

        // Find the Electronics text element and get the text
        String actualMessage = getTextFromElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));

        // Validate actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        // Find log in link and click on login link
        clickOnElement(By.xpath("//a[@href='/apparel']"));

        // This is from requirement
        String expectedMessage = "Apparel";

        // Find the text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//a[@href='/apparel']"));

        // Validate actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        // Find log in link and click on login link
        clickOnElement(By.xpath("//a[@href='/digital-downloads']"));

        // This is from requirement
        String expectedMessage = "Digital downloads";

        // Find the Digital downloads text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//a[@href='/digital-downloads']"));

        // Validate actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        // Find log in link and click on login link
        clickOnElement(By.xpath("//a[@href='/books']"));

        // This is from requirement
        String expectedMessage = "Books";

        // Find the Books text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//a[@href='/books']"));

        // Validate actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        // Find log in link and click on login link
        clickOnElement(By.xpath("//a[@href='/jewelry']"));

        // This is from requirement
        String expectedMessage = "Jewelry";

        // Find the Jewelry text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//a[@href='/jewelry']"));

        // Validate actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        // Find log in link and click on login link
        clickOnElement(By.xpath("//a[@href='/gift-cards']"));

        // This is from requirement
        String expectedMessage = "Gift Cards";

        // Find the Gift Cards text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//a[@href='/gift-cards']"));

        // Validate actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {
    }

}

