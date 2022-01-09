import java.util.Scanner;
public class Soru9 {
    public static void main(String[] args) {
        Scanner klavye= new Scanner(System.in);
        System.out.println("Üçgenin yükseklik değerini giriniz");
        double yukseklik= klavye.nextDouble();
        System.out.println("Üçgenin taban uzunluğunu giriniz");
        double taban= klavye.nextDouble();
        double alan= taban*yukseklik/2;
        System.out.println("Özelliklerini verdiğiniz üçgenin alanı "+ alan + " olarak bulunmuştur");
    }
}
