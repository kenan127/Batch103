package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: Size verilen bir int Arraydeki pozitif ve negatif sayilar iceren bir int arraydeki
        // en buyuk negatif ve en kucuk pozitif elemani bulunuz.

        int arr[] = {-12, 18, -5, 23, -2};

        Arrays.sort(arr);

        int maxNegative = arr[0];
        int minPozitive = arr[arr.length-1];

        for (int w : arr){

            if (w<0){
                maxNegative = Math.max(maxNegative, w);
            } else if (w>0) {
                minPozitive = Math.min(minPozitive, w);
            }


        }System.out.println("En buyuk negatif " + maxNegative + "\n and \n" + "En kucuk pozitif " + minPozitive);
    }
}
