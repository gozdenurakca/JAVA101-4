import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.print("Lütfen bir sayı giriniz : ");
            input = scanner.nextInt();
            total += input;
        } while(input != 0);

        System.out.println("Girilen Sayıların Toplamı : " + total);

    }
}
