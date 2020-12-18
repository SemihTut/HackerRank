package Read_Write;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {

        try{
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);

            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String get(String keyName){
        return properties.getProperty(keyName);
    }

    public static void set(String key, String value){
        try (OutputStream outputStream = new FileOutputStream("configuration.properties")){
            properties.setProperty(key, value);
            properties.store(outputStream,"semihhhhhhhh");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }






}

