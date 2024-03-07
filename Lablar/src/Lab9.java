import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Karenin bir kenar uzunluğunu giriniz : ");
        float kenar = input.nextFloat();
        float alan,cevre;
        alan = (float)(Math.pow(kenar,2));
        cevre = kenar * 4;
        System.out.println(kenar + " kenar uzunluğuna sahip karenin alanı : " +alan);
        System.out.println(kenar + " kenar uzunluğuna sahip karenin cevresi : " +cevre);
    }
}
