package test.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactList {
    private AppiumDriver<WebElement> driver;

    public ContactList(AppiumDriver<WebElement> driverParam) {
        this.driver = driverParam;
        PageFactory.initElements(driver, this);
    }

    //    @FindBy(id = "main_search")
//    @FindBys({@FindBy(xpath = "//android.widget.EditText"), @FindBy(id = "main_search")})
    @AndroidBy()
    @iOSXCUITFindBy()
    private WebElement searchBox;

    //    @FindBy(id = "name")
//    @FindAll({@FindBy(id = "name"), @FindBy(xpath = "//android.widget.EditText")})
//    @FindBys({@FindBy(xpath = "//android.widget.TextView"), @FindBy(id = "name")})
    @iOSXCUITFindBy(iOSNsPredicate = "text(\"LOGIN\")")
    private List<WebElement> results;

    public void searchContact(String keyword) {
        searchBox.sendKeys(keyword);
    }

    public String selectFirstResult() {
        for (WebElement e : results) {
            System.out.println(e.getText());
        }
        WebElement firstContact = results.get(0);
        String expectedName = firstContact.getText();

        firstContact.click();
        return expectedName;
    }
}
