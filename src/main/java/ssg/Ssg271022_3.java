package ssg;

public class Ssg271022_3 {

    public static void main(String[] args) {

        //String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
//Örneğin; 'Ali Can?' ==> l*i*a*n*


        String s ="Ali Can?";

        s = s.replaceAll("[^a-z]","");

        String t = "";

        for (int i = 0; i < s.length() ; i++){

            String ara = s.substring(i,i+1);
            t = t + ara + "#";
        }
        System.out.println(t);

    //2. yol

        int n = 0;
        String d = "";
        while (n<s.length()){
            String ara2 = s.substring(n,n+1);
            d = d + ara2 + "$";
            n++;
        }
        System.out.println(d);

        //3 yol:

        String f = "";
        int p = 0;


        do { String ara3 = s.substring(p, p+1);

            f = f + ara3 + "^";

            p++;

        } while (p<s.length());

        System.out.println(f);
    }
}
