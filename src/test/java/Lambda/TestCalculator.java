package Lambda;

public class TestCalculator {


    public static void main(String[] args) {
        Calculator add = Integer::sum;
        Calculator multiply = (a,b)->a*b;
        Calculator divide = (a,b)->a/b;
        Calculator subtract = (a,b)->a-b;

        System.out.println("subtract = " + calculate(subtract,10,5));
        System.out.println("divide = " + calculate(divide,10,5));
        System.out.println("multiply = " + calculate(multiply,10,5));
        System.out.println("add = " + calculate(add,10,5));

    }

    private static int calculate (Calculator cal, int a, int b){
        return cal.operate(a,b);
    }
}
