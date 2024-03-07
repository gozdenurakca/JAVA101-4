import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Haftanın kaçıncı günü ? ");
        int gun = input.nextInt();

        switch (gun)
        {
            case 1,2,3,4,5 :
                System.out.println("hafta içindedir.");
                break;

            case 6,7 :
                System.out.println("hafta sonundadır.");
                break;

            default:
                System.out.println("Yanlış değer girdiniz.");
        }

    }
}
