package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // Find log in link and click on login link
        clickOnElement(By.xpath("//div[@class='header-links']/ul[1]/li[1]/a"));

        //This is from requirement
        String expectedMessage = "Register";

        // Find the Register text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class='header-links']/ul[1]/li[1]/a"));

        // Validate actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldRegisterAccountsSuccessfullySuccessfully() {
        // Find log in link and click on login link
        clickOnElement(By.xpath("//div[@class='header-links']/ul[1]/li[1]/a"));
        //Select the gender radio button
        clickOnElement(By.id("gender-male"));
        //Enter the first name
        sendTextToElement(By.id("FirstName"), "Pari");
        //Enter the Last name
        sendTextToElement(By.id("LastName"), "Patel");
        //Select the day
        sendTextToElement(By.name("DateOfBirthDay"), "14");
        //Select the Month
        sendTextToElement(By.name("DateOfBirthMonth"), "May");
        //Select the Year
        sendTextToElement(By.name("DateOfBirthYear"), "1994");
        //Enter the Email address
        sendTextToElement(By.id("Email"), "test678@gmail.com");
        //Enter the Password
        sendTextToElement(By.name("Password"), "test678");
        //Enter the Confirm Password
        sendTextToElement(By.name("ConfirmPassword"), "test678");
        // Click on the register Button
        clickOnElement(By.name("register-button"));
        //This is from the requirement
        String expectedMessage = "Your registration completed";
        // WebElement actualTextMessageElement = driver.findElement(By.xpath("//div[@class='result']"));
        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        // Validate actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {

    }
}
