package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
        1) HashTable, bir Map'tir.
        2) HashTable entrySet'leri herhangi bir siralamaya tabi tutmazlar.
        3) HashTable, HashMaplerden daha yavastir. Cunku HashTable'lar thread-safe ve synchronized'dir. Hashmapler degildir
        thread-safe= ayni anda birden fazla is yapma. corba pisirirken salata yapma
        synchronized = once corbayi yapmak daha iyi. senkronize olmalisin.
        4) HashTablelarda Key ve Valueler null olamaz. NullPointerExpection atar. Hashmapler atmaz.

        Note = toString(), objeleri konsolda detaylari ile gorebilmek icin class'larin icinde olusturulur.
               toString() olusturmadan object'i console'a yazdirirsaniz Java o object'in address'ini yazdirir.

               hiz onemliyse hashmap
               thread-safe ve synchronized hashtable
               siralama onemliyse treemap


     */

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulation = new Hashtable<>();
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Turkey", 90000000);
        System.out.println(countryPopulation);

        //countryPopulation.put(null, 90000000); // Key, null olamaz. NullPointerExpection atar.
        //countryPopulation.put("France", null); // Value, null olamaz. NullPointerExpection atar.


        Hashtable<String, Students> myStudents = new Hashtable<>();

        myStudents.put("Math", new Students("Tom Hanks", "th@gmail.com", 21, true));
        System.out.println(myStudents);

        String name = myStudents.get("Math").name;
        System.out.println(name); //Tom Hanks

        int age = myStudents.get("Math").age;
        System.out.println(age); //21
    }
}
