package mentorgrupodevleri;

public class SlacktenOdev {

    public static void main(String[] args) {
       /* Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını,
       kendisinden önce bir yıldız işaretiyle yazdırmak için gereken kodu yazınız.
       Örneğin; 75.4238 ´ *4*2*3*8
        */

        double sayi = 75.4238;                          
        String str = String.valueOf(sayi);
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);
        int n = decimalPart.length();
        int sayac = 0;

//        do {
//            char s = decimalPart.charAt(sayac);
//
//
//             sayac++;
//            System.out.print("*" + s);
//            }while (sayac<n);

        while (sayac<n){

            char s = decimalPart.charAt(sayac);

            //System.out.print("*" + s);
            sayac++;
            System.out.println("*" + s);
        }

        /*Soru 4) Kullanicidan toplamak üzere pozitif sayilar isteyin, işlemi bitirmek için 0’a basmasini söyleyin.
                Kullanici yanlislikla negative şayi girerse o sayiyi dikkate almayin ve "Negatif şayi giremezsiniz" yazdirip basa donun
        Kullanici 0’a bastiginda toplam kac pozitif şayi girdiğini, yanlislikla kac negative şayi girdiğini ve girdigi pozitif
        sayilarin toplaminin kac olduğunu yazdirin.
                */

//        Scanner input= new Scanner(System.in);
//        int sayi;
//        int toplam=0;
//        int negatifToplam=0;
//        int sayac=-1;
//        int negatifSayac=0;
//
//
//        do {
//            System.out.println("lutfen sifirdan buyuk bir sayi giriniz");
//            System.out.println("Islemi bitirmek icin 0'a basiniz");
//            sayi= input.nextInt();
//            if (sayi>=0){
//                toplam=toplam+sayi;
//                sayac=sayac+1;
//            }else if (sayi<0){
//                System.out.println("Negatif sayi giremezsiniz");
//                negatifToplam= negatifToplam +sayi;
//                negatifSayac= negatifSayac+1;
//            }
//
//        }while (sayi!=0);
//        System.out.println(sayac + "  Pozitif sayi girilmistir");
//        System.out.println(negatifSayac+ " Negatif sayi girilmistir");
//        System.out.println("Pozitif Sayilarin toplami : " + toplam);
//        System.out.println("Negatif Sayilarin toplami ="+ negatifToplam);
    }
}
