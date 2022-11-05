package day02methodcreation;

public class MethodCreation {

    // main method içinde kullanacağınız her şey " static" olmalı
    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));

        System.out.println(ucSayiyiCarp(2,1.5,6));

        System.out.println(ilkİkiyiToplaUcuncuIleCarp(2,8,3.2));

        //sout yazıp "Enter"a basınız System.out.println() otomatik olarak yazılır.
        // Ekrana bir şey yazdırmak için iki tane kod var. 1. System.out.println()
        // ln:line (satır) println yazır sonraki satıra geç demek. ln satır başı yapar.
        // 2. System.out.print() tek satırda yazıyı aktarır.


    }

    // Example 1 : Toplama işlemi yapan bir method oluşturunuz.
    public static double toplamaYap (double a, double b){
        return a+b;
    }

    // Example 2 : üç sayıyı birbiriyle çarpan bir method oluşturunuz.
    public static double ucSayiyiCarp (double a, double b, double c){
        return a*b*c;
    }

    // Example 3: uc sayıdan ilk ikisini toplayıp ucuncu ile carpan method olusturup sonucu ekrana yazdırınız
    public static double ilkİkiyiToplaUcuncuIleCarp (double a, double b, double c){

        return (a+b) * c;
    }
}
