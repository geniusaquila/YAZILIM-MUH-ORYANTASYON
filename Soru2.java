import java.util.Scanner;
public class Soru2 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi= klavye.nextInt();
        if (sayi%2==0){
            System.out.println("Girdiğiniz sayı çift");
        }
        else{
            System.out.println("Girdiğiniz sayı tek");
        }
    }
}
