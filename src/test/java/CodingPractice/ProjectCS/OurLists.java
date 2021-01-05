package CodingPractice.ProjectCS;

import java.util.*;

public class OurLists {

    public List<Integer> list0;
    public List<Integer> list1;
    public List<Integer> list2;
    public List<Integer> list3;

    public OurLists(List<Integer> list0, List<Integer> list1, List<Integer> list2, List<Integer> list3) {
        this.list0 = list0;
        this.list1 = list1;
        this.list2 = list2;
        this.list3 = list3;
    }

    public List<Integer> getList0() {
        return list0;
    }

    public void setList0(int number) {
        getList0().add(number);
    }

    public List<Integer> getList1() {
        return list1;
    }

    public void setList1(int number) {
        getList1().add(number);
    }

    public List<Integer> getList2() {
        return list2;
    }

    public void setList2(int number) {
        getList2().add(number);
    }

    public List<Integer> getList3() {
        return list3;
    }

    public void setList3(int number) {
        getList3().add(number);
    }

    @Override
    public String toString() {
        return "OurLists{" +
                "list0=" + list0 +
                ", list1=" + list1 +
                ", list2=" + list2 +
                ", list3=" + list3 +
                '}';
    }
}
