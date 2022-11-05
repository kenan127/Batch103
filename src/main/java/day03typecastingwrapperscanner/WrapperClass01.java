package day03typecastingwrapperscanner;

import java.sql.SQLOutput;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*

            Java Primitive'lere methodlar ekleyerek yeni bir yapı oluşturdu, bu yapıya "Wrapper Class" denir.
            Primitive        Wrapper
              byte       ==>    Byte
             short       ==>    Short
              ** int     ==>    Integer
              long       ==>    Long
              float      ==>    Float
              double     ==>    Double
              boolean    ==>    Boolean
              ** char    ==>    Character

            */
        byte primitiveByte = 12;  //  primitiveByte yazıp "." koyduğunuzda hiç method göremezsiniz çünkü primitive'lar method içermez sadece değer içerir.


        Byte wrapperByte = 12;  //  "wrapperByte" yazıp nokta koyduğunuzda bir çok method görürsünüz çünkü "wrapper"lar method içerir.

        //Example 1:    byte data type'nin en küçük ve en büyük değerlerini ekrana yazdırınız.


        System.out.println(Byte.MIN_VALUE);  //-128
        System.out.println(Byte.MAX_VALUE);  //127

        //Example 2: short, int, long data typlerini en büyük ve en küçük değerlerini ekrana yazdırınız.

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        //"primitive"ler nasıl "wrapper"lara çevrilir.

        float f1 = 13.99F;

        Float wrapperF1 = f1;

        System.out.println(wrapperF1);

        //"wrapper"lar nasıl "primitive"lere çevrilir.

        Character w1 = 's';

        char primitiveW1 = w1;

        System.out.println(primitiveW1);

        //Note: AutoBoxing ve UnBoxing Java tarafından otomatik olarak yapılır.



    }









}
