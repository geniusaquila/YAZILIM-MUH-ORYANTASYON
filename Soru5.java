import java.util.Scanner;
public class Soru5 {
    public static void main(String[] args){
    Scanner scn= new  Scanner(System.in);
    int a;
    int b;
    int c;
    a = scn.nextInt();
    b = scn.nextInt();
    c = scn.nextInt();

    if (a<b && a>c || a>b && a<c) {
        System.out.println("En büyük ikinci sayı"+ a);


    }
    else if (b<a && b>c || b>a && b<c ) {
        System.out.println("En büyük ikinci sayı " + b);
    }
    else if (c<a && c>b || c>a && c<b)
    {
        System.out.println("En büyük ikinci sayı " +c);
    }


}


}

