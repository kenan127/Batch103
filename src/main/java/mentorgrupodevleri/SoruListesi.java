package mentorgrupodevleri;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SoruListesi {

    public static void main(String[] args) {


//    /*
//Variables
//1) Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz. Fiyatların
//toplamını konsola yazdırınız.*/
//
//        double u1 = 12.99;
//        double urun2 = 9.99;
//        double urun3 = 79.81;
//
//        double uTop = u1 + urun2 + urun3;
//        System.out.println("uTop = " + uTop);

//2) Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
//değişkenlerin değerlerinin çarpımını konsolda yazdırınız.*/

//        float f = 1.91f;
//        long l = 123767l;
//        int i = 1;
//
//        double degiskenlerCarpimi = f*l*i;
//        System.out.println(degiskenlerCarpimi);

//Basit faizi bulmak için bir kod yazınız.
//Not: Basit faiz formülü = anapara * oran * yılDegeri /100

/*        int anapara = 21500;
        double oran = 9.5;
        int yilDegeri = 3;

        double basitFaiz = anapara * oran * yilDegeri / 100;
        System.out.println("basitFaiz = " + basitFaiz);*/

///*
//4) Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin
//toplamını ve çarpımını String ile yazdırınız.
//
      /*  String strS4 = "T";
        long ls41 = 123l;
        long ls42 = 456l;

        System.out.println("strS4 + (ls41+ls42) = " + strS4 + (ls41 + ls42));
        System.out.println("strS4 + ls41*ls42 = " + strS4 + ls41 * ls42);*/

//5) Değerleri farklı olan iki boolean data tipinde değişken oluşturunuz ve bu değerleri iki
//ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız.

        /*boolean dogruMu = true;
        boolean yanlisMi = false;

        System.out.println("dogruMu + yanlisMi = " + dogruMu +" "+ yanlisMi);*/


//6) 3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
//Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız.

        /*float kitap = 12.5f;
        float defter = 9.45f;
        float laptop = 1000f;

        float toplamFiyat = 2 * kitap + 4 * defter + 3 * laptop;
        System.out.println("toplamFiyat = " + toplamFiyat);*/

//7) İki tamsayıyı değiştirmek için bir kod yazınız.
// */
      /* int soru7s2 = 12;
       int soru7s1 = 3;
       int soru7degisken = 0;

       soru7degisken = soru7s1;
       soru7s1 = soru7s2;
       soru7s2 = soru7degisken;
        System.out.println(soru7s1 + " " + soru7s2);


        soru7s1 = soru7s1 + soru7s2; //15=12,3
        soru7s1 = soru7s1 - soru7s2;//12=15,3


        System.out.println(soru7s1 + "---" + soru7s2);
*/
//        /*
//        Type Casting
//
//1) Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
       /* short deger = 32767;
        int degerYeni = deger;*/

//2) Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
/*
        long uzun = 12456677l;
        int uzunYeni = (int) uzun;*/
//
//3) Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz.
//
       /* double degerd = 12.4567655466;
        float degerdY = (float) degerd;*/
//4) Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
//Sonrasında bu short değişkenin değerini konsolda yazdırınız.
//Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.
/*
        double s4 = 444.4444;
        short s4y = (short) s4;
        System.out.println("s4y = " + s4y);*/
//
//5) Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.
//Sonrasında bu double değişkenin değerini konsolda yazdırınız.
//Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.

      /*  byte age = 23;
        double newAge = age;
        System.out.println(newAge);*/
//
//
//         */
//
//        /*
//                Wrapper Classes
//
//    1) Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
//bulmak için bir kod yazınız.

       /* int byteMin = Byte.MIN_VALUE;
        int shortMax = Short.MAX_VALUE;

        System.out.println(byteMin + " " + shortMax);
        System.out.println("byteMin + shortMax = " + (byteMin + shortMax));*/
//
//2) Data tipi String olan "103" değerini byte data tipine dönüştürmek için bir kod yazınız ve
//yine data tipi String olan "2351" değerini short data tipine dönüştürüp konsolda iki
//değişken arasındaki farkı yazdırınız.
//
        /*String data = "103";
        String data2 = "2351";
        byte datab = Byte.valueOf(data);
        short data2s = Short.valueOf(data2);

        System.out.println("data2s - datab = " + (data2s - datab));
*/

//        String Manipulations
//
//    1) Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
//ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
//yazdırınız.
//Örnek: mIAMI - Miami
//miami - Miami
//MIAMI - Miami
//MIAMI - Miami
//mIaMi - Miami vb.

        /*String sehir = "bURsa";
        String sehirmod = sehir.toLowerCase();
        String yeni = sehirmod.substring(0,1).toUpperCase()+sehirmod.substring(1);
        System.out.println("sehirmod = " + yeni);*/


//2) Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
//karakter sayısının toplamını yazdırınız.
//Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
    /* String isim1 = "Kenan tansu";
     String isim2 = "ali veli";
     String isim3 = " mehmet Ali";

     int i1l = isim1.replaceAll("\\s","").length();
     int i2l = isim2.replaceAll("\\s","").length();
     isim3 = isim3.trim();
     int i3l = isim3.replaceAll("\\s","").length();

        System.out.println("i1l+i2l+i3l = " + (i1l + i2l + i3l));*/

//3) Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
//konsolda yazdırınız.
//Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
       /* String soru3 = "Miami 33018!!!";
        soru3 = soru3.trim().replaceAll("[^0-9a-zA-z]","");
        int soru3sayi = soru3.length();
        System.out.println("soru3sayi = " + soru3sayi);
*/
//4) Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
//konsolda yazdırınız.
//Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
     /* String soru4 = "1a3Bcf4!...";
      soru4 = soru4.replaceAll("[0-9]","");
      int soru4sayi = soru4.length();
        System.out.println("soru4sayi = " + soru4sayi);
*/
//5) Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
//karakteri yazdırınız.
//Örnek: 'Ali Can' için n yazdırmalısınız.

     /*   String soru5 = "Ali Can ";
        int soru5idx = soru5.trim().length()-1;
        String soru5ch = soru5.substring(soru5idx);
        System.out.println("soru5ch = " + soru5ch);
*/
//
//6) Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
//toplamını bulunuz.
//
      /*  String soru6 = "Tansu";

        int soru6idx = soru6.trim().length()-1;
        char soru6chilk = soru6.charAt(0);
        char soru6chson = soru6.charAt(soru6idx);


        System.out.println(soru6chilk + soru6chson);*/

//7) Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
//yazdırınız.
//Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.
//
        /* String s7 = "java";
         String s7new = s7.substring(1);
        System.out.println("s7new = " + s7new);*/

//8) Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
//büyük harfle yazdırınız.
//Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
//
       /* String s8 = "java ";
        int s8idx = s8.trim().length();
        s8 = s8.substring(0,s8idx-1).toUpperCase();
        System.out.println("s8 = " + s8);*/

//9) Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
//karakterleri büyük harflerle yazdırınız.
//Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.

      /*  String s9 = "java";
        int s9idx = s9.trim().length();
        s9 = s9.substring(1,s9idx-1).toUpperCase();
        System.out.println("s9 = " + s9);*/

//10) Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
//olmadığını kontrol etmek için kod yazınız.
//Örnek: 'Ali Can' için konsolda false yazmalıdır.
//‘ Ali Can ’ için konsolda false yazmalıdır.
//‘ Ali Can ’ için konsolda false yazmalıdır.
//'Ali Can' için konsolda true yazmalıdır.
//
       /* String s10 = " Ali  Can   ";
        s10 = s10.trim();
        System.out.println("s10 = " + s10);
        s10 = s10.replaceAll("[0-9a-zA-Z]", "");
        System.out.println("s10 = " + s10);
        boolean varMi;
        if ((s10.length() == 1)) varMi = true;
        else varMi = false;
        System.out.println(varMi);*/

//11) Bir String' in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod
//yazınız.
//Örnek: ‘ Ali ’ için kodunuz konsolda false yazmalıdır
//'Ali' için kodunuz konsolda true yazmalıdır

       /* String str = "Tansuu  ";
        String trimliStr = str.trim();
        boolean sonuc = str != trimliStr;
        System.out.println(sonuc);
*/
//
//12) Bir String' in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod
//yazınız.
//Örnek: 'Ali' için kodunuz konsolda false yazdırmalıdır
//'ali.' için kodunuz konsolda false yazdırmalıdır
//‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
//'Ali.' için kodunuz konsolda true yazdırmalıdır
//'ALI.' için kodunuz konsolda true yazdırmalıdır
//
       /* String s12 = "Ali..";

        int s12sayisi = s12.trim().length();
       char ilkHarf = s12.charAt(0);
       char sonKarakter = s12.charAt(s12sayisi-1);
       boolean buyukMu = ilkHarf>='A'&& ilkHarf <='Z';

       boolean noktaMi = sonKarakter == '.';
       boolean istenilenKelime = buyukMu && noktaMi;
        System.out.println(istenilenKelime);*/


//13) Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
//Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
//sembol olmalıdır.
//Örnek: 'A2b!' için kodunuz konsolda false yazdırmalıdır.
//'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
//'!1a23b4' için kodunuz konsolda false yazdırmalıdır.
//'!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
//'! a b 3 k' kodunuz konsolda false yazdırmalıdır.
//
      /*  String pwd = "Akk2b!+#";
        boolean uzunlukKontrol = pwd.length()>7;
        boolean sembolKontrol = pwd.replaceAll("[A-Zaz09]","").length()>0;
        System.out.println(uzunlukKontrol&&sembolKontrol);*/


//14) Bir String' in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek
//için kod yazınız.
//
        /*String str = "kenan";
        boolean iceriyorMu = str.contains("a");
        System.out.println("iceriyorMu = " + iceriyorMu);*/

//15) String gomlekFiyat = '$12.99';
//String kitapFiyat = '$35.99';
//Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.

        /*String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";
        gomlekFiyat = gomlekFiyat.replaceAll("[$]","");
        kitapFiyat = kitapFiyat.replaceAll("[$]","");
        double gomlek = Double.valueOf(gomlekFiyat);
        double kitap = Double.valueOf(kitapFiyat);
        System.out.println("gomlek + kitap = " + (gomlek + kitap));*/

//16) Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
//Not: İkinci isim kapsam dışındadır.
//Örnek: Tom Hanks ==> TH, Mary Star ==> MS
//
        /*String name = "Kenan GEZGIN";
        String ilk = name.substring(0,1);
        String soy = name.split(" ")[1].substring(0,1);
        System.out.println(ilk + soy);*/

//17) Bir String' de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.
//String s = "Vay be! Ali 13 yaşında ama üniversite öğrencisi.";
//         */
//
//
//        String s = "Vay be! Ali 13 yasinda ama universite ogrencisi.";
//        s = s.replaceAll("[A-Za-z0-9 ]","");
//        System.out.println(s);
//        int sayi = s.length();
//        System.out.println("toplam " + sayi);


        /*int toplamKrkSayisi = s.length();
        int noktalamaIsaretleriDisindakilerinSayisi = s.replaceAll("\\p{Punct}", "").length();
        int noktalamaIsaretlerininSayisi= toplamKrkSayisi - noktalamaIsaretleriDisindakilerinSayisi;
        System.out.println(noktalamaIsaretlerininSayisi);*/

//
///*
//                        Date Class
//    1) Ali'nin kaç gün yaşadığını bulan kodu yazınız.
//Ali'nin doğum tarihi 12 Mayıs 2002'dir.
//
//2) Ali'nin kaç ay yaşadığını bulan kodu yazınız.
//Ali'nin doğum tarihi 4 Haziran 1997'dir.
//
//3) Ali'nin doğum tarihi 4 Haziran 1997'dir. Ali'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün
//sonraki tam tarihi bulmak için kodu yazınız.
//
//4) Ali, 29 Ekim 1923'ten 45 yıl 8 ay 5 gün sonra doğmuştur.
//Veli, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce doğmuştur.
//Ali ve Veli'nin kesin doğum tarihini hesaplamak için kodu yazınız.
//Ali ve Veli'nin doğum tarihinin aynı olup olmadığını kontrol etmek için kodu yazınız.
//
//5) Veli, Ali'den 3 yıl 11 gün sonra doğmuştur.
//Ali size doğum tarihi bilgisini 24 Kasım 2012 olarak vermiştir.
//Veli'nin doğum tarihini hesaplamak için gerekli kodu yazınız.
//
//6) Kendinizin ve çocuğunuzun doğum tarihi için Tarih Değerleri oluşturup, ardından farkı gün
//olarak hesaplayınız.
//
//7) Belirli bir tarihte yılın son 2 hanesini alınız.


//8) Belirli bir yılın "Artık yıl" olup olmadığını kontrol etmek için kodu yazınız.
//Artık Yıl:
//i) Bir yıl 100'e ve 400'e tam bölünüyorsa buna artık yıl denir. Örneğin; 2000 artık yıl, 1900
//değildir.
//ii) Bir yıl 100'e ve 4'e tam bölünemiyorsa artık yıl olarak adlandırılır. Örneğin; 2004 artık yıl, 2007
//değildir.
//
//9) İki farklı tarihin ay numaralarının toplamını bulunuz.
//
//10) İki farklı tarih için saat farkını bulunuz.
//         */
//
//        /*
//                      Date - Time Class
//
//    1) Eğer saat
//i) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
//ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
//iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
//iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız.
//
//2) Japonya saat dilimi ile Almanya saat dilimi arasındaki saat farkını bulmak için kodu yazınız.
//
//3) Ali 5 Şubat 2015 TRT 10:00'da İstanbul' da, Mark 5 Şubat 2015 12:00 EST' de ABD' de
//doğmuştur. Ali'nin doğum saati ile Mark'ın doğum saati arasındaki saat cinsinden fark
//nedir?
//
//4) Ali 5 Şubat 2015 saat 10:15 EST'de doğmuştur, Veli 6 Mart 2015 saat 12:25 EST'de
//doğmuştur. Ali ve Veli'nin doğum süreleri arasındaki fark nedir?
//
//5) Mark 23.02.2018 tarihinde saat 15:25'te GMT ' de doğmuştur, Mark'ın Japonya'daki tam
//doğum tarihi ve saati nedir?
//         */
//
//        /*
//        IF STATEMENT
//        1) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
//a) Aralık, Ocak, Şubat için "Kış"
//b) Mart, Nisan, Mayıs için "İlkbahar"
//c) Haziran, Temmuz, Ağustos için "Yaz"
//d) Eylül, Ekim, Kasım için "Sonbahar"
//e) Diğerleri için "Geçersiz ay adı"

//        String ay = "Temuz";
//
//        if (ay == "Aralik" || ay == "Ocak" || ay == "Subat"){
//            System.out.println("Kis");
//        } else if (ay == "Mart" || ay == "Nisan" || ay == "Mayis") {
//            System.out.println("ilkbahar");
//        } else if (ay == "Haziran" || ay == "Temmuz" || ay == "Agustos" ){
//            System.out.println("Yaz");
//        }else if (ay == "Eylul" || ay == "Ekim" || ay == "Kasim" ){
//            System.out.println("Sonbahar");
//        }else System.out.println("Gecersiz ay adi");


//
//2) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
//a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
//b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
//c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"

//        String pwd = "1234567";
//
//        if (pwd.replaceAll("\\S","").length()>0) {
//            System.out.println("Şifrede boşluk karakteri kullanmayınız");
//        } else if (pwd.replaceAll("\\s","").length()>7){
//            System.out.println("Gecerli sifre");
//        } else System.out.println("Geçersiz Şifre");


//
//3) Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
//Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb.

//        int ay = 103;
//        if (ay == 1){
//            System.out.println("Ocak");
//        } else if (ay == 2) {
//            System.out.println("Subat");
//        }else if (ay == 3) {
//            System.out.println("Mart");
//        }else if (ay == 4) {
//                System.out.println("Nisan");
//        }else if (ay == 5) {
//                System.out.println("Mayis");
//        }else if (ay == 6) {
//                System.out.println("Haziran");
//        }else if (ay == 7) {
//                System.out.println("Temmuz");
//        }else if (ay == 8) {
//                System.out.println("Agustos");
//        }else if (ay == 9) {
//                System.out.println("Eylul");
//        }else if (ay == 10) {
//                System.out.println("Ekim");
//        }else if (ay == 11) {
//                System.out.println("Kasim");
//        }else if (ay == 12) {
//                System.out.println("Aralik");
//        }else
//                System.out.println("Gecerli bir ay numarasi giriniz");


//
//4) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
//a) Son basamak 5 'e eşit ve 5 den büyükse, yuvarlama işlemi: "Son basamağı bir üst ondalığa
//yuvarla"
//b) Son basamak 5 den küçükse, yuvarlama işlemi: "Son basamağı bir alt ondalığa yuvarla"

//    int sayi = 124;
//
//    if (sayi % 10 >= 5){
//        System.out.println((sayi/10 + 1) * 10);
//    } else if (sayi % 10 <5) {
//        System.out.println((sayi / 10) * 10);
//    }
//
//5) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
//a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
//b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
//c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"

//        double birinciKenar = 7.8;
//        double ikinciKenar = 6.6;
//        double ucuncuKenar = 5.4;
//
//        if (birinciKenar == ikinciKenar && ikinciKenar == ucuncuKenar) {
//            System.out.println("Eskenar Ucgen");
//        } else if (birinciKenar == ikinciKenar || birinciKenar == ucuncuKenar || ikinciKenar == ucuncuKenar){
//            System.out.println("Ikizkenar Ucgen");
//        } else System.out.println("Cesit Kenar Ucgen");
//
//6) Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
//kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
//a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz
//"16 km" yazmalıdır (sayı dinamik olacak)
//b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
//kodunuz "2" yazmalıdır (sayı dinamik olacak)
//c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
//konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)

//        double mil = 10;
//        double saniye = 7200;
//        double fahrenayt= 83;
//        String operator = "mildenKmye";
//
//       if (operator.equals("mildenKmye")){
//           System.out.println(mil * mil*1.60934);
//       } else if (operator.equals("saniyedenSaate")){
//           System.out.println(saniye/3600);
//       } else if (operator.equals(" fahrenaytdanSantigarata ")) {
//           System.out.println((fahrenayt - 32) * 5 / 9);
//       }


//7) Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
//a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır. ++
//b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır. ++
//c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
//d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
//yazmalıdır.
//e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
//yazmalıdır.
//Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
//görünmelidir. Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve
//"Geçersiz Ad"

//        String isim = "Ali    Can";
//        String adinIlkHarfi = isim.substring(0,1);
//        Integer boslukIndex = isim.trim().indexOf(' ');
//        String soyadinIlkHarfi = isim.substring(boslukIndex+1, boslukIndex+2) ;
//        Boolean adinIlkHarfiBuyukMu = (adinIlkHarfi.charAt(0)>='A' && adinIlkHarfi.charAt(0)<='Z');
//        Boolean soyadinIlkHarfiBuyukMu = (soyadinIlkHarfi.charAt(0)>='A' && soyadinIlkHarfi.
//                charAt(0)<='Z');
//
//        if(boslukIndex ==-1){
//            System.out.println("Ad veya soyadi eksik ");
//        }
//        if(!adinIlkHarfiBuyukMu || !soyadinIlkHarfiBuyukMu){
//            System.out.println("Bas harflerinde hata");
//        }
//        if(isim.equals(isim.toUpperCase())){
//            System.out.println("Format hatasi");
//        }
//        if(isim.replaceAll("\\S","").length()==0){
//            System.out.println("Isim girilmedi ");
//        }
//        if(isim.replaceAll("\\s","").replaceAll("[A-Za-z]","").length()>0){
//            System.out.println("Gecersiz Isim");
//        }


//8) ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
//a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden fazla ++
//olamaz" yazmalıdır.
//b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
//c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz, "Eyalet kısaltmaları aşağıdakilerden
//farklı karakterler içeremez" yazmalıdır.
//Not: Kısaltmada 1'den fazla hata varsa ilgili tüm hata mesajları yazdırılmalıdır.
//örnek; "fl3" için kodunuz; "Eyalet kısaltmaları 2 karakterden fazla olamaz", "Eyalet kısaltmaları
//küçük harf içeremez", ve "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez"
//yazmalıdır.
//        Scanner input = new Scanner(System.in);
//        System.out.println("eyalet kodunu girniz");
//        String eyaletKodu = input.next();
//
//        if (eyaletKodu.length()>2){
//            System.out.println("Eyalet kısaltmaları 2 karakterden fazla olamaz");
//        } if (eyaletKodu.replaceAll("[^a-z]","").length() != 0){
//            System.out.println("Eyalet kısaltmaları küçük harf içeremez");
//        } if (eyaletKodu.replaceAll("[^A-Za-z]","").length()!= 0){
//            System.out.println("Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez");
//        }


//9) Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
//oluşturmak için kod yazınız.
//a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
//b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
//c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
//d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen belirtilen islemlerden birini giriniz \n toplama icin + \n cikarma icin - \n carpma icin * \n bolme icin / ");
//        String islem = input.next();
//        System.out.println("Lutfen iki deger giriniz");
//        double sayi1 = input.nextDouble();
//        double sayi2 = input.nextDouble();
//        
//        if (islem == "+"){
//            System.out.println(sayi1 + sayi2);
//        } else if (islem == "-") {
//            System.out.println(sayi1 - sayi2);
//        } else if (islem == "*") {
//            System.out.println(sayi1 * sayi2);
//        } else if (islem.equals("/")) {
//            System.out.println(sayi1 / sayi2);
//        }


//10) Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod
//yazınız.
//Geçersiz BMI değeri < 0
//Zayıf = <18.5
//Normal ağırlık = 18.5–24.9
//Fazla kilolu = 25–29.9
//Obezite = 30 veya daha büyük BMI
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Vücut Kitle İndeksi (BMI) giriniz.");
//        double vki = input.nextDouble();
//
//        if (vki<0){
//            System.out.println("Geçersiz BMI değeri");
//        } else if (vki <18.5) {
//            System.out.println("Zayif");
//        } else if (vki>=18.5 && vki<25) {
//            System.out.println("Normal ağırlık");
//        } else if (vki>=30){
//            System.out.println("Obezite");
//        }
//

//
//
//
//
// /*
//         TERNARY STATEMENT
//
// 1) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
//Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
//Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"

//        String pwd = "parola  ";
//
//        String sonuc = pwd.replaceAll( "\\s","").length()>7 ? "GECERLI PAROLA" : "GECERSIZ PAROLA";
//        System.out.println(sonuc);

//2) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
//a) Bir üçgenin iki kenarının uzunluğu eşitse i"İkzkenar Üçgen".
//b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
//c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "
//
//        int a = 5, b = 5, c = 5;
//
//          String sonuc = a == b && b == c ? "Eşkenar Üçgen" : a==b || b==c || a==c ?  "ikizkenar Üçgen" : "cesitkenar Üçgen";
//
//        System.out.println(sonuc);

//3) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
//a) Son basamak 5 'e eşit ve 5 den büyükse, yuvarlama işlemi: "Son basamağı bir üst ondalığa
//yuvarla"
//b) Son basamak 5 den küçükse, yuvarlama işlemi: "Son basamağı bir alt ondalığa yuvarla"
//Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
//125 yukarı yuvarlanacak ve değer 130 olacaktır.
//123 aşağı yuvarlanacak ve değer 120 olacaktır.
//
//        int sayi = 124;
//        sayi = sayi%10 > 4 ? (sayi/10+1)*10 : (sayi/10)*10;
//        System.out.println(sayi);
//4) Nested Ternary kullanarak Apex kodunu yazınız.
//Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
//Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
//Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.
//
//        int yil = 1268;
//
//        boolean sonuc = yil%100 == 0 ? yil%400==0 : yil%4==0;
//        System.out.println(sonuc);
//5) Nested Ternary kullanarak;
//Şifreyi kontrol etmek için kodu yazınız.
//8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
//8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.
//

//        String pwd = "Kad";
//        String s = pwd.length()>8 ? pwd.startsWith("i") ? "Gecerli Sifre" : "Gecersiz sifre" : pwd.startsWith("K") ?  "Gecerli Sifre" : "Gecersiz sifre" ;
//        System.out.println(s);

//6) Bir sayının mutlak değerini hesaplamak için kodu yazınız.
//Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
//Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız.
//
//        int x = -12;
//
//         int mutlakx = x>0 ? x : (x*-1);
//        System.out.println(mutlakx);
//7) Ternary kullanarak; 2 tamsayıdan küçük olanı konsola yazdıran bir program yazınız.
//
//        int a = 12;
//        int b = 13;
//
//        int kucuk = a>b ? b : a ;

//        System.out.println(kucuk);
//8) Sayı 3 basamaklı ise konsolda kodunuz "Bu sayı 3 basamaklıdır" olacaktır. Aksi takdirde,
//kodunuz " Bu sayı 3 basamaklı değildir" olacaktır.
//
//        int sayi = 12;
//        Math.abs(sayi);
//
//
//        String x = sayi > 99 && sayi < 1000 ? "Bu sayı 3 basamaklıdır" : " Bu sayı 3 basamaklı değildir";
//
//        System.out.println(x);

//9) Ternary kullanarak; konsolda tek sayılar için "Tek" , çift sayılar için "Çift" yazdırınız.
//
//        int sayi = 13;
//
//        String q = sayi%2 == 0 ? "Cift" : "Tek";
//        System.out.println(q);
//
//10) Ternary kullanarak; konsolda sayı pozitif ise "Pozitif" , negatif ise "Pozitif Değil" yazdırınız.
//         */
//        int sayi = -13;
//        String w = sayi>0 ? "Pozitif" : "Pozitif Değil" ;
//        System.out.println(w);

//        /*
//        Switch-On Statement
//
//1) Yazdırmak için switch ifadesini kullanınız.
//a) Aralık, Ocak, Şubat için "Kış"
//b) Mart, Nisan, Mayıs için "Bahar"
//c) Haziran, Temmuz, Ağustos için "Yaz"
//d) Eylül, Ekim, Kasım için "Güz"
//e) Diğerleri için "Geçersiz ay adı"
//
//        String ay = "temmuz";
//        ay = ay.toLowerCase();
//
//        switch (ay) {
//            case "aralik":
//            case "ocak":
//            case "subat":
//                System.out.println("kis");
//                break;
//            case "mart":
//            case "nisan":
//            case "mayis":
//                System.out.println("ilkbahar");
//                break;
//            case "haziran":
//            case "temmuz":
//            case "agustos":
//                System.out.println("yaz");
//                break;
//            case "eylul":
//            case "ekim":
//            case "kasim":
//                System.out.println("sonbahar");
//                break;
//            default:
//                System.out.println("gecersiz ay adi gridniz");
//        }
//2) Ayın numarasını girdiğinizde ayın adını yazdırmak için bir switch ifadesi kullanınız.
//Örneğin;
//kullanıcı 1 girerse kodunuz "Ocak" yazmalıdır,
//kullanıcı 2 girerse kodunuz "Şubat" yazmalıdır vb.
//Kullanıcı geçersiz ay numarası girerse kodunuz "Geçersiz numara" yazmalıdır.
//
//        int ay = 11;
//
//        switch (ay){
//            case 1:
//                System.out.println("Ocak");
//                break;
//            case 2:
//                System.out.println("Subat");
//                break;
//            case 3:
//                System.out.println("Mart");
//                break;
//            case 4:
//                System.out.println("Nisan");
//                break;
//            case 5:
//                System.out.println("Mayis");
//                break;
//            case 6:
//                System.out.println("Haziran");
//                break;
//            case 7:
//                System.out.println("Temmuz");
//                break;
//            case 8:
//                System.out.println("Agustos");
//                break;
//            case 9:
//                System.out.println("Eylul");
//                break;
//            case 10:
//                System.out.println("Ekim");
//                break;
//            case 11:
//                System.out.println("Kasim");
//                break;
//            case 12:
//                System.out.println("Aralik");
//                break;
//            default:
//                System.out.println("Geçersiz numara");
//        }

//3) Verilen ay numaralarından başlayarak tüm ay adlarını yazdıran bir kod yazınız.
//Örnek: Ay numarası 9 ise konsolda kodunuz Eylül Ekim Kasım Aralık olacaktır.
//
//        int ayNo = 8;
//
//
//        switch (ayNo) {
//            case 1:
//                System.out.println("Ocak");
//            case 2:
//                System.out.println("Subat");
//            case 3:
//                System.out.println("Mart");
//            case 4:
//                System.out.println("Nisan");
//            case 5:
//                System.out.println("Mayis");
//            case 6:
//                System.out.println("Haziran");
//            case 7:
//                System.out.println("Temmuz");
//            case 8:
//                System.out.println("Agustos");
//            case 9:
//                System.out.println("Eylul");
//            case 10:
//                System.out.println("Ekim");
//            case 11:
//                System.out.println("Kasim");
//            case 12:
//                System.out.println("Aralik");
//                break;
//            default:
//                System.out.println("Geçersiz numara");
//
//        }
//4) Cinsiyet "Erkek" ise "Erkek" yazdırınız.
//Cinsiyet "Kadın" ise "Kız" yazdırınız.
//Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
//Not : Bu seçenekler dışındakilerini yoksayınız.
//

//        String cinsiyet = "Kadin";
//
//        switch (cinsiyet){
//            case "Erkek":
//                System.out.println("Erkek");
//                break;
//            case "Kadin":
//                System.out.println("Kiz");
//                break;
//            default:
//                System.out.println("Digerleri");
//        }
//5) Belirli bir yılın belirli bir ayındaki gün sayısını görüntülemek için bir kod yazınız.
//Örnek: 2000 yılının Şubat ayında gün sayısı 29.
//int ay = 2;
//int yil = 2000;
//int gunSayisi = 0;

//        int ay = 3;
//        int yil = 2401;
//        int gunSayisi = 0;
//
//        switch (ay){
//            case 1: case 3: case 5:
//            case 7: case 8: case 10:
//            case 12:
//                gunSayisi=31;
//                break;
//            case 4: case 6: case 9: case 11:
//                gunSayisi = 30;
//                break;
//            case 2:
//                if ((yil%4==0) || (yil%100==0 && yil%400==0)){
//                    gunSayisi=29;
//
//                }
//                else {
//                    gunSayisi = 28;
//                }
//        }
//        System.out.println(gunSayisi);
//
//6) Switch ifadesini kullanarak, herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme
//yapan basit bir hesap makinesi oluşturmak için kod yazınız.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Islem sembolu giriniz\nToplama islemi icin : + \n Cikarma islemi icin -\n carpma islemi icin -\n bolme islemi icin /");
//        char islemSembolu = input.next().charAt(0);
//        System.out.println("iki adet sayi girniiz");
//        double sayi1 = input.nextDouble();
//        double sayi2 = input.nextDouble();
//
//        switch (islemSembolu){
//            case '+':
//                System.out.println(sayi1+sayi2);
//                break;
//            case '-':
//                System.out.println(sayi1-sayi2);
//                break;
//            case '*':
//                System.out.println(sayi1*sayi2);
//                break;
//            case '/':
//                System.out.println(sayi1/sayi2);
//                break;
//            default:
//                System.out.println("hatali giris");
//        }
//a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
//b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
//c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
//d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
//e) Kullanıcı 10 ve -5 girdiğinde +, -, *, / 'den farklı bir işlem yaptığında kodunuz "Geçersiz İşlem"
//yazmalıdır.
//
//7) Switch ifadesini kullanarak, mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir
//dönüştürücü oluşturmak için kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
//a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz
//"16 km" yazmalıdır (sayı dinamik olacak)
//b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
//kodunuz "2" yazmalıdır (sayı dinamik olacak)
//c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
//konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
//d) Kullanıcı mildenKmye, saniyedenSaate, fahrenaytdanSantigarata 'dan farklı bir işlem girdiğinde,
//kodunuz "Bu operatör, o dönüştürücü için tanımlanmadı" yazmalıdır.

//        double mil = 10;
//        double saniye = 7200;
//        double fahrenayt= 83;
//        String operator = " fahrenaytdanSantigarata";
//
//        switch(operator){
//            case "mildenKmye":
//                System.out.println(mil*1.60934);
//                break;
//            case "saniyedenSaate":
//                System.out.println((saniye/60)/60);
//                break;
//            case " fahrenaytdanSantigarata":
//                System.out.println((fahrenayt-32)*5/9);
//                break;
//            default:
//                System.out.println("Bu operator, o donusturucu icin tanimlanmadi");
//        }
//
//8) Bir Enum oluşturun ve içine CHROME, SAFARI, IE, FIREFOX, YANDEX gibi tarayıcı adlarını
//koyunuz. Switch ifadesini kullanın ve CHROME için 'CHROME kullanıyorum', SAFARI için
//'SAFARI kullanıyorum', 'IE için IE kullanıyorum', 'FIREFOX için FIREFOX kullanıyorum' ve
//YANDEX için 'YANDEX kullanıyorum', CHROME, SAFARI, IE, FIREFOX, YANDEX'ten farklı
//tarayıcılar için 'Geçersiz tarayıcı' yazınız.
//Not: Geliştirici konsolunda enum oluşturmalısınız.
//
//9) Adı 'Seasons' olan bir Enum oluşturun ve Enum da switch-on deyimini kullanarak
//aşağıdakileri yazdırınız.
//Kış için 'Snowboard yapmak'
//Yaz ve bahar için 'Balık tutmak'
//Sonbahar için 'Doğa yürüyüşü yapmak'
//
//10) myClass isminde bir class oluşturunuz, class'ta size rastgele bir alfabetik karakter veren bir
//yöntem oluşturun ve ardından yöntemi kullanarak aşağıdakileri yazdırınız.
//'A' ve 'a' için "İlk Karakter" yazdırınız.
//'B' ve 'b' için "İkinci Karakter" yazdırınız.
//'C' ve 'c' için "Üçüncü Karakter" yazdırınız.
//'D' ve 'd' için "Dördüncü Karakter" yazdırınız.
//Diğerleri için "Diğer Karakterleri" yazdırınız.
//         */
//
//        String myClass = "eli";
//        myClass = myClass.toLowerCase().substring(0,1);
//
//        switch (myClass){
//            case "a":
//                System.out.println("İlk Karakter");
//                break;
//            case "b":
//                System.out.println("İkinci Karakter");
//                break;
//            case "c":
//                System.out.println("Ucuncu Karakter");
//                break;
//            case "d":
//                System.out.println("Dorduncu Karakter");
//                break;
//            default:
//                System.out.println("Diğer Karakterleri");
//
//        }

//        /*
//                        Loops
//
//  1) 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
//ardışık tam sayı arasında boşluk bırakarak yazınız.
//1. Yol:
//


//        for (int i = 120; i > 10; i--) {
//                if (i%4==0 && i%6==0)
//                {
//                    System.out.print(i + " ");
//                }
//        }
//        int ii = 120;


//        do {
//            if (ii % 4 == 0 && ii % 6 == 0) {
//                System.out.print(ii + " ");
//            }
//                ii--;
//
//        }
//
//            int i=120;
//            while (i>10){
//                if (i%4==0 && i%6==0){
//                    System.out.print(i + " ");
//                }
//                i--;
//            }
//
//        }


//2) Bir String' de tekrarlanan karakterleri yazdırmak için kod yazınız.
//Örneğin; accessories ´ ces
//


//3) Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
//aynıysa, buna palindrom denir. Örneğin; "anna", "123321" palindromlardır.


//        String s = "anna";
//
//        String t = "";
//
//        for ( int i = s.length()-1 ; i > -1 ; i--) {
//
//            t = t + s.charAt(i);
//
//        }
//        System.out.println(t);

//        String s = "Kenan";
//        String bos = "";
//        int n = s.length()-1;
//
//        do {
//
//            bos = bos + s.charAt(n);
//            n--;
//        }while (n>-1);
//        System.out.println(bos);

//
//4) Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
//Örnek; 223878 ´ 37

//        Integer num = 223878;
//        String s = String.valueOf(num);
//        String d = "";
//        for (int i = 0; i < s.length(); i++) {
//            String x = s.substring(i,i+1);
//            if (s.indexOf(x)== s.lastIndexOf(x)){
//                d = d + x;
//            }
//        }
//        System.out.println(d);

//
//5) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
//A A A A A
//A A A A A
//A A A A A
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print("*");
//            }System.out.println("*");
//        }

//6) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
//A
//A A
//A A A
//A A A A
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("A");
//            }
//            System.out.println("A");
//        }

//7) Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
//3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
//
//        int x = 3;
//        int a = 1;
//        for (int i=1 ; i<11 ; i++){
//            a = x*i;
//            System.out.println(x+"*"+i+"="+a);
//        }

//8) 20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
//bırakarak yazdırmak için gereken kodu yazınız.
//
//        for (int i = 20; i >2 ; i--) {
//            if (i%2!=0){
//                System.out.print(i+" ");
//            }
//
//        }
//9) String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
//Örneğin; 'Ali Can?' ==> l*i*a*n*
//
        String str = "Ali Can";

        String bos = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1)=="A"){
                bos = bos + i;
            }
            System.out.println(bos);
             }





