import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        /*
        System.out.print("Lütfen bir sayı giriniz -> ");
        int startCounter = input.nextInt();
        int i = 0;

        while (i < startCounter)
        {
            int j =  0;
            while (j < i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
         */

        long total = 0;
        while (true)
        {
            int sayi = input.nextInt();
            if (sayi == 0)
            {
                break;
            }
            total += sayi;
        }
        System.out.println("Toplam : " + total);
    }
}
