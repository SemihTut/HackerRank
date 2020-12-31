package CodingPractice.CodeReview;
import java.util.*;

public class Soru4 {
    public static void main(String[] args) {
        List<Integer> my1 = Arrays.asList(1,2,6,7,8);
        List<Integer> my2 = Arrays.asList(2,3,3,5);
        int[]a1 = {1,2,6,7,8};
        int[]a2 = {2,3,3,5};
        System.out.println(Arrays.toString(asd(a1,a2)));


    }
    private static List<Integer>joinLists(List<Integer>list1,List<Integer>list2){
        List<Integer>joins = new ArrayList<>();
        joins.addAll(list1);
        joins.addAll(list2);
        Collections.sort(joins);
        return joins;
    }
    private static List<Integer>joinLists2(List<Integer>list1,List<Integer>list2){
        List<Integer>joins = new ArrayList<>();
        int lentgh1 = list1.size();
        int length2 = list2.size();
        int i =0;
        int j=0;
        int k=0;
        while(i<lentgh1&&j<length2){
            if(list1.get(i)<list2.get(j)){
                joins.add(k,list1.get(i));
                i++;
            }else if(list1.get(i)>list2.get(j)) {
                joins.add(k,list2.get(j));
                j++;
            }else{
                joins.add(k,list1.get(i));
                joins.add(k++,list2.get(j));
                i++;
                j++;
            }
            k++;
        }
        while(i<lentgh1){
            joins.add(k++,list1.get(i++));
        }
        while(j<length2){
            joins.add(k++,list2.get(j++));
        }
        return joins;
    }
    private static int[] asd (int[] arr,int[] arr2){
        int[]arr3 = new int[arr.length+arr2.length-1];
        int lentgh1 = arr.length;
        int length2 = arr2.length;
        int i =0;
        int j=0;
        int k=0;
        while(i<lentgh1&&j<length2){
            if(arr[i]<arr2[j]){
                arr3[k]=arr[i];
                i++;
            }else if(arr[i]>arr2[j]) {
                arr3[k]=arr[j];
                j++;
            }else{
                arr3[k]=arr[i];
                arr3[k]=arr[j];
                i++;
                j++;
            }
            k++;
        }
        while(i<lentgh1){
            arr3[k++]=arr[i++];
        }
        while(j<length2){
            arr3[k++]=arr[j++];
        }
        return arr3;
    }

}
