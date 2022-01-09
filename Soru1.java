public class Soru1 {
    public static void main(String[] args) {
    int toplam1=0;
    int toplam2=0;
    for (int i = 1; i < 1000; i++) {
        if (i % 3 == 0) {
            toplam1= toplam1+i;
        }
        else if (i%5==0){
            toplam2= toplam2+i;
        }
        else {

        }

    }
    int toplam= toplam1+toplam2;
    System.out.println(toplam);
}
}
