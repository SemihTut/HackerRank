package CodingPractice.CodeReview;

public class OrjinalNot {
    public static void main(String[] args) {

        int[] dizi = new int[]{5, 4, 4, 4, 3, 4, 0, 4, 4, 6, 7, 8, 9, 3, 10, 2};
        int[] notlarSayisi = new int[11];
        for (int i = 0; i < notlarSayisi.length; i++) notlarSayisi[i] = 0;
        for (int k = 0; k < notlarSayisi.length; k++) System.out.print(k + " ");
        System.out.println();
        for (int i = 0; i < dizi.length; i++) {
            notlarSayisi[dizi[i]]++;
/*			switch (dizi[i]){
			case 0 : notlarSayisi[0]++;break;
			case 1 : notlarSayisi[1]++;break;
			case 2 : notlarSayisi[2]++;break;
			case 3 : notlarSayisi[3]++;break;
			case 4 : notlarSayisi[4]++;break;
			case 5 : notlarSayisi[5]++;break;
			case 6 : notlarSayisi[6]++;break;
			case 7 : notlarSayisi[7]++;break;
			case 8 : notlarSayisi[8]++;break;
			case 9 : notlarSayisi[9]++;break;
			case 10: notlarSayisi[10]++;break;



			}
*/
            for (int k = 0; k < notlarSayisi.length; k++) System.out.print(notlarSayisi[k] + " ");
            System.out.println();
        }

        //	for (int i=0;i<notlarSayisi.length;i++) System.out.println(i+" alan ogrenci sayisi "+ no
    }
}
