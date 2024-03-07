import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sınav notunuzu giriniz -> ");
        int not = input.nextInt();

        if (not >= 90 && not <= 100) {
            System.out.println("Notunuz : " + not);
            System.out.println("Harf notunuz : AA");
        } else if (not >= 85 && not < 90) {
            System.out.println("Notunuz : " + not);
            System.out.println("Harf notunuz : BA");
        } else if (not >= 80 && not < 85) {
            System.out.println("Notunuz : " + not);
            System.out.println("Harf notunuz : BB");
        } else if (not >= 75 && not < 80 ) {
            System.out.println("Notunuz : " + not);
            System.out.println("Harf notunuz : BC");
        } else if (not >= 70 && not < 75 ) {
            System.out.println("Notunuz : " + not);
            System.out.println("Harf notunuz : CC");
        } else if (not >= 65 && not < 70 ) {
            System.out.println("Notunuz : " + not);
            System.out.println("Harf notunuz : CD");
        } else if (not >= 60 && not < 65 ) {
            System.out.println("Notunuz : " + not);
            System.out.println("Harf notunuz : DD");
        } else if (not >= 50 && not < 60 ) {
            System.out.println("Notunuz : " + not);
            System.out.println("Harf notunuz : DF");
        } else if (not >= 0 && not < 50 ) {
            System.out.println("Notunuz : " + not);
            System.out.println("Harf notunuz : FF");
        } else {
            System.out.println("Lütfen 0-100 arasında bir not giriniz.");
        }


    }
}
