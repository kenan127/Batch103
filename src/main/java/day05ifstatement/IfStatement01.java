package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Example 1: Kullanıcıdan alınan sayının tek mi çift mi olduğunu ekrana yazan kodu giriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz...");
        int s = input.nextInt();
            // 1. Yol  2 kontrol var

        if(s%2==0){
            System.out.println(" Çift Sayı...");
        }
        if(s%2!=0){
            System.out.println("Tek sayı");
        }
                // "!=" demek 'eşit değil' demektir.


            // 2. Yol  1 kontrol var
        if(s%2==0){
            System.out.println("Çift Sayı...");
        }
        else{
            System.out.println(" Tekkk Sayı");
        }


            //Example 2: Bir sayının negatif, pozitif veya nötr olduğunu söyleyen kodu yazınız.

        System.out.println("Bİr sayı giriniz...");

        double d = input.nextDouble();

        if(d>0) {
            System.out.println(" Pozitif ");
        } else if (d==0) {
            System.out.println("Notr");
        }else {
            System.out.println("negatif");
        }


    }

}
