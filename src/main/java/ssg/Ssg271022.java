package ssg;

public class Ssg271022 {

    public static void main(String[] args) {

        //Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız.
        // Bir String, tersi ile aynıysa, buna palindrom denir. Örneğin; "anna", "123321" palindromlardır.

        String str = "Anna";
        String a = "";
        // 1 yol:

        for (int i = str.length()-1 ; i > -1 ; i--){

            String c = str.substring(i,i+1);

            a = a + c;

        } if (str.equals(a)){
            System.out.println("Palindromedir");
        } else System.out.println("degildir");


        //2 yol:

        String str1 = "Anna";
        String r1 = "";

        int k = str1.length()-1;

        while (k>-1){
            String c1 = str1.substring(k,k+1);
            r1 = r1 + c1 ;
            k--;
        } if (str1.equals(r1)){
            System.out.println("Palindromedir");
        }else System.out.println("degildir");


        String str2 = "akna";
        int m = str2.length()-1;
        String bos = "";

        do { String f = str2.substring(m,m+1);
            bos = bos + f;
            m--;

        } while (m>-1);

        if (str2.equals(bos)){
            System.out.println("Palindromedir");
    }   else
            System.out.println("Degildir");



    }
}
