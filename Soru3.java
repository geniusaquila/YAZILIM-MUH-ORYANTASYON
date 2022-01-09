public class Soru3 {

        public static void main(String[] args) {


            int toplam = 0;
            for (int i = 1; i <= 100; i++) {
                int i1 = i * i;
                toplam = i1 + toplam;

            }
            System.out.println(toplam);
            int toplam2 = 0;
            for (int x = 1; x <= 100; x++) {
                toplam2 = x + toplam2;
            }
            int toplam3 = toplam2 * toplam2;
            System.out.println(toplam3);
            int top4 = toplam3 - toplam;
            System.out.println("İlk on sayının toplamının karesinin ilk 10 sayının kareleri toplamından farkı: " + top4);
        }


    }

