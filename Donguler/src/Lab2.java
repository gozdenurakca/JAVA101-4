import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        int x = 0;
        int y = 100;
        while (x < y)
        {
            if(x % 2 == 0) {
                System.out.print(x + " , ");
            }
            x++;
        }
         */

        //Java'da int türündeki bir değişkenin en büyük değerini
        //elde etmek için Integer.MAX_VALUE sabiti kullanılır.

        /*
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int x = 0;
        System.out.println("Lutfen sırasıyla sayıları giriniz.");
        while (x < 10){
            int sayi = input.nextInt();
            if(sayi > max) {
                max = sayi;
            } if(sayi < min) {
                min = sayi;
            }
            x++;
        }
        System.out.println("Min : " +min);
        System.out.println("Max : " +max);
         */
        /*
        float average = 0;
        int total = 0;
        int count = 0;

        while (true)
        {
            int sayi = input.nextInt();
            if(sayi == 0) {
                break;
            }
            count++;
            total += sayi;
            average = total / count;
        }
        System.out.println("Toplam : " + total);
        System.out.println("Ortalama : " + average);
         */

        int pozitiveCount=0;
        int negativeCount = 0;
        while (true) {
            int sayi = input.nextInt();
            if(sayi > 0){
                pozitiveCount++;
            } else if (sayi < 0) {
                negativeCount++;
            } else
                break;
        }
        System.out.println(pozitiveCount + " tane pozitif sayı vardır.");
        System.out.println(negativeCount + " tane negatif sayı vardır.");
    }
}
