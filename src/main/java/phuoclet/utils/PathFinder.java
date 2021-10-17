package phuoclet.utils;

import java.io.File;

public class PathFinder {
    private static final String CURRENT_WORKING_DIR = System.getProperty("user.dir");
    //Folders:
    private static final String CONFIG_FOLDER_NAME = "config";

    public static String getPathToAndroidProperties() {
        return CURRENT_WORKING_DIR + File.separator + CONFIG_FOLDER_NAME + File.separator + "android.properties";
    }

    public static String getPathToIOSProperties() {
        return CURRENT_WORKING_DIR + File.separator + CONFIG_FOLDER_NAME + File.separator + "iOS.properties";
    }


}
