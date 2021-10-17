package phuoclet.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import phuoclet.utils.PropertyBuilder;

import java.net.URL;
import java.util.Properties;
import java.util.Set;

public class IosDriverManager extends DriverManager {
    @Override
    public AppiumDriver<WebElement> getDriver() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            //Get AppiumServer Info:
            String appiumServer = PropertyBuilder.getIOSConfig().getProperty("appium.server");
            // Set Capabilities based on file.properties
            Set<String> keys = PropertyBuilder.getIOSConfig().stringPropertyNames();
            for (String k : keys) {
                System.out.println("Key: " + k + "; value : " + PropertyBuilder.getIOSConfig().getProperty(k));
                caps.setCapability(k, PropertyBuilder.getIOSConfig().getProperty(k));
            }
            // Get config from command line arguments:
            Properties cliProperties = System.getProperties();
            Set<String> keys2 = cliProperties.stringPropertyNames();
            for (String k : keys2) {
                if (k.startsWith("mobile.")) {
                    caps.setCapability(k.replace("mobile.", ""), cliProperties.getProperty(k));
                }
            }
            //Initial iOSdDriver:
            URL url = new URL(appiumServer);
           return new IOSDriver<>(url,caps);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
