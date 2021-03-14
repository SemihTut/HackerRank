package CodingPractice;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class NamiDigerRigaliAlp {

    public static void main(String[] args) {
        ArrayList<String> arrs = new ArrayList<>(Arrays.asList("semih", "alp", "samet", "yusufcuk"));
        ArrayList<Integer>total = new ArrayList<>(Arrays.asList(1,8,7,2,5,4,3,100,99));
        ArrayList<Integer>total2 = new ArrayList<>(Arrays.asList(10,80,9,10,5,7,3));
        Integer[][] arr= {{1,2,3},{4,5,6},{7,8,9}};


        System.out.println("getSum = " + getSum(total));
        System.out.println(getCount(arrs, "alp"));
        System.out.println("getLength = " + getLength(arrs));
        System.out.println("changeInArrayList = " + changeInArrayList(arrs, "semih", "alp"));
        System.out.println("rotateList = " + rotateList(arrs));
        System.out.println("hillNum(total) = " + hillNum(total));
        System.out.println("common_values = " + common_values(total, total2));
        System.out.println("secondMax(total) = " + secondMax(total));
        System.out.println("twoD_Array(arr) = " + twoD_Array(arr));
    }

    public static int getCount(ArrayList<String> arr, String str) {
        int count = 0;
        for (String s : arr) {
            if (s.equalsIgnoreCase(str)) {
                count++;
            }
        }
        return count;
    }

    public static int getSum(ArrayList<Integer> arr) {
        //1st way using stream
         //return arr.stream().reduce(0,Integer::sum);

        //2nd way
        int total = 0;
        for(int a : arr){
            total+= a;
        }
        return total;
    }

    public static ArrayList<Integer> getLength(ArrayList<String>arr){
        ArrayList<Integer>myList = new ArrayList<>();

        //1st way with string
       // return (ArrayList<Integer>) arr.stream().map(String::length).collect(Collectors.toList());

        for(String a : arr){
            myList.add(a.length());
        }
        return myList;
    }

    public static ArrayList<String> changeInArrayList(ArrayList<String>arr,String s1, String s2){
        ArrayList<String>myList = new ArrayList<>();
        for(String s : arr){
            if(s.equals(s1)){
                myList.add(s2);
            }else{
                myList.add(s);
            }
        }
        return myList;
    }

    public static ArrayList<String>rotateList(ArrayList<String>arr){
        ArrayList<String>myList = new ArrayList<>();
        for(int i=arr.size()-1; i>=0;i--){
            myList.add(arr.get(i));
        }
        return myList;
    }

    // birden fazla sayi varsa sikinti olmamasi icin listte topladim
    public static ArrayList<Integer> hillNum(ArrayList<Integer>arr){
        ArrayList<Integer>myList = new ArrayList<>();

        for(int i=1; i<arr.size()-1;i++){
            if(arr.get(i)<arr.get(i-1)&&arr.get(i)>arr.get(i+1)){
                myList.add(arr.get(i));
            }
        }
        return myList;
    }

    public static ArrayList<Integer> common_values(ArrayList<Integer>arr1, ArrayList<Integer>arr2){
        ArrayList<Integer>myList = new ArrayList<>(arr1);
        myList.retainAll(arr2);
       // arr1.stream().filter(arr2::contains).collect(Collectors.toList());
        return myList;

    }

    public static int secondMax(ArrayList<Integer>arr1){
        Collections.sort(arr1);
        return arr1.get(arr1.size()-2);
    }

    public static List<Integer>twoD_Array(Integer[][]arr){
        List<Integer>myList = new ArrayList<>();

        //1st way with stream
/*
        return Arrays.stream(arr)
                .flatMap(Arrays::stream).collect(Collectors.toList());*/


        for(Integer[] a : arr){
            myList.addAll(Arrays.asList(a));
        }
        return myList;
    }
}
