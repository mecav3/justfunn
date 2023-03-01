package steps;

import java.io.FileInputStream;
import java.util.Properties;

public class CR {

    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
        } catch (Exception e) {
            System.out.println("steps.CR File Exception");
        }
    }

    public static String get(String keyword) {
        return properties.getProperty(keyword);
    }
}
