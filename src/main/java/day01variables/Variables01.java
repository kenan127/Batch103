package day01variables;

public class Variables01 {

    // How do you create Variable ?
    // 1)Access Modifier  2)Data type integer  3)Variable name  4) = (assignment operator)    5) value  6);  <This is Variable>
    // In java, ";" is dot(.) in english.    Java'da ";" Ingilizcedeki "." gibidir.
    //İngilizcede cümle Javada statement denir.
            // public int okulNumarası = 8888;


    // "=" sembolü 'Assignment (Atama) Operator' olarak adlandırılır.
    // Assignment (Atama) Operatör sağdaki değeri alır soldaki variable'in içine koyar

    public int age = 13;
    public int height = 183;

                            // Javada Data Tipleri
/*
                         PRIMITIVE (İLKEL) DATA TYPE
    1) int: Integer'in kısaltması. Integer tam sayı demektir. 32 bit kullanır.
            Matematikte tam sayıların başı ve sonu yoktur fakat javada tam sayıların başı ve sonu vardır.
            En küçük int = -2,147,483,648
            En büyük int =  2,147,483,647

    2) byte: Tamsayılar için kullanılır. 8 bit kullanır.
            En küçük byte = -128
            En Büyük Byte = 127

    3) short: Tamsayılar için. 16 bit kullanır.
            En küçük short = -32768
            En büyük short = 32767

    4) long: tamsayılar içindir. 64 bit kullanır.
            En küçük short = -9,223,372,036,854,755,808
            En büyük short = 9,223,372,036,854,755,807

    5) float: Ondalıklı sayılar içindir. 32 bit kullanır.
            "float"  virgülden sonra 7 basamak içerebilir.
            "float" değerlerinde sona "f" veya "F" koymanız gerekir.

    6) double: Ondalıklı sayılar içindir. 64 bit kullanır.
            "double" virgülden sonra 16 basamak içerebilir.

    7) boolean: true veya false değerleri için kullanılır. 1 bit kullanır.

    8)char: Tek karakter için kullanılır. 16 bit kullanılır. Tek tırnak arasında kullanılmalı değer. 'X'
        'A', 'c', '2, '?', '='


       Not : Java büyük ve küçük harflere duyarlıdır.
            Java için TRUE ile true tamamen farklıdır.

            BYTE < SHORT < İNT < LONG      FLOAT< DOUBLE  (NUMERIC DATA TYPES)
            BOOLEAN - CHAR (KARŞILAŞTIRMA YAPMA, FARKLI ŞEYLER) (NUMERİC OLMAYAN DATA TYPES)

        NON-PRIMITIVE DATA TYPES

    String: İsim, Adres, Kimlik numarası gibi bir veya birden fazla karakter içeren değerlerde kullanılır.
        String değerleri mutlaka çift tırnak arasına konulmalıdır.
        String non-primitivedir. Yani bir String oluşturduğumuzda Java size bir sürü method verir.

        Primitive ile Non-primitivelerin farkı nedir?
        1) non primitive data type'larında değerin yanında method'lar vardır.
        Primitive data type'larında ise sadece değer vardır , method yoktur.
        2)Primitive data type'ları Java tarafından oluşturulmuştur, toplam 8 tanedir, biz Primitive data oluşturamayız
        Non-primitive data type'lari Java tarafından da oluşturulmuştur, biz de oluşturabiliriz. Non-primitive sayılamayacak kadar çoktur, çünkü her developer
        Non-Primitive data type oluşturabilir.
        3)Primitive data type isimleri küçük harflerle başlar
        Non-Primitive data type isimleri büyük harfle başlar.
        4)Primitive data type'lar memory'de farklı büyüklükte yerler kullanır.
        Non-Primitive'ların hepsi memory'de aynı büyüklükte yer kullanırlar.

    */
    public byte price = 12;
    public short populationOfVillage = 23000;

    public float priceOfShirt = 13.99F;
    public double weightOfCell = 0.000012045;

  // siz long demenize rağmen Java verilen sayıyı "int" kabul eder.
  //bu yüzden, long bir variable'a int aralığının dışında bir sayı verirseniz mutlaka sonuna L veya l koyunuz
    public long populationOfWorld = 7000000000L;

    //Burada L koymadığımız halde problem yok çünkü 1234 int aralığına uyar
    public long x = 1234;

    public boolean isOLd = true;
    public boolean isRich = false;

    public char initial = 'S';

    public String name = "TOM HANKS";

    // Main Method (psvm) arabanın methodu gibidir.
    // Main method (psvm) çalışmadan hiç bişey çalışmaz.
    public static void main(String[] args) {






    }

}
