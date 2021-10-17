import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import phuoclet.driver.DriverManager;
import phuoclet.driver.DriverManagerFactory;
import test.pages.ContactDetails;
import test.pages.ContactList;

/**
 * ContactTestUsingPOM's Dependencies:
 * - pages: ContactList, ContactDetails
 * - AppiumDriver
 * - DriverManager
 * - DriverManagerFactory
 * - "platform" parameter (removed)
 * - testNG
 */
public class ContactTestsUsingPOM {
    private ContactList contactList;
    private ContactDetails contactDetails;
    private AppiumDriver<WebElement> driver;

    @BeforeTest
    public void setUp(){
        // Launch App
        DriverManager manager = DriverManagerFactory.getManager();
        if (manager !=null){
            driver = manager.getDriver();
            contactList = new ContactList(driver);
            contactDetails = new ContactDetails(driver);
        }
    }
    @Test
    public void sampleTest() {

        System.out.println("Sample test");
//        // search contact with keyword: jenn
//        contactList.searchContact("jenn");
//
//        // select first contact
//        String expectedName = contactList.selectFirstResult();
//
//        // check contact details
//        String actualName = contactDetails.getDetailName();
//
//        Assert.assertEquals(actualName, expectedName);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }

}
