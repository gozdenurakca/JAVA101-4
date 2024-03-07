import java.util.Date;
import java.util.Scanner;

public class While {
    public static void main(String[] args) throws InterruptedException {
        /*
        int i = 0;
        while(i < 10)
        {
            System.out.println(i);
            i++;
        }
         */
        /*
        while (true)
        {
            System.out.println(new Date());
            Thread.sleep(1000);
        }
         */
        Scanner input = new Scanner(System.in);
        /*
        while (true)
        {
            String text = input.nextLine();
            System.out.println(text.toUpperCase());
        }
        böyle olduğunda gireceğimiz değerleri tek tek alıp büyüterek yazar

         */

        /*
        String text = input.nextLine();
        while (true)
        {
            System.out.println(text.toUpperCase());
        }
        fakat böyle olduğunda bir değer gireriz ve sonsuz döngüye girer.
         */

        System.out.print("Lütfen herhangi bir sayı giriniz -> ");
        while (true)
        {
            int sayi = input.nextInt();
            System.out.println(Math.pow(sayi,2));
        }


    }
}
