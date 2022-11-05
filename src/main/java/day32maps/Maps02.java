package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {

    public static void main(String[] args) {

        //Size verilen bir kelimedeki kullanilan harflerin kacar kere kullanildigini yazan kodu yaziniz.
        // kelime = "abbcaa" a=3, b=2, c=1

        String kelime = "abbcaa";
        String kelimearr[] = kelime.split("");
        System.out.println(Arrays.toString(kelimearr));

        HashMap<String, Integer> map1 = new HashMap<>();

        for (String w: kelimearr){

            Integer sayi = map1.get(w);

            if (sayi==null){
                map1.put(w,1);

            }else map1.put(w, sayi+1);


        }
        System.out.println(map1);

    }
}
