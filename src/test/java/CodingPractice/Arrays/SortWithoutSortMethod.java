package CodingPractice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SortWithoutSortMethod {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7,3,5,101};
      //  System.out.println("sorting(arr) = " + Arrays.toString(sorting(arr)));
        System.out.println("sortingDesc(arr) = " + Arrays.toString(sortingDesc(arr)));


    }
    public static int[] sorting(int[]arr){
        ArrayList<Integer> list = new ArrayList();
        for(int each: arr) {
            list.add(each);
        }
       //2,3,4,5
        for(int i =0; i<list.size();i++){
            for(int j=0; j<list.size();j++){
                if(list.get(i)<list.get(j)){
                   Integer temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);

                }

            }
        }

        System.out.println("list = " + list);
        for(int i=0; i < list.size(); i++) {

            arr[i] = list.get(i);

        }
        return arr;
    }
    public static int[] sortingDesc(int[]arr){
        ArrayList<Integer>arrList = new ArrayList<>();

        for(int each : arr){
            arrList.add(each);
        }

        for(int i=0; i<arr.length;i++){
            arr[i]=findMax(arrList);
            arrList.remove(Integer.valueOf(arr[i]));

        }
        return arr;
    }
    public static int findMax(ArrayList<Integer>asd){

        int max = Integer.MIN_VALUE;
        for(int each : asd){
            max=Math.max(max,each);

        }
        return max;
    }
}
