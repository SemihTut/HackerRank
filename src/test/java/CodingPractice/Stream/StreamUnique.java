package CodingPractice.Stream;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUnique {
    public static void main(String[] args) {

        List<String> listTeam = Arrays.asList("Istanbul","Ankara","Izmir","Helsinki","Espoo","Izmir","Bolu","Helsinki",
                "Istanbul","Ankara","Izmir","Helsinki","Espoo","Izmir","Bolu","Rome","Turku","Bolu");
        List<String> unique = listTeam.stream()
                .distinct().collect(Collectors.toList());//A,B,C,D,E,F
        System.out.println("unique = " + unique);
        // to find the unique ones by using stream
        List<String> collect = listTeam.stream()
                .map(String::toUpperCase)
                // Build a map from word -> frequency
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                // stream the frequency map entries
                .entrySet().stream()
                // filter to retain unique words (with frequency == 1)
                .filter(e -> e.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("entryStream = " + collect);

        // to find the unique ones by using map merge
        Map<String, Integer> freqs = new HashMap<>();
        for(String citym : listTeam){
            freqs.merge(citym,1,Integer::sum);
        }
        List<String>uniqCities = new ArrayList<>();
        uniqCities = freqs.entrySet().stream().filter(e-> e.getValue().equals(1))
                                                .map(Map.Entry::getKey)
                                                .collect(Collectors.toList());
        System.out.println("uniqCities = " + uniqCities);

        //  ------------------------------------------------------------------
        List<StringBuilder> collectReverse = listTeam.stream().map(StringBuilder::new)
                .map(StringBuilder::reverse).collect(Collectors.toList());
        System.out.println("collectReverse = " + collectReverse);

        List<String> frequencyWords = listTeam.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream().filter(a -> a.getValue() != 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("frequencyWords = " + frequencyWords);
        System.out.println("----------------------------");
        Map<String, Long> collect1 = listTeam.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("collect1.keySet() = " + collect1.keySet());
        System.out.println("collect1 = " + collect1);
        Map<String, Long> collect2 = listTeam.stream().collect(Collectors.groupingBy(s -> s.substring(0,3), Collectors.counting()));
        System.out.println("collect2 = " + collect2);
        System.out.println("----------------------------");
        Map<String, Long> stringLongMap = listTeam.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        LinkedHashMap<String, Long> collect3 = stringLongMap.entrySet()
                .stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("collect3 = " + collect3);
        String key = collect3.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        System.out.println("key = " + key);
        System.out.println("----------------------");
        String key1 = listTeam.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().max((a1, a2) -> a1.getValue() > a2.getValue() ? 1 : -1).get().getKey();
        System.out.println("key1 = " + key1);

        //SECOND WAY TO FIND KEY THAT IS THE BIGGEST VALUE
        String key2 = listTeam.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().min(Comparator.comparingLong(Map.Entry::getValue))
                .get().getKey();
        System.out.println("min = " + key2);

        listTeam.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue));


        listTeam.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))

                .entrySet().stream().filter(a -> a.getValue()!=1)
                ;


    }

    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        links.forEach(WebElement::getText);
        List<String> answer = links.stream()
                .filter(link -> link.getText().contains("Amazon") && !link.getText().startsWith("Amazon"))
                .map(WebElement::getText)
                .collect(Collectors.toList());
        System.out.println(answer+" answer size is "+ answer.size());

        driver.quit();

    }
  /*  @Test
    public void List<String> findCities (String[]cities){

        List<String> cityList= Arrays.asList(cities);
        List<String> n = cityList.stream()
                .filter(city -> city.length() > 5 && city.endsWith("n"))
                .collect(Collectors.toList());

        return n;

    }*/

    @Test
    public void str(){

        String[]city ={"Tokyo","Stockholm","London","Boston"};
        List<String> collect = Arrays.stream(city).sorted().collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("--------------");

        Arrays.stream(city).filter(c->c.length()>6).forEach(System.out::println);
        List<String> t = Arrays.stream(city).filter(c -> c.charAt(0)=='T').collect(Collectors.toList());
        t.forEach(s-> System.out.println(s.charAt(0)));
        System.out.println("--------------");



    }
    public String reversed(String c){
        return new StringBuilder(c).reverse().toString();
    }
}


