package CodingPractice.HackerRank;


import java.util.*;
import java.util.stream.Collectors;

public class BillDivision {

    public static void main(String[] args) {
        List<Integer>lista = Arrays.asList(3,10,2,9);
        bonAppetit(lista,1,12);

    }
    static void bonAppetit(List<Integer> bill, int k, int b) {
        List<Integer>newList = new ArrayList<>();
        int sum = bill.stream().mapToInt(x -> x).sum();
        for(Integer i :bill){
            if(!i.equals(bill.get(k))){
                newList.add(i);
            }
        }

        int sum2 = newList.stream().mapToInt(x -> x).sum();
        System.out.println((sum2)/2==b?"Bon Apetit":sum/2-(sum2/2));
    }
}
