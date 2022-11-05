package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    /*
        ArrayList'ler ayni data typena sahip birden fazla datayi depolamak icin kullanilir.
        Array ile Arraylistin farklari:

        1.  Array olustururken Array icine kac tane eleman koymamiz gerektigini soylemeliyiz.
        soyledigimiz eleman sayisindan fazla eleman koyamayiz.
        Arrayler eleman sayisinda "fixed"dirler.
        ArrayList'leri olustururken eleman sayisi soylemeye gerek yoktur Cunku ArrayList'ler eleman
        sayisinda flexible'dirlar.

        2.  Arraylerin icine primitive date type ve reference koyulabilirken ArrayList'lerin icine sadece
        NON - PRIMITIVEler kullanilir.

        3. Arrayler super fast, Arrayler memoryi cok az kullanilir.
        NOTE: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz ama
        eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin.

        */
    public static void main(String[] args) {

        // ArrayList nasil olusturulur ?
        // 1. Yol;
        ArrayList<Integer> ages = new ArrayList<Integer>();

        // 2. Yol;
        ArrayList<Integer> heights = new ArrayList<>();

        // 3. Yol;
        List<Integer> nums = new ArrayList<Integer>();

        // ArrayList'ler nasil yazdirilir ?
        System.out.println(nums); // []

        // ArrayList'lere nasil eleman eklenir ?
        //(insertion order)
        // boolean return eder.
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);  //[21, 18, 20]

        nums.add(1,50);  // ==> voidtir. hic birsey return etmez
        System.out.println(nums); //[21, 50, 18, 20]


        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums); //[21, 50, 18, 20, 23, 185]
        System.out.println(prices); //[23, 185]

        nums.addAll(2,prices);
        System.out.println(nums); //[21, 50, 23, 185, 18, 20, 23, 185]

        //ArrayList'lerin eleman sayilari nasil bulunur ?
        int elemanSayisi = nums.size();
        System.out.println("elemanSayisi = " + elemanSayisi);  // 8

        // Arrayde lenght, ArrayList'lere size icindeki sayiyi verir.

        //ArrayList'lerde herhangi bir eleman nasil verilir ?
        // get() methodu istenen bir indexteki metodu verir
        int el1 = nums.get(3);
        System.out.println("el1 = " + el1);

        //ArrayList'in bos olup olmadigini nasil anlariz.   boolean return eder.
        boolean bos1 = nums.isEmpty();
        System.out.println(bos1);  //false
        boolean bos2 = ages.isEmpty();
        System.out.println(bos2); //true

        // ArrayList'de bir eleman nasil degistirilir ?
        // set() programlamada update olarak kullanilir.
        nums.set(3,200);
        System.out.println("nums = " + nums);  //[21, 50, 23, 200, 18, 20, 23, 185]

        //[21, 50, 23, 200, 18, 20, 23, 185]

        //Example 1: nums arraylistindeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz.

        for(int w : nums){
            if (w%2!=0){
                nums.set(nums.indexOf(w), w+11);
            }
        }
        System.out.println(nums);  // once [21, 50, 23, 200, 18, 20, 23, 185] ==>  [32, 50, 34, 200, 18, 20, 34, 196]

        // ArrayList'de remove() methodunun icine tamsayi kkoyarsaniz java onu index olarak tanimlar.
        // deger wrapper classa cevrilmeli.

        //Example 2: ArrayList'den 34 elemaninin ilk gorunumunu siliniz.

        //Note 1: Tum tamsayilar JAva icin aksi soylenmedikce primitivedir. yani int'dir.
        //Note 2: '"primitive"ler ArrayList'lerin elemani olamazlar.
        //Note 3: 'primitive'i "Wrapper Class"a cevirseniz, non-primitive olur ve ArrayListlerin elemani olur, indexi olamaz.

        Integer sayi = 34; // NON-PRIMITIVE bu. n-p ler index olarak kabul edilmez deger olarak bakilir.
        nums.remove(sayi);
        System.out.println(nums);  //[32, 50, 200, 18, 20, 34, 196]

            //eleman sayisinda eminsen hafizada daha az yer kaplamak icin array kullan

    }
}
