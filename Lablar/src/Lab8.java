import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        // Yarıçapı değeri girilen bir dairenin çevresi ve alanını bulan bir program:
        // alan : pi * r^2
        // cevre : 2 * pi * r
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yarıçap değeri giriniz : ");
        float r = input.nextFloat();
        double alan = Math.PI * Math.pow(r,2);
        double cevre = 2 * Math.PI * r;
        System.out.println(r + " yarıçap değerli dairenin alanı : " +alan);
        System.out.println(r + " yarıçap değerli dairenin çevresi : " +cevre);

    }
}
