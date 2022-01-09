import java.util.Scanner;
public class Soru8 {

        public static void main(String[] args) {
            Scanner klavye = new Scanner(System.in);
            System.out.println("Pay değerini giriniz");
            int pay = klavye.nextInt();
            System.out.println("Payda değerini giriniz");
            int payda = klavye.nextInt();
            if (payda > pay)
                System.out.println("Basit kesir girdiniz");
            else if (payda == pay)
                System.out.println("Girdiğiniz değer tamsayıdır");
            else {
                int tamkısım = pay / payda;
                int yenipay = pay % payda;
                System.out.println("Bileşik kesir girdiniz, kesir değeri: " + tamkısım + " tam " + yenipay + "/" + payda);
            }
        }

    }

