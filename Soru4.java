import java.util.Scanner;
public class Soru4 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int sayi1, sayi2;
        System.out.println("Lütfen vize notunuzu giriniz");
        sayi1= scn.nextInt();
        System.out.println("Lütfen final notunuzu giriniz");
        sayi2= scn.nextInt();
        double v = sayi1 * 0.4;
        double v1= sayi2 *0.6;
        double v2= v + v1;
        System.out.println(v2);
        if (v2>=50){
            System.out.println("Başarılı");
        }
        else {
            System.out.println("Başarısız");
        }


    }

}
