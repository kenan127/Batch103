package ssg;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ssg271022_4 {

    public static void main(String[] args) {

        //Armstoring sayisi. her basamaginin kupunun toplamina esitse Armstrong sayisidir.

        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = input.nextInt();

        int sumOfCubes = 0;
        int temp = sayi;
        int digit = 0;

        while (sayi > 0){

            digit = sayi % 10;
            sumOfCubes = sumOfCubes + digit*digit*digit;
            sayi = sayi / 10;

        }
        if (temp == sumOfCubes){
            System.out.println(temp + " Armstrong Sayisidir.");
        } else System.out.println(temp + " Armstrong Sayisi degildir.");
    }
}
