package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LambdaPractices {

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("onur");
        arrayList.add("swtestacademy");
        arrayList.add("testing");
        arrayList.add("automation");

        arrayList.removeIf(x -> x.equalsIgnoreCase("onur"));
        System.out.println(arrayList.toString());

        //*******************************************************

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Bill", 33);
        hashMap.put("Jack", 42);
        hashMap.put("Michael", 28);

        hashMap.forEach((name,age)-> System.out.println("name : "+name +", "+ "age : "+age));

        //*******************************************************

        //Array Declaration
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double asDouble = Arrays.stream(array)
                .filter(number -> number > 5)
                .average()
                .getAsDouble();
        System.out.println(asDouble);

        //********************************************************

        int[] marray = { 2, 4, 8 };

        int reduce = Arrays.stream(marray)
                .reduce(0, (a, b) -> a + b);

        int reduce1 = Arrays.stream(marray)
                .reduce(0, Integer::sum);
        System.out.println("reduce = " + reduce);
        System.out.println("reduce1 = " + reduce1);

        //**************************************************************



    }
}
