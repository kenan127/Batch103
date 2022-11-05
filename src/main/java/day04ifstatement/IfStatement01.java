package day04ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {
        //If it rains I will cancel the picnic.
        // Şart doğru olursa sonuç aktif, Şart yanlış olursa sonuç deaktif olur.
        // İf statement belli kodları belli şartlara bağlı olarak çalıştırmaya yarar.

        // example 1: Sayı pozitif ise ekrana pozitif yazdırın.
        int s = 12;

        if (s > 0) {
            System.out.println("Positive");
        }

        //Example 2: Verilen karakter büyük harf ise ekrana "Büyük Harf" yazdırın.

        char ch = 'T';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Büyük Harf");

        }
            //&&=and matematikteki ve bağlacı ile aynıdır
            //&& işlemi sadece boolean ile kullanılır.
            //  true&&true= true
            //  true&&false=false
            //  false&&true=false
            //  false&&false=false
            //  && işlemi çarpma gibi düşünülebilir bir tane yanlış olması hepsini yanlış yapar.


            // Example 3: Verilen bir sayı üç basamaklı ise ekrana "Üç basamaklı" yazdırınız.

            int sayi = -123;
            sayi = Math.abs(sayi);

            if (sayi > 99 && sayi < 1000) {
                System.out.println("Sayı Üç basamaklı sayıdır. :)");
                //Javada => veya =< işaretleri yer kapladığı  için tercih edilmez onun için eşit olmayanları alınır.

             //Java sayının negatif pozitif olmasını algılamaz onun için verilen sayı negatif ise math.abs(mutlak değer) ile sayı pozitif yapılır.

            }

            //Example 4: Verilen bir sayı Çift sayı ise ekrana cift sayı yazdırınız.

            int p = 14;

            if (p%2==0){
                System.out.println("Çift Sayı");

            // % işlemi mod işlemidir yani bölüm değil kalan bulunur. 14%2=0 gibi
            // "=" işareti atama operatörüdür, matematikteki eşittir anlamına gelmez.
            // Matematikteki eşittir sembolü Java'da "==" şeklindedir.

            }

        //Example 5: Verilen bir sayı 300 den küçük veya 1200den büyük ise ekrana Harika Sayı yazdırınız.

            int r = 250;
                if (r<300 || r>1200){
                System.out.println("Harika Sayı");
        }
                 //     ||:matematikteki veya bağlacıdır hepsi yanlış olunca yanlış olur.
            // true||true=true
            // true||false=true
            // false||true=true
            // false||false=false


    }
}