import java.util.Scanner;
public class Soru6 {
    public static void main(String[] args) {
        Scanner klavye= new Scanner(System.in);
        System.out.println("Kilogram cinsinden kilonuzu giriniz.");
        double kilo= klavye.nextDouble();
        System.out.println("Metre cinsinden boyunuzu giriniz.");
        double boy= klavye.nextDouble();
        System.out.println("Eğer erkek iseniz 1'i, kadın iseniz 2'yi tuşlayınız");
        byte cinsiyet= klavye.nextByte();
        double BKI= kilo/boy*boy;
        if (cinsiyet==1 && BKI>=25){
            System.out.println("KİLOLU");
        }
        else if (cinsiyet==1 && BKI<25){
            System.out.println("KİLOLU DEĞİL");
        }
        else if (cinsiyet==2 && BKI>=23){
            System.out.println("KİLOLU");
        }
        else if (cinsiyet==2 && BKI<23){
            System.out.println("KİLOLU DEĞİL");
        }
        else {
            System.out.println("Hatalı giriş yaptınız");
        }




    }
}
