import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        // Kullanıcıdan parola isteyeceğiz ve doğru şifre girilene kadar şifre soracağız.
        Scanner input = new Scanner(System.in);
        String password = "";

        do {
            System.out.print("Lütfen parolanızı giriniz : ");
            password = input.nextLine();
        } while (!password.equals("1234")); // yani kullanıcı "1234" değerini girene kadar parola sormuş olacağız.
        System.out.println("Tebrikler, hesaba giriş yapılmıştır.");


    }
}