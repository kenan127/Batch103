package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

        // Example 1: Bir sayının pozitif olup olmadığını ekrana yazdıran kodu yazınız.

        // 1. yol: if kullanalım

        int a = 0;

        if(a>0){
            System.out.println("Pozitif");
        }else{
            System.out.println("Pozitif Değil");
        }

        //2. yol: ternary
                    //condition ? condition doğru ise uygulanacak kod : condition yanlış ise uygulanacak kod ;
        String sonuc = a>0 ? "Pozitif" : "Pozitif Değil";
        System.out.println(sonuc);


        //Example 2: İki sayıdan küçük olanı seçen kodu yazınız.

        int b = 120, c = 23 ;

        int min = b < c ? b : c;
        System.out.println(min);

        //Example 3: Verilen bir sayının mutlak değerini hesaplayan kodu yazınız.
        //    Pozitif sayıların ve sıfırın mutlak değeri kendileridir.
        //    Negatif sayıların mutlak değeri (-1) ile çarpılmış halleridir.
        int d = 45;

        int abs = d<0 ? -1*d : d;
        System.out.println(abs);

        //Example 4: İki tane sayı aynı işaretli ise bu sayıları çarpınız, Farklı işaretli ise "İşlem yapamam" mesajı veriniz.

        int e = 12;
        int f = -10;
        // Ternary farklı data typelerinde sonuç return ederse sonucun data tipini Object yapınız.
                                                    //integer(e*f)  Object("İşlem yapamam")
        Object işlem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "İşlem yapamam" ;

        System.out.println(işlem);

        // Note: Java'da her class'ın en az bir tane "parent" class'ı vardır.
        // Sadece "Object" class'ın "parent" class'ı yoktur.


    }
}
