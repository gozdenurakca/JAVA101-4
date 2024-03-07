import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        // kullanıcının girmiş olduğu vize ve final notuyla ortalama bulan bu duruma göre kalma ve geçmeyle ilgili kodlar:

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen vize notunuzu giriniz : ");
        float vizeNotu = input.nextFloat();
        System.out.print("Lütfen final notunuzu giriniz : ");
        float finalNotu = input.nextFloat();

        float ortalama = 0;
        ortalama = (vizeNotu * 40 / 100) + (finalNotu * 60 / 100);
        System.out.println("Ortalama : " + ortalama );

        if((ortalama >= 50  && finalNotu >= 50) && (finalNotu <= 100 && ortalama <= 100)) {
            System.out.println("Tebrik ederiz, dersi başarıyla geçtiniz.");
        } else if((ortalama < 50 && ortalama >= 0) && (finalNotu < 50 && finalNotu >= 0)) {
            System.out.println("Seneye bu dersi tekrardan almanız gerekmektedir, üzgünüz.");
        } else {
            System.out.println("Hatalı işlem tespit edildi, lütfen tekrar deneyin.");
        }




    }
}
