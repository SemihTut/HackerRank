package Regex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RegexTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");


        String deneme =  "Jewelry & Accessories, semih";
        String test = "[\\w.]+\\s&\\s[\\w.]+[^,]";
        String test2 = "[a-zA-Z]+\\s&\\s[a-zA-Z]+";
        Matcher m = Pattern.compile(test).matcher(deneme);
        while(m.find()){
            System.out.println("m.group() = " + m.group());
        }

      List<WebElement> elements = driver.findElements(By.xpath("//ul[@role='menubar']"));

        List<String> collect = elements.stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println("collect = " + collect);
        List<List<String>> collect1 = collect.stream()
                .map(x -> reg(x, test))
                .collect(Collectors.toList());
        List<String> collect2 = collect1.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("collect2 = " + collect2.size());
        System.out.println("collect1 = " + collect1);
        System.out.println("collect = " + collect.size());
        System.out.println("collect1 = " + collect1.size());
        driver.quit();

    }

    public static List<String> reg(String str, String reg){
        List<String>ask = new ArrayList<>();

        Matcher m = Pattern.compile(reg).matcher(str);
        while (m.find()){
            if(!m.group().isEmpty()){
                ask.add(m.group());
            }
        }
        return ask;
    }
}
