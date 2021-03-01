package CodingPractice.Arrays;

public class SaatSorusu {
    public static void main(String[] args) {
        int v1 = 90;
        int v2 = 45;
        int v3 = 75;

        int smallest = Math.min(v1,Math.min(v2,v3));

        int ebob = 1;
        int ekok;

        for (int i = 1; i <= smallest; ++i) {
            if (v1 % i == 0 && v2 % i == 0 && v3 % i == 0)
                ebob = i;

        }
        ekok = v1*v2*v3/ebob;
        System.out.println("ekok = " + ekok);
        System.out.println("ebob = " + ebob);
        int akrep=(ekok/60)%12;
        int yelkovan = (ekok/60)%60;

        int sameHourAgain = 3 +akrep;

        System.out.println("Saat = " + sameHourAgain + ":"+yelkovan);
        System.out.println("Saat = " + sameHourAgain + ":"+yelkovan);
        System.out.println("Saat = " + sameHourAgain + ":"+yelkovan);
        System.out.println("Saat = " + sameHourAgain + ":"+yelkovan);

    }

}
