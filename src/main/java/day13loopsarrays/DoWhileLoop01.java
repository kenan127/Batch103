package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        // Example 1: Kullanicidan bir sayi aliniz.
        // sayi 100den kucuk ise ekrana "Kazandin" yazdiriniz
        // Aksi halde ekrana "Kaybettin" yazdiriniz.
        // Kullanici kazandikca oyun devam etmeli.

        Scanner input = new Scanner(System.in);
//        int sayi = 0;
//
//        do{
//            System.out.println("Lutfen bir sayi giriniz...");
//             sayi = input.nextInt();
//
//            if(sayi<100){
//                System.out.println("Kazandin");
//            }
//
//        } while (sayi<100);
//
//        System.out.println("Kaybettin");


        // Example 2: Kullanicidan isimler aliniz.
        // Ilk harfinin buyuk olup olmadigini kontrol ediniz

        String isim = "";

        do {
            System.out.println("Lutfen isminizi giriniz...");
            char ilkHarf = input.next().charAt(0);

            if (ilkHarf >= 'A' && ilkHarf <= 'Z'){
                System.out.println("Ismi basariyla girdiniz");
            } else {
                System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal edilmistir.");
                break;
            }
        } while (true);

        //infinite loop : sonsuz dongu

        // Arttirma Azaltma kisminda hata yaparsaniz Infinite Loop sorunsali olusur.

//        for (int i = 1; i<4; i--){
//            System.out.println("Hi!");
//        }

        // Arttirma Azaltma kisminda hata yaparsaniz Infinite Loop sorunsali olusur.
//        for (int i = 1; i<4; ){
//           System.out.println("Hi!");
//        }

        // Arttirma Azaltma kisminda hata yaparsaniz Infinite Loop sorunsali olusur.

//        int i = 12;
//
//            while (i<15){
//                System.out.println("Hi!");
//            }



    }
}
