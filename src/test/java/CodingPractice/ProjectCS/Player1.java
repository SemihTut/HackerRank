package CodingPractice.ProjectCS;

import java.util.*;

public class Player1{
    public int listNumber;
    public int point;
    private int element;

    public Player1(int listNumber, int point, int element) {
        this.listNumber = listNumber;
        this.point = point;
        this.element = element;
    }


    public int getListNumber() {
        return listNumber;
    }

    public void setListNumber(int listNumber) {
        this.listNumber = listNumber;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }
}
