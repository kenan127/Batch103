package mentorgrupodevleri;

import java.util.Scanner;

public class MentorCalismasi111022 {

    public static void main(String[] args) {

        double x = 16;
        double y = 1;
        int a = 9;
        x = Math.sqrt(x);
        System.out.println(x);


       /*
        Soru 5 ) Kullanicidan bîr şifre girmesini isteyin. Girilen şifreyi asagidaki şartlara gore kontrol edin ve şifredeki hatalari yazdirin.
        Kullanici geçerli bir şifre girinceye kadar bu işlemi tekrar edin ve geçerli şifre girdiğinde
        "Şifreniz Kabul edilmiştir" yazdirin.
        - Şifre kucuk harf içermelidir
         - Şifre buyuk harf içermelidir
         - Şifre özel karakter içermelidir
         - Şifre en az 8 karakter olmalidir.
         */


        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Lutfen bir sifre giriniz");
            String pwd = input.next();
            boolean uzunluk = pwd.length() > 7;
            boolean buyukHarf = pwd.replaceAll("[^A-Z]", "").length() > 0;
            boolean kucukHarf = pwd.replaceAll("[^a-z]", "").length() > 0;
            boolean ozelKarakter = pwd.replaceAll("\\w", "").length() > 0;


            if (uzunluk && buyukHarf && kucukHarf && ozelKarakter) {
                System.out.println("Şifreniz Kabul edilmiştir");
            }if (uzunluk == false){
                System.out.println("Sifreniz 8 karakter olmali");

            }if (buyukHarf == false) {
                System.out.println("Sifreniz buyuk harf icermeli");

            }if (kucukHarf == false) {
                System.out.println("Sifreniz kucuk harf icermeli");

            }if (ozelKarakter == false) {
                System.out.println("Sifreniz ozel karakter icermeli");
            }

        } while (true);

    }
}