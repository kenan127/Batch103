package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Example 1: Sayıları kullanıcıdan alan ve toplama işlemi yapan kodu yazınız.

        // 1. Adım: Scanner Classından Obje oluşturun.

        Scanner input = new Scanner(System.in);

        // 2. Adım: Kullanıcıya ne yapacağını söyle
        System.out.println("İlk sayıyı giriniz ...");
        double Sayı1 = input.nextDouble();

        System.out.println("İkinci sayıyı giriniz ...");
        double Sayı2 = input.nextDouble();

        System.out.println(Sayı1 + Sayı2);

    }










}