//10) Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
//işaretiyle yazdırmak için gereken kodu yazınız.
//Örneğin; 75.4238 ´ *4*2*3*8
//
//11) Bir String' i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM
//
//12) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
//A A A A A A A A
//A X X X X X X A
//A X X X X X X A
//A X X X X X X A
//
//13) 3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız.
//
//14) 3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız.
//
//15) Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için
//kod yazınız.
//
//16) Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
//
//17) Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.
//
//18) Bir String' de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
//Örneğin; Hello ==> Heo
//
//19) Bir String' deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.
//String s = "Java is a strongly typed, object-oriented programming language.";
//
//20) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
//* * * * * *
//* * * * *
//* * * *
//* * *
//* *
//*
//
//21) Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
//Örnek:12133455 ´ 2+4=6
//
//22) 5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız.
//
//23) Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
//Örnek: kullanıcı 43 girerse çıktı "43 bir asal sayıdır", kullanıcı 120 girerse "120 asal değildir"
//olur, kullanıcı negatif tam sayılar girerse çıktı "Pozitif bir tam sayı giriniz" şeklinde kullanıcıyı
//yönlendiriniz.
//
//24) Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz. Ardından bu fibonacci
//sayılarını yazdıran kodu yazınız.
//Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır.
//
//25) Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
//Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir
//Armstrong sayısıdır. Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek
//için bir kod yazınız.
//
//26) Kullanıcıdan bir String ve bir karakter alınız.
//String'de verilen karakterin ilk olduğu index ile son tekrarlandığı index arasındaki karakter
//sayısını sayınız.
//Boşluk karakterlerini saymayınız.
//Kod, kullanıcının seçtiği karakter String 'de sadece bir kez varsa konsolda -1,
//Kod, kullanıcının seçtiği karakter String 'de yoksa konsolda -1 döndürsün.
//Örneğin; "Java is easy" - 'a' ==> 5
//"Java is easy" - 'w' ==> -1
//"Java is easy" - 'e' ==> -1
//
//27) Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
//Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır.
//
//28) Belirli bir sayıdan küçük tüm asal sayıları yazdıran bir kod yazınız.
//Örnek: kullanıcı 20 girerse çıktı 2, 3, 5, 7, 11, 13, 17, 19 olacaktır.
//
//29) Herhangi bir döngü kullanmadan 1'den 100'e kadar tam sayıları yazdıran bir program
//yazınız.
//
//30) Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Sözcükler değişmeden,
//her giriş satırındaki sözcüklerin sırasını tersine çevirmek için kod yazınız.
//Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
//Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir.
//
//31) Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Her giriş satırındaki ilk
//ve son sözcükler dışındaki sözcüklerin sırasını tersine çevirip sözcükleri değiştirmeden
//kodu yazınız.
//Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
//Örnek; Kemal Can Tan Han Kuzu, Kemal Han Tan Can Kuzu'ya dönüşecektir.
//         */
//
//
//
  /*
        ARRAYS
        1) Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.   ----- sundus hocam
Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10

2) String' lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.   +++++ Sukran hocam
Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

3)Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı   yunus hocam
bulunuz.
Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2

4) String' lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini   ++++++  hilal hocam
alınız.
Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JJM

5) String' lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz. ++++ mustafa hocam
Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26

6) Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz. yahya hocam +++++++ yahya hocam

7) Verilen bir String'deki sesli harf sayısını bulunuz.  ++++ ayse hocam

8) İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.  ++++ erkam hocam

9) Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız. ++++++ kenan


10) Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.++++ mehmet atci

// ########### yapildi.14.10.22

11) Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

12) Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
büyük öğeler arasındaki farkı konsolda yazdırınız.

13) Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.
}

   */


    }
}