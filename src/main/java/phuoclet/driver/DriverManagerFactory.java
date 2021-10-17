package phuoclet.driver;

import java.util.HashMap;
import java.util.Map;

public class DriverManagerFactory {
    private static Map<String, DriverManager> map;

    static {
        map = new HashMap<>();
        map.put("android", new AndroidDriverManager());
        map.put("ios", new IosDriverManager());
    }

    public static DriverManager getManager() {
        String platform = System.getProperty("mobile.platformName");
        return map.get(platform.toLowerCase());
    }
}
