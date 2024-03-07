import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        // Kullanıcıdan alınan karakter dizisini tersten yazdırın.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir yazı giriniz ->");
        String yazi = input.nextLine();

        for (int i = yazi.length() -1 ; i >= 0 ; i--) {
            System.out.print(yazi.charAt(i) + " ");
        }
    }
}
