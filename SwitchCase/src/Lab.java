import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayı -> ");
        float x = Float.parseFloat(input.nextLine());
        System.out.print("2. sayı -> ");
        float y = Float.parseFloat(input.nextLine());
        System.out.print("İşlem türü giriniz ('+,-,*,/') ->");
        char islem = input.nextLine().charAt(0);

        switch (islem)
        {
            case '+' :
                System.out.println("Sonuç : " + (x+y));
                break;
            case '-':
                System.out.println("Sonuç : " + (x-y));
                break;
            case '*' :
                System.out.println("Sonuç : " + (x*y));
                break;
            case '/' :
                System.out.println("Sonuç : " + (x/y));
                break;
            default:
                System.out.println("Böyle bir operatör bulunmamaktadır.");
        }



    }
}
