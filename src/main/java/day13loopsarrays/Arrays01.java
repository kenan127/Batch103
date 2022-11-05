package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {

    /*
        1. Ayni data typende, coklu datayi depolamak icin Javanin olusturdugu yapilar vardir.
           bu yapilardan birisi de "Array"lerdir.
        2.

     */
    public static void main(String[] args) {

//        Byte boolean short,int gibi ... containerlar iclerinde sadece tek bir deger barindirabilir.Ancak bazen coklu deger
//        tasimasini istedigimiz containerlara ihtiyac duyariz.Buna Array denir.
//
//                Icine yerlestirdigimiz Datalarin Data Type'i hep ayni olmalidir

    // Array nasil olusturulur

            int stdAges[] = new int[7]; // [0, 0, 0, 0, 0, 0, 0] 7 adet sifiri koyar veri bekler

    // Array nasil yazdirilir

        System.out.println(Arrays.toString(stdAges));

    // Arraylere eleman nasil eklenir

        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        System.out.println(Arrays.toString(stdAges));

    //  Arraydeki herhangi bir elemani nasil yazdirabilir

        System.out.println(stdAges[4]); //10

    // Example 1: Arraydeki en kucuk ve en buyuk elemani yazdiriniz

        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));


        int ilk = stdAges[0];
        int son = stdAges[stdAges.length-1];

        System.out.println(ilk + son);

        // NOT: length() stringlerde kullanilir, Length arraylerde parantezsiz kullanilir.

        // Example 2: stdAges arrayi icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.

          //1. yol
        int sum = 0;

        for (int i = 0; i<stdAges.length; i++ ){

            sum = sum + stdAges[i];
        }
        System.out.println(sum);

            //2. yol
            int i = 0;
            int toplam = 0;

        while (i<stdAges.length){

            toplam = toplam + stdAges[i];

            i++;

        }
        System.out.println(toplam);

        //3. yol

        int k = 0;
        int topl = 0;
        do {
            topl = topl + stdAges[k];
            k++;

        } while (k < stdAges.length);

        System.out.println(topl);


        //4. yol for each loop ==> arraylerde ve collectionda kullanilir.

            int t = 0;

        for ( int w : stdAges){
            t = t + w;
        }
        System.out.println(t);

        //Example 3: String bir array olusturunuz
//           Bu Array'e 5 tane isim yerlestiriniz
//           Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz

        String stdNames[] = new String[5];

        stdNames[0] = "Ali";
        stdNames[1] = "Tom";
        stdNames[2] = "Veli";
        stdNames[3] = "Kemal";
        stdNames[4] = "Cem";

        System.out.println(Arrays.toString(stdNames));

        int karakterSayilariToplami = 0;

        for (String w : stdNames){
            karakterSayilariToplami = karakterSayilariToplami + w.length();

        }
        System.out.println(karakterSayilariToplami);

        //Example 3: Char bir array olusturunuz
//           Bu Array'e 5 tane eleman yerlestiriniz
//           Bu arraydaki sadece buyuk harfleri ekrana yazdiriniz.

        char ch[] = new char[5];

       ch[0] = 'A';
       ch[1] = 'c';
       ch[2] = 'D';
       ch[3] = 'k';
       ch[4] = 'm';

        // 2 yol; char[] ch = {'A', 'c', 'D', 'k', 'm'}; // kisa yol

            for (char w : ch){

                if (w>='A' && w<='Z')
                    System.out.print(w + ",");

                
            }

    }
}
