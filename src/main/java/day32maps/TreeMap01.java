package day32maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap01 {

    /*
        1) TreeMap'ler entrySetleri key'lere gore "natural order"da siralar
        2) TreeMap'ler en yavas maplerdir.
        3) TreeMap'ler thread-safe ve syncronized degildir.
        4)

    */

    public static void main(String[] args) {

        TreeMap<String, Double> salaries = new TreeMap<>();

        salaries.put("Tom Hanks", 3000.00);
        salaries.put("Mary Star", 1000.00);
        salaries.put("Jimmy Jones", 5000.00);
        salaries.put("Kevin Bridgeman", 6000.00);

        System.out.println(salaries); //{Jimmy Jones=5000.0, Kevin Bridgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        //tailmap() verilen keyden baslayarak sona kadar tum entryleri size verir.
        SortedMap<String,Double> map1 =  salaries.tailMap("Kevin Bridgeman");
        System.out.println(map1);  //{Kevin Bridgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}
        //tailmap(String, false) verilen keyden baslayarak sona kadar tum entryleri size verir ama false oldugu icin keyi almaz .
        NavigableMap<String,Double> map2 = salaries.tailMap("Kevin Bridgeman",false);
        System.out.println(map2);  // {Mary Star=1000.0, Tom Hanks=3000.0}

        NavigableMap<String,Double> map3 = salaries.subMap("Kevin Bridgeman", true,"Tom Hanks",false);
        System.out.println(map3); // {Kevin Bridgeman=6000.0, Mary Star=1000.0}

        // lowerEntry(), keyden bi oncekini verir.
        Map.Entry<String,Double> map4 = salaries.lowerEntry("Mary Star");
        System.out.println(map4); // Kevin Bridgeman=6000.0
        // olmayan key yazilirsa onu da alfabetik siraya koyar hayali olarak. oncesini verir.
        Map.Entry<String,Double> map5 = salaries.lowerEntry("Paris Hilton");
        System.out.println(map5); // Mary Star=1000.0

        //lowerEntrynin tersi higherEntry()
        Map.Entry<String,Double> map6 = salaries.higherEntry("Mary Star");
        System.out.println(map6); // Tom Hanks=3000.0

        //ceilingEntry key varsa onu verir. yoksa yazdigin keyin alfabetik siralamada arkasindan geleni verir.
        Map.Entry<String,Double> map7 = salaries.ceilingEntry("Mary Star");
        System.out.println(map7); // Mary Star=1000.0

        Map.Entry<String,Double> map8 = salaries.ceilingEntry("Paris Hilton");
        System.out.println(map8); // Tom Hanks=3000.0

        Map.Entry<String,Double> map9 = salaries.floorEntry("Mary Star");
        System.out.println(map9); // Mary Star=1000.0

        Map.Entry<String,Double> map10 = salaries.floorEntry("Paris Hilton");
        System.out.println(map10); // Mary Star=1000.0


    }
}
