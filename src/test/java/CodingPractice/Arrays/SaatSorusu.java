package CodingPractice.Arrays;

public class SaatSorusu {
    public static void main(String[] args) {
        int v1 = 90;
        int v2 = 45;
        int v3 = 75;
        int ebob = 1;
        int ekok;

        for (int i = 1; i <= v1 && i <= v2 && i <= v3; ++i) {
            if (v1 % i == 0 && v2 % i == 0 && v3 % i == 0)
                ebob = i;

        }
        ekok = v1*v2*v3/ebob;
        System.out.println("ekok = " + ekok);
        System.out.println("ebob = " + ebob);
        int akrep=(ekok/60)%12;
        int yelkovan = (ekok/60)%60;

        int sameHourAgain = 3 +akrep;

        String yelkovanString = String.valueOf(yelkovan);

        System.out.println("Saat = " + sameHourAgain + ":"+yelkovanString);

    }

}
