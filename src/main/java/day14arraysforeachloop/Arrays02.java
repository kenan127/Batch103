package day14arraysforeachloop;

import jdk.jfr.TransitionTo;

import java.lang.annotation.Native;
import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {

    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz.
        //            [2, 3, 12, 0,  0,  0]

        /*
        1.adim: sifirli array olusturulur. eleman sayisi orjinal arrayle ayni olmali
        2.adim: sifir mi ?? sifirsa bisey yapma.rakam ara ve indexte sirala
        3.adim:
         */

        int orginal[] = {0, 2, 3, 0, 12, 0};

        int yeni[] = new int[orginal.length];

        int idx = 0;

        for (int i=0 ; i<orginal.length ; i++){
            if (orginal[i] != 0){
                yeni[idx] = orginal[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));

        //Example 2: Bir arrayin icinde herhangi bir elemanin olup olmadigini kontrol eden kodu yaziniz.
        //              [2, 1, 2, -3, 2]. ==> kullanici 2yi sordu ==> "2"elemani var ve 3 kere tekrarlandi.
        //                                ==> kullanici 6yi sordu ==> "6"elemani yok ve 0 kere tekrarlandi      .

            int arr[] = {2, 1, 2, -3, 2};

            int eleman = 2;

            int counter = 0; // FLAG; bazi durumlarin olup olmadigini kontrol etmek icin Flag kullanilir.

            for (int w : arr){

                if (w==eleman){
                    counter++;
                }
            }

            if (counter>0){
                System.out.println(eleman + " arrayde " + counter + " defa vardir");
            } else {
                System.out.println(eleman + " arrayde yoktur.");
            }

            //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz.
            //          "Java kolaydir calisana, ne kolay ki calismayana."

        String sentence = "Javaaaaaaaaaaa kolaydir calisana, ne kolay ki calismayana.";
          sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        String words[] = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));
        System.out.println(words[words.length-1]);




    }
}
