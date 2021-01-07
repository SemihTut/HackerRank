package CodingPractice.ProjectCS;

import java.util.ArrayList;
import java.util.*;

public class GamePlaying {


    public static void main(String[] args) {
        List<Integer> list0 = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0));
        List<Integer> list1 = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0));

        int i = 0;
        int dizi;
        int eleman;
        do {
            i++;
            System.out.println(i % 2 != 0 ? "Player 1 oynuyor" : "Player 2 oynuyor");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lutfen 0-3 arasinda bir dizi seciniz ?");
            dizi = scanner.nextInt();
            System.out.println("Lutfen 0-6 arasi bir konum seciniz");
            int konum = scanner.nextInt();
            System.out.println("Lutfen 1 veya 2 giriniz");
            eleman = scanner.nextInt();

            switch (dizi) {

                case 0:
                    if (isNull(list0, konum)) {
                        list0.set(konum, eleman);
                    } else {
                        System.out.println("Lutfen 0-6 arasi yeni bir konum seciniz");
                        list0.set(scanner.nextInt(), eleman);
                    }
                    break;
                case 1:
                    if (isNull(list1, konum)) {
                        list1.set(konum, eleman);
                    } else {
                        System.out.println("Lutfen 0-6 arasi yeni bir konum seciniz");
                        list1.set(scanner.nextInt(), eleman);
                    }
                    break;
                case 2:
                    if (isNull(list2, konum)) {
                        list2.set(konum, eleman);
                    } else {
                        System.out.println("Lutfen 0-6 arasi yeni bir konum seciniz");
                        list2.set(scanner.nextInt(), eleman);
                    }
                    break;
                case 3:
                    if (isNull(list3, konum)) {
                        list3.set(konum, eleman);
                    } else {
                        System.out.println("Lutfen 0-6 arasi yeni bir konum seciniz");
                        list3.set(scanner.nextInt(), eleman);
                    }
                    break;
            }

            for(int k=0;k<7;k++){
                System.out.println(list0.get(k)+" |"+list1.get(k)+" |"+list2.get(k)+" |"+list3.get(k));
            }
           // System.out.println(list0 + "\n" + list1 + "\n" + list2 + "\n" + list3);
        } while (!isWon(list0, list1, list2, list3, dizi));
        System.out.println(i % 2 != 0 ? "Player 1 kazandi" : "Player 2 kazandi");
    }

    public static boolean isNull(List<Integer> liste, int index) {
        return liste.get(index) == 0;
    }

    public static boolean isWon(List<Integer> list0, List<Integer> list1, List<Integer> list2, List<Integer> list3, int dizi) {
        for (int i = 0; i < 5; i++) {
            switch (dizi) {
                case 0:
                    List<Integer> subList = list0.subList(i, i + 3);
                  //  System.out.println("subList = " + subList);
                    if (isSame(subList)) {
                        if (list0.get(i) == list1.get(i) && list0.get(i) != 0) {
                            return true;
                        }
                    }
                    break;
                case 1:
                    List<Integer> subList1 = list0.subList(i, i + 3);
                    List<Integer> subList11 = list1.subList(i, i + 3);
                    if (isSame(subList1)) {
                        if (list0.get(i) == list1.get(i)) {
                            return true;
                        }
                    }
                    if (isSame(subList11)) {
                        if (list1.get(i) == list2.get(i)) {
                            return true;
                        }
                    }
                    break;
                case 2:
                    List<Integer> subList2 = list1.subList(i, i + 3);
                    List<Integer> subList22 = list2.subList(i, i + 3);
                    if (isSame(subList2)) {
                        if (list1.get(i) == list2.get(i)) {
                            return true;
                        }
                    }
                    if (isSame(subList22)) {
                        if (list2.get(i) == list3.get(i)) {
                            return true;
                        }
                    }
                    break;
                case 3:
                    List<Integer> subList3 = list2.subList(i, i + 3);
                    if (isSame(subList3)) {
                        if (list2.get(i) == list3.get(i)) {
                            return true;
                        }
                    }
                    break;
            }
        }
        return false;
    }
    public static boolean isSame(List<Integer> liste) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < liste.size(); i++) {
            List<Integer> subList = liste.subList(i, i + 3);
            for (Integer s : subList) {
                freq.merge(s, 1, Integer::sum);
                return freq.size() == 1 && freq.get(0) == null;
            }
        }
        return false;
    }
}
