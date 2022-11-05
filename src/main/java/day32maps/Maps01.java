package day32maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps01 {

    public static void main(String[] args) {

        //Size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren kodu yaziniz.
        //" I like to move it, move it." I=1, like=1, to=1, move=2, it=2 ==> bu yapi key ve value icerir. Map kullan.

        String str = "I like to move it, move it.";

        //noktalama isaretleri silinmeli. java kelimeleri farkli gorur silinmezse.
        str = str.replaceAll("\\p{Punct}","");
        System.out.println(str); // I like to move it move it

        //Kelimeleri almak icin split kullan.
        String kelimeler[] = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        HashMap<String, Integer> gorunum = new HashMap<>(); // {          }

        for (String w : kelimeler){

            Integer gorunumSayisi = gorunum.get(w);

            if (gorunumSayisi == null){
                gorunum.put(w,1);

            }else {
                gorunum.put(w, gorunumSayisi+1);
            }
        }
        System.out.println(gorunum);



    }
}
