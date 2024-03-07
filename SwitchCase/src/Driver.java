import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Haftanın kaçıncı günü ? ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Bugün pazartesidir.");
                break;
            case 2:
                System.out.println("Bugün salıdır.");
                break;
            case 3:
                System.out.println("Bugün çarşambadır");
                break;
            case 4:
                System.out.println("Bugün perşembedir.");
                break;
            case 5:
                System.out.println("Bugün cumadır.");
                break;
            case 6:
                System.out.println("Bugün cumartesidir.");
                break;
            case 7:
                System.out.println("Bugün pazardır.");
                break;
            default:
                System.out.println("Yanlış değer girniz. Lütfen tekrar deneyiniz.");
                break;
        }


    }
}
