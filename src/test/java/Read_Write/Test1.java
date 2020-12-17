package Read_Write;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        File check = new File("configuration.properties");
        try {
            if(check.exists()){
                System.out.println("I have already had it");
            }else{
                System.out.println("Newly created");
                createFile("configuration.properties");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ConfigurationReader.set("name","semih");
        ConfigurationReader.set("name2","asli");

        System.out.println(ConfigurationReader.get("name"));

    }

    public static File createFile(String path){
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}
