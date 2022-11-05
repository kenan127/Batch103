package mentorgrupodevleri;

import java.util.Scanner;

public class Slackten {

    public static void main(String[] args) {



    /*
        Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        isim-soyisim : m b**
        kart no '   ** 1234
        */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz...");
        String isim = input.next();

        System.out.println("lutfen Soy Isminizi giriniz...");
        String soyIsim = input.next();

        System.out.println("lutfen kart biligisini giriniz...");
        String kartBilgisi = input.next();

         char isimIlk = isim.charAt(0);
         String kalanIsim = isim.substring(1).replaceAll("[A-Za-z]","*");
         System.out.println(isimIlk+kalanIsim);

        char soyIsimIlk = soyIsim.charAt(0);
        String kalanSoyIsim = soyIsim.substring(1).replaceAll("[A-Za-z]","*");
        System.out.println(soyIsimIlk+kalanSoyIsim);

        kartBilgisi = "**** **** **** " + kartBilgisi.substring(kartBilgisi.length()-4);
        System.out.println(kartBilgisi);

        }

    }
