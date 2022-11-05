package ssg.StringBuilder;

public class StringBuilder03 {

    public static void main(String[] args) {

        StringBuilder sb2= new StringBuilder("Java cok guzel");


        System.out.println(sb2.toString().toUpperCase());
        System.out.println((char)sb2.charAt(0) + (char)sb2.charAt(13));

    }
}
