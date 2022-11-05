package day06nestedifswitch;

import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {

        /*
            Kullanicidan gun sayisini aliniz ve gun ismini ekrana yazdiriniz
            1 ==> Pazar       2 ==> Pazartesi   ...
        */


        Scanner input = new Scanner(System.in);
        System.out.println("Gün sayısı giriniz");
        byte gunNo = input.nextByte();

        if(gunNo==1){
            System.out.println("pazar");
        } else if (gunNo==2) {
            System.out.println("pazartesi");
        }else if (gunNo==3){
            System.out.println("salı");
        } else if (gunNo==4) {
            System.out.println("çarşamba");
        } else if (gunNo==5) {
            System.out.println("perşembe");
        } else if (gunNo==6) {
            System.out.println("cuma");
        } else if (gunNo==7) {
            System.out.println("cumartesi");
        }else {
            System.out.println("geçerli gin giirniiz");
    }



        switch (gunNo){
            case 1:
                System.out.println("pazar");
                break;
            case 2:
                System.out.println("pazartesi");
                break;
            case 3:
                System.out.println("salı");
                break;
            case 4:
                System.out.println("çarşamba");
                break;
            case 5:
                System.out.println("perşembe");
                break;
            case 6:
                System.out.println("cuma");
                break;
            case 7:
                System.out.println("cumartesi");
                break;
            default:
                System.out.println("geçerli değer gir ulan");

        }

        //Kullaniciya ay ismi sorunuz ve kullanicinin verdigi ay isminden son aya kadar ekrana yazdiriniz

        Scanner input2 = new Scanner(System.in);
        System.out.println("ay ismi giriniz");
        String ayİsmi = input2.next().toLowerCase();



        switch (ayİsmi){
            case "ocak":
            System.out.println("ocak");
            case "subat":
            System.out.println("şubat");
            case "mart":
            System.out.println("mart");
            case "nisan":
                System.out.println("nisan");
            case "mayıs":
                System.out.println("mayıs");
            case "haziran":
                System.out.println("haziran");
            case "temmuz":
                System.out.println("remmuz");
                break;
            default:
                System.out.println("geçerli igr");
        }

        //Kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazdiran basit bir hesap makinasi yapiniz

        Scanner input3 = new Scanner(System.in);
        System.out.println("İşlem Sembolü Giriniz...");
        char işlemSembolü = input3.next().charAt(0);

        System.out.println("ilk sayıyı giriniz");
        double sayı1 = input3.nextDouble();

        System.out.println("ikinci sayıyı giriniz");
        double sayı2 = input3.nextDouble();

        switch (işlemSembolü) {
            case '+':
                System.out.println("Toplam : " + (sayı1 + sayı2));
                break;

            case '-':
                System.out.println("Fark : " + (sayı1 - sayı2));
                break;

            case '*':
                System.out.println("Çarpım : " + sayı1 * sayı2);
                break;

            case '/':
                System.out.println("bölüm : " + sayı1 / sayı2);
                break;

            case '%':
                System.out.println("%" + sayı1 * sayı2/100);
                break;
            default:
                System.out.println("geçerli işlem gir");
        }

    }
}
