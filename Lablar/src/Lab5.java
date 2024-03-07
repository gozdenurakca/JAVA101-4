import java.util.Arrays;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        //Girilen sayıları tek mi çift mi olduğunu bulan program

        /*Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı girilecek ? ");
        int adet = input.nextInt();
        int[] sayilar = new int[adet];

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print((i+1) + " . Sayı : ");
            sayilar[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(sayilar));

        for (int i = 0; i < sayilar.length; i++) {
            if(sayilar[i] % 2 == 0) {
                System.out.println(sayilar[i] + " Çift sayıdır.");
            } else {
                System.out.println(sayilar[i] + " Tek sayıdır.");
            }
        }
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı girilecek ? ");
        int adet = input.nextInt();
        int[] sayilar = new int[adet];

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print((i+1) + ". Sayı: ");
            sayilar[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(sayilar));

        for (int i = 0; i < sayilar.length; i++) {
            if(sayilar[i] % 2 == 0) {
                System.out.println(sayilar[i] + " Çift Sayıdır.");
            } else {
                System.out.println(sayilar[i] + " Tek Sayıdır.");
            }
        }






















    }
}
