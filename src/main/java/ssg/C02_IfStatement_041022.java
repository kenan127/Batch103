package ssg;

import java.util.Scanner;

public class C02_IfStatement_041022 {

    public static void main(String[] args) {

/*
        Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
 Not'u harf sistemine cevirip yazdirin.
 50’den kucukse "D",
 =50  <60 arasi "C",
 =60  <80 arasi "B",
 =80’nin uzerinde ise "A"
 */
        Scanner input = new Scanner(System.in);
        System.out.println("100 üzerinden bir not değeri girin...");
        double not = input.nextDouble();

        if (0<=not && not<50){
            System.out.println("Notunuz D");
        } else if (not>=50 && not<60){
            System.out.println("Notunuz C");
        }else if (not>=60 && not<80) {
            System.out.println("Notunuz B");
        }else if (not>=80 && not<=100){
            System.out.println("Notunuz A");
        }else{
            System.out.println("geçerli bir not giriniz");
        }

    }
}
/*
package Week_01;
import java.util.Scanner;
public class C02_IfStatement {
    public static void main(String[] args) {
        /* Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
 Not'u harf sistemine cevirip yazdirin.
 50’den kucukse "D",
 =50  <60 arasi "C",
 =60  <80 arasi "B",
 =80’nin uzerinde ise "A"
Scanner scan =new Scanner(System.in);
        System.out.println("Kullanicidan 100 uzerinden notunu isteyin.");
                double x=scan.nextDouble();
                if(x>=0 && x<=100){
                if(x<50){
        System.out.println("D");
        } else if (x==50 || x<60){
        System.out.println("C");
        } else if (x==60 || x<80){
        System.out.println("B");
        } else if(x>=80 && x<=100){
        System.out.println("A");
        }
        }else{
        System.out.println("lütfen 0 ile 100 arasında değer giriniz");
        }
        }
        }
 */