package day12loops;

import java.util.Scanner;

public class WhileLoops01 {

    public static void main(String[] args) {

        //Example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz

        for (int i = 3; i<11 ; i++){
            System.out.print(i+" ");
        }

        System.out.println();

        // 2. yol:
        int i = 3;
        while(i<11){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
        int m = 17;
        while(m>3) {
            if (m % 2 == 0) {
                System.out.print(m + " ");
            }
                m--;
        }

        System.out.println();

    //Example 3: 12den 67e kadar sayilarin toplamini veren kodu yaziniz

        int sum = 0;
        int n = 12;

        while (n<68){
            sum = sum+n ;
            n++;
        }
        System.out.println(sum);

        System.out.println();

        //Example 4: Size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz

            int sonuc = 0;
            int sayi = 385;


        while(sayi>0){

            sonuc = sonuc + sayi%10;

            sayi = sayi/10;
        }
        System.out.println(sonuc);

        System.out.println();

        //Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
        //           3 ==> 3x1=3   3x2=6  3x3=9  ...  3x10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int s = input.nextInt();

        int t = 1;

        while(t<11){
            System.out.println(s+"x"+t+"="+t*s);
            t++;
        }


    }
}
