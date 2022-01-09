public class Soru7 {
    public static void main (String[] args) {
    //İstenen şey= 1/2 2/4 4/16 16/256 256/65536 65536/4294967296
    int a=1;
    long b=2;
    for (int t=0; t<6;t++) {

        if (a == 1) {
            System.out.println(a+"/"+b);
            a++;

        }
        else {
            System.out.println(b+"/"+b*b);
            b=b*b;

        }

    }

}
}
