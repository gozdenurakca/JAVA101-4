import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz -> ");
        int sayi = input.nextInt();
        int sonuc = sayi;
        for (int i = sayi-1; i > 0 ;i--) {
            sonuc = sonuc * i;
        }
        System.out.print(sayi + " sayısının faktöriyel sonucu = " + sonuc);






















    }
}
