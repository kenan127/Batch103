package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {

    public static void main(String[] args) {

        //Example 1:  Asagidaki sekli ekrana yazdiran kodu yazinin
        //          ****
        //          ****
        //          ****

        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz...");
        int satir = input.nextInt();
        System.out.println("Sutun sayisini giriniz...");
        int sutun = input.nextInt();
        System.out.println("Karakter giriniz...");
        char ch = input.next().charAt(0);

        for (int dis=1 ; dis<=satir ; dis++) {
            for (int ic=1; ic<=sutun; ic++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        /*
    Example 2: Aşağıdaki şekli çizen kodu yazınız.
               1
               1 2
               1 2 3
               1 2 3 4
               1 2 3 4 5
        */

        for (int i = 1; i<6 ; i++){

            for (int k = 1; k<=i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }

        /*
        Example 3: Aşağıdaki şekli çizen kodu yazınız.

               * * * *
               * * *
               * *
               *
        */
                int row = 4;

            for (int i = 1; i <= row; i++){

                for (int k = row; k >= i; k--){
                    System.out.print("*" + " ");
                }
                System.out.println();
                }

        }


    }

