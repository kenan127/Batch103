package ssg;

import java.util.Scanner;

public class C04_IfStatement_041022 {

    public static void main(String[] args) {

        /*
       maaş teklifi alınız
      teklif 60000 az ise kabul etmeyiniz
      teklif 80000 den az ise konuşabiliriz
      teklif  80000 den fazla ise kabul ediniz
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Maaş teklifiniz nedir ? ");
        double teklif = input.nextDouble();

        if (teklif<60000){
            System.out.println("kabul etmiyorum");
        } else if (teklif<=80000){
            System.out.println("konuşabiliriz");
        }else if (teklif>80000){
            System.out.println("kabul ediyorum");
        }


    }
}
