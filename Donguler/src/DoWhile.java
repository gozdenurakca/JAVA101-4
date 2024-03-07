import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
         */
        Scanner input = new Scanner(System.in);
        String password = null;


        do {
            System.out.print("Lütfen şifrenizi giriniz ->");
            password = input.nextLine();

        } while (!password.equals("123"));
        // Eğer parola "123" değerine eşit değilse do-while döngüsü çalıştırılır anlamında.
        System.out.println("Hoşgeldiniz.");

    }
}
