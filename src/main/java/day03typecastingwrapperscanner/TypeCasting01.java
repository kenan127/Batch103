package day03typecastingwrapperscanner;

public class TypeCasting01 {

    // Type Casting : Bir numeric data type'ni diğer numeric data type'ina çevirmek demektir.
    //              byte < short < int < long < float < double




    //Note 1: Küçük data type'ini büyük data type'ine çevirmeye "Auto Widening" denir.
    //Note 2: Büyük data type'ini küçük data type'ine çevirmeye "Explicit Narrowing" denir.

    public static void main(String[] args) {

        byte age = 23;
        int newAge = age;

        long population = 1234;
        int newPopulation = (int)population;

        //Example 1: short'u double'a çeviren kodu yazınız.
        //           Float'ı byte yapan kodu yazınız.

        short numOfStudents = 235;
        double newnumOfStudents = numOfStudents;  // Auto Widening

        float price = 12.99F;
        byte newPrice = (byte) price;    // Explicit narrowing

        System.out.println(newPrice);       //12 ==> Java ondalik sayıyı tam sayıya çevirirken yuvarlama işlemi yapmaz.
                                            //      Java ondalik sayıyı tam sayıya çevirirken ondalık kısmını siler.

        int number = 515;
        byte newNumber = (byte) number;
        System.out.println(newNumber); //3 ==> Modüler Aritmetik sonucu olarak verir. byte'ta 256 adet rakam var. değeri rakam sayısına böler. kalanı yazar (return eder).

        int num = 510;
        byte newNum = (byte)num;
        System.out.println(newNum);  //-2  ==>





    }






}
