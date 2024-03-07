import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {

        // kullanıcıdan kaç tane sayının girilmesi gerektiğini soracağız, ardından rastgele üretilen sayıların
        // ortalamasını bulacağız.

        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı üretilsin ? ");
        int adet = input.nextInt();
        int[] sayilar = new int[adet];

        for(int i = 0; i < sayilar.length; i++)
        {
            sayilar[i] = rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(sayilar));

        float average = 0.0f;
        float total = 0;
        for(int i = 0; i < sayilar.length; i++)
        {
            total += sayilar[i];
        }
        average = total / adet;
        System.out.println("Sayıların toplamı : " + total);
        System.out.println("Ortalama : " + average);
    }
}
