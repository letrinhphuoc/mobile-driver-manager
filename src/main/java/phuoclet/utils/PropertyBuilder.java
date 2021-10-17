package phuoclet.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class PropertyBuilder {
    public static Properties getAndroidConfig() {
        Properties androidProperties = new Properties();
        try {
            BufferedReader ip = new BufferedReader(new InputStreamReader(new FileInputStream(PathFinder.getPathToAndroidProperties()), StandardCharsets.UTF_8));
            androidProperties.load(ip);

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return androidProperties;
    }

    public static Properties getIOSConfig() {
        Properties iOSProperties = new Properties();
        try {
            BufferedReader ip = new BufferedReader(new InputStreamReader(new FileInputStream(PathFinder.getPathToIOSProperties()), StandardCharsets.UTF_8));
            iOSProperties.load(ip);

        } catch (Exception exception) {
            System.out.println(exception.getMessage());

        }
        return iOSProperties;

    }
}
