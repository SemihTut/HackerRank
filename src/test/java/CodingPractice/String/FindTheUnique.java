package CodingPractice.String;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class FindTheUnique {
    public static void main(String[] args) {
        String team = "AAABBBCCCDEFD";
        Map<Character,Integer>uniq = new HashMap<>();
        for(char ch : team.toCharArray()){
            uniq.put(ch,uniq.getOrDefault(ch,0)+1);
        }
        String s = "";
        for(char ch : team.toCharArray()){
            if(uniq.get(ch)==1){
              s+=ch;
            }

        }
        System.out.println("s = " + s);
        String[]city ={"Tokyo","Stockholm","London","Boston"};
        System.out.println(findCities(city));

    }
    @Test
    public void stream(){
        String str ="galatasaray";
        List<String> asd = Arrays.asList(str.split(""));
        asd.stream().distinct().forEach(System.out::print);


    }

    @Test
    public void stream2(){

        List<Integer> asd = Arrays.asList(2,3,5,1,9,4,3,7,3,5,1,2,9);
        asd.stream().distinct().sorted().forEach(System.out::print);
        List<Integer> collect = asd.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

    }
    @Test
    public void stream3(){

        List<String> asd = Arrays.asList("Semih","Ankara","Gala","asl");
        List<String> startsWithA = asd.stream().filter(name -> name.endsWith("n")&&name.length()>4)
                .collect(Collectors.toList());
        System.out.println("startsWithA = " + startsWithA);

    }
    @Test
    public static List<String> findCities (String[]cities){
        List<String> cityList=Arrays.asList(cities);
        return cityList.stream()
                .filter(city-> city.length()>5 && city.endsWith("n"))
                .collect(Collectors.toList());

    }

}
