package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*
            Verilen Yılın "Leap Year" (Artık Yıl)olup olmadığını kontrol eden kodu yazınız.
            i)Yıl 100e bolunurse 400e de bolunmelidir. ==> 1600+, 1800-,
            ii)Yıl 100'e bolunmezse 4e bolunmelidir. ==> 1996+, 2001-
         */

        int year = 2001;

        String leap = year % 100 == 0 ? (year%400==0 ? "leap year" : "Leap year değil") : (year%4==0 ? ("leap year") : ("Leap year değil"));

        System.out.println(leap);


        /*
        Aşağıdaki kurallara göre passwordun geçerli olup olmadığını kontrol eden kodu yazınız
            i) 8 karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalıdır.
            ii) 8 karakterden az karakter varsa ilk harfi 'K' olmalıdır.
          */

        String pwd = "K2a3";
        char ilkHarf = pwd.charAt(0);
        String gecerli = pwd.length()<8 ? (ilkHarf=='K' ? "Geçerli password" : "Geçersiz password") : (ilkHarf=='i' ? "Geçerli password" : "Geçersiz password");
        System.out.println(gecerli);

                //Equal Stringte kullanılır.





    }
}
