package JavaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.util.*;

public class NioJava {
    public static void main(String[] args) {
        String n = "Semih";
        try {
            //FileInputStream file = new FileInputStream("data.txt");
           // FileChannel channel = file.getChannel();
            Path dataPath = FileSystems.getDefault().getPath("data.txt");
          //  Files.write(dataPath,"\nLine5".getBytes("UTF-8"), StandardOpenOption.APPEND);
            Files.write(dataPath,n.getBytes("UTF-8"), StandardOpenOption.APPEND);
            List<String>lines = Files.readAllLines(dataPath);
            lines.forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
