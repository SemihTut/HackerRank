package CodingPractice;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();
        Faker faker = new Faker();
        String  name = faker.name().name();
        String name1 = faker.artist().name();
       // System.out.println("image = " + name1);
        String player = faker.esports().player();
        System.out.println("player = " + faker.chuckNorris().fact());



    }
}
