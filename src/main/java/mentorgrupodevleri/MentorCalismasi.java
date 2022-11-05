package mentorgrupodevleri;

import java.util.Scanner;

public class MentorCalismasi {

    public static void main(String[] args) {

        // Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya çift olduğunu yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Bir tamsayi griniz....");
        int sayi = input.nextInt();

            if (sayi%2==0){
                System.out.println("Verdiginiz sayi cift sayidir");
            } else System.out.println("Verdiginiz sayi cift sayidir");



 //Kullaniciya gunde ne kadar cay ictigini ve ne kadar seker kullandigini sorun.
// Yilda kac kg seker kullandigini hesaplayin ve yazdirin.
// 1 seker = 1.7 gr


       // Size verilen bir tam sayinin rakamlari toplamini ekrana yazdiran kodu yaziniz
            int a = 123;
            int sonuc = 0;
            for(int i = a; i>0 ; i=i/10 ) {

                sonuc = sonuc + i%10;
            }
        System.out.println(sonuc);

// kullanicidan aldigin stringi tersten yazan kodu yaziniz


    System.out.println("bir string giriniz... ");
    String str = input.next();
    String ters = "";

    for (int i = str.length()-1; i>=0 ; i--  ){

        System.out.print(""+str.charAt(i));
    }

// 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları
// aynı satırda iki ardışık tam sayı arasında boşluk bırakarak yazınız.

            int x = 98;
        do {
                if (x%4==0 && x%6==0)
                    System.out.print(x);
                x--;
        } while ( x<=120 && x>=11);



    }
}

