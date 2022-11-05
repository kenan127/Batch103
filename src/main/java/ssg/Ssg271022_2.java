package ssg;

public class Ssg271022_2 {

    public static void main(String[] args) {


        //Bir Stringi tersine cevirmek icin kod yaziniz.

        String str = "Kenannnn";

        String bos = "";

        for (int i = str.length()-1 ; i > -1 ; i--){

            String araStr = str.substring(i,i+1);
            bos = bos + araStr;

        }
        System.out.println(bos);

        //2. yol

        String t = "Kenannnn";

        StringBuilder sb = new StringBuilder(t);

        System.out.println(sb.reverse());


    }

}
