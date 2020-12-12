package CodingPractice.HackerRank;
import java.util.*;
import java.util.stream.Collectors;

public class MigratoryBirds {

    public static void main(String[] args) {
    List<Integer>lis = Arrays.asList(1,2,2,3,3,4);
        System.out.println("migratoryBirds(lis) = " + migratoryBirds(lis));
    }

    static int migratoryBirds(List<Integer> arr) {
        Map<Integer,Integer>freq = new HashMap<>();

        for(Integer i : arr){
            freq.merge(i,1,Integer::sum);
        }
        List<Integer> freqValueList = freq.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        int length = freqValueList.size();
        int biggest = freqValueList.get(length-1);
        int secondBiggest = freqValueList.get(length-2);
        int answer = 0;
        for(Integer i : arr){
            if(biggest==secondBiggest){
               if(freq.get(i)==secondBiggest){
                   answer=i;
                   break;
               }
            }else{
                if(freq.get(i)==biggest){
                    answer=i;
                    break;
                }
            }
        }
       return answer;
    }
}
