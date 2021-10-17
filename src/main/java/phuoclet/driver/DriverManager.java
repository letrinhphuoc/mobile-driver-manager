package phuoclet.driver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public abstract class DriverManager {
    public abstract AppiumDriver<WebElement> getDriver();

}
