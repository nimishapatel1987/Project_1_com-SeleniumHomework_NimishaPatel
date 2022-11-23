package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUsershouldNavigateToLoginPageSuccessfully() {
        //Find the login linkand clickon login link
        clickOnElement(By.linkText("Log in"));
        //This is fromrequirement
        String expectedMessage = "Welcome, Please Sign In!";
        //Find the welcome text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Click on the 'Login' link
        clickOnElement(By.linkText("Log in"));

        //Enter valid user name
        sendTextToElement(By.id("Email"), "test123567@gmail.com");

        //Enter valid Password
        sendTextToElement(By.name("Password"), "Password12345");

        //Click on login button
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        // Verify the 'Log out' text is display
        String expectedMessage = "Log out";

        // Find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//a[@class='ico-logout']"));

        // Validate actual and expected message
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        //Click on the 'Login' link
        clickOnElement(By.linkText("Log in"));

        //Enter valid user name
        sendTextToElement(By.id("Email"), "test123567@gmail.com");

        //Enter valid Password
        sendTextToElement(By.name("Password"), "Password12345");

        //Click on login button
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        getTextFromElement(By.xpath("//div[@class ='message-error validation-summary-errors']"));
        // Verify the 'Log out' text is display
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        // Find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class ='message-error validation-summary-errors']"));

        // Validate actual and expected message
        Assert.assertEquals(actualMessage, expectedMessage);

    }
}
