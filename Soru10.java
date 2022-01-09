import java.util.Scanner;
public class Soru10 {
    public static void main(String[] args) {
        Scanner klavye= new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz");
        Double sıcaklık= klavye.nextDouble();
        if (sıcaklık>=100){
            System.out.println("Gaz");
        }
        else if (sıcaklık<=0){
            System.out.println("Katı");
        }
        else {
            System.out.println("Sıvı");
        }

    }
}
