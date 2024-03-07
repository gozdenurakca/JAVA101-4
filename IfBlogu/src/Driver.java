import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz -> ");
        int number = input.nextInt();

        /*if(number > 0)
        {
            System.out.println(number + " pozitif bir sayıdır.");
        } else if(number == 0) {
            System.out.println(number + " sayısını girdiniz.");
        } else {
            System.out.println(number + " negatif bir sayıdır.");
        }
         */
        /*
        if(number % 2 == 0)
        {
            System.out.println(number + " sayısı çifttir.");
        } else {
            System.out.println(number + " sayısı tektir.");
        }

         */
        /*
        if(number < 100) {
            System.out.println(number + " 100'den küçüktür.");
            if(number > 50) {
                System.out.println(number + ", 100'den küçük, 50'den büyüktür.");
            } else {
                System.out.println(number + ", 100'den ve 50'den küçüktür.");
            }
        }
         */
        if(number >= 1 && number <= 9) {
            System.out.println(number + " tek basamaklıdır.");
        } else if (number >= 10 && number <= 99) {
            System.out.println(number + " çift basamaklıdır.");
        } else if (number >= 100 && number <= 999) {
            System.out.println(number + " üç basamaklıdır.");
        } else if (number >= 1000 && number <= 9999) {
            System.out.println(number + " dört basamaklıdır.");
        } else {
            System.out.println(number + ", 1 && 9999 arasında değildir.");
        }
    }
}
