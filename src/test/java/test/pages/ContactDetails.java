package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetails {
    private AppiumDriver<WebElement> driver;

    @FindBy(id = "detail_name")
    private WebElement detailName;

    public ContactDetails(AppiumDriver<WebElement> driverParam){
        this.driver = driverParam;
        PageFactory.initElements(driver,this);
    }

    public String getDetailName() {
        return detailName.getText();
    }

}
