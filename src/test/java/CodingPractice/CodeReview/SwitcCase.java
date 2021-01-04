package CodingPractice.CodeReview;

public class SwitcCase {
    public static void main(String[] args) {
        int first = 0, int second = 0;
        int third = 0;
        int i = 0;
        int sayi;
        do {
            sayi = (int) (Math.random() * 5) + 1;
            switch (sayi) {
                case 1:
                    first++;
                    break;
                case 2:
                    second++;
                    break;
                case 3:
                    third++;
                    break;
            }
        } while (i < 3);
    }
}
