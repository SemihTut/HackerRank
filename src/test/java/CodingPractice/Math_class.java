package CodingPractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Math_class {
    public static void main(String[] args) {
        int i = Math.addExact(10, 15);
        System.out.println("Math.ceil(2.7) = " + Math.ceil(2.7));
        System.out.println("Math.floor(2.7) = " + Math.floor(2.7));
        System.out.println("Math.floorMod(10,4) = " + Math.floorMod(10, 3));
        System.out.println("i = " + i);
       // List<Double> collect = Stream.generate(Math::random).collect(Collectors.toList());
       // System.out.println("collect = " + collect);
        double random = Math.random();
        System.out.println("random = " + random);
        Stream.iterate(0,x->x+1);

    }
}
