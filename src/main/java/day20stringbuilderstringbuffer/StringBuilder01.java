package day20stringbuilderstringbuffer;

public class StringBuilder01 {


    /*
        1) "StringBuilder" Java'da bir classtir.
        2) "StringBuilder", String olusturmaya yarar.
        3) "String" Class varken nicin StringBuilder'a ihtiyac duyariz ?
        Cunku "String" Class "Immutable Class"dir ama biz bazen "Mutable String"lere ihtiyac duyariz.
        StringBuilder bize "Mutable" String verir.
        4) "Immutable Class"larda var olan deger degistirilemez. Siz varolan bir degeri degistirmek istediginizde;
            i)Memory'de Yeni bir variable yeni degerle olusturulur.
            ii)Eski variable'in pointeri yeni varianle'a döndürülür.
            iii)Eger bir variable'i hicbir pointer gostermiyorsa o variable "Garbage Collector" tarafindan silinir.

            "Mutable Class"larda var olan deger degistirilebilir. Orjinal deger korunmaz.

            5) "String Class"larin "Immutable" yapisi "security" icin onemlidir.
                Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni deger sahip
                String'lerin bu container'i kullanmasini temin eder. Bu memory'i korumak icin iyidir ancak container'daki
                degeri bir variable icin degistirdigimizde tum variable'larin etkilenmesi tehlikesi vardir. bu tehlikeden
                kurtulmak icin Java string'leri "immutable" (degismez) yapmistir fakat herhangi bir variable'in degerini
                degistirmek icin Java bir yol bulmustur. Degistirmek istediginiz variable icin yeni bir container olusturur
                ve variablein pointerini bu yeni variablea yonlendirir. Boylelikle hem degisim hemde digerleri etkilenmemis
                olur.
     */
    public static void main(String[] args) {


        String str = "Java";
        str = "Super Java";

        // StringBuilder nasil olusturulur ?
        // 1 Yol:

        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1); // Java

        // 2 Yol:

        StringBuilder strb2 = new StringBuilder();
        //Yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append(" !!!");
        System.out.println(strb2); //Java is easy !!!

        //Yol b:
        strb2.append(" Learn").append(" Java earn").append(" money"); //Method chain
        System.out.println(strb2); //Java is easy !!! Learn Java earn money

        // StringBuilder'larda karakter sayisi nasil bulunur. ==> lenght()

        StringBuilder strb3 = new StringBuilder();
        strb3.append("cat");
        strb3.append("xxxxxxxxxxxxxxx");

        int numOfChar = strb3.length();
        System.out.println(numOfChar);   //18

        int capacity1 = strb3.capacity();
        System.out.println(capacity1); //34

        strb3.append("mmmmmmmmmmmmmmmmmmmm");
        int capacity2 = strb3.capacity();
        System.out.println(capacity2);
        //Kapasite asimlarinda var olan kapasitesinin 2 katinin 2 fazlasina cikar

        // setCharAt(2,'r') ==> index 2deki karakteri "r" ye cevirir
        strb3.setCharAt(2,'r');
        System.out.println(strb3); //carxxxxxxxxxxxxxxxmmmmmmmmmmmmmmmmmmmm

        // delete(3,18); ==> index 3(dahil)den index 18(haric) tum karakterleri siler.
        strb3.delete(3,18);
        System.out.println(strb3); //carmmmmmmmmmmmmmmmmmmmm

        // deleteCharAt(2); ==> index 2deki karakteri siler.
        strb3.deleteCharAt(2);
        System.out.println(strb3); //cammmmmmmmmmmmmmmmmmmm

        // reverse(); ==> StringBuilderi ters cevirir.
        //Mutablelarda sadece method kullanmak orjinal degeri degistirmek icin yeterlidir.

        strb3.reverse();
        System.out.println(strb3); //mmmmmmmmmmmmmmmmmmmmac

        //"Immutable"larda orjinal degeri degistirmek icin methodu kullanmak yeterli olmaz bir de atama islemi yapmalisiniz.

        String abc = "Java";
        abc = abc.replace("a","i");
        System.out.println(abc); //Jivi

        // toString() StringBuildleri Stringe cevirir.

        String stringstrb3 = strb3.toString();
        System.out.println(stringstrb3); //mmmmmmmmmmmmmmmmmmmmac

        // Stringten de StringBuildera asagidaki gibi donebilirsiniz.

        StringBuilder strb4 = new StringBuilder(stringstrb3);
        System.out.println(strb4);  //mmmmmmmmmmmmmmmmmmmmac

        // insert(3,"XXXX"); ==> 3. Characterden sonra XXXX koyar.
        strb4.insert(3,"XXXX");
        System.out.println(strb4);  //mmmXXXXmmmmmmmmmmmmmmmmmac

        // insert(3,"KLMOPQRSTU",5,8); ==> 3. Characterden sonra verilen Stringin belli bir karakterini 5,6,7
        // (5 ile baslar 7 dahil bitirir 8i almaz) yerlestirir

        strb4.insert(3,"KLMOPQRSTU",5,8);
        System.out.println(strb4); // mmmQRSXXXXmmmmmmmmmmmmmmmmmac

        // compareTo(b);
                //i) StringBuilderlar tamamiyle ayni ise sonuc sifirdir.
                //ii) a alfabetik sirada bden sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
                //iii) a alfabetik sirada bden once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir
       StringBuilder a = new StringBuilder("Iava");
       StringBuilder b = new StringBuilder("Java");

       int sonuc = a.compareTo(b);
        System.out.println(sonuc); //i)0  ii) java -- Java= 32  iii) -1


    }
}
