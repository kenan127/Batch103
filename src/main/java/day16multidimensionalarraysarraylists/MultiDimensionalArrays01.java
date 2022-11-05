package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

    public static void main(String[] args) {

        // Bir tane MultiDimensional Array olusturunuz.
        // bu arraydeki tum sayilarin toplamini veren kodu yaziniz.

        int arr[][] = {{2,5,1},{32,75},{13,21,43,56}};

        int sum = 0;

        for (int[] w : arr){
            for (int k : w){
                sum = sum + k;
            }
        }
        System.out.println(sum);

            // elinde array veya collecion varsa ilk once for each loop kullanmak ilk tercih olsun
            //elinde array veya collecion var ama index kullanmak zorundasiniz o zaman for each loop calismaz", for loop
            // veya while loop veya do while loop kullanmalisiniz.
            //   elinde array yoksa for each loop kullanmak mantikli degil

        // Bir multidimensional array'i normal array'e ceviren kodu yaziniz
        //  { {2, 5, 1}, {32, 75} } ==> { 2, 5, 1, 32, 75}

            int brr [][] = { {2, 5, 1}, {32, 75} };
            
            int toplam = 0;
            
            for (int[] w : brr){

                    toplam = toplam + w.length;                
            }
        System.out.println("toplam = " + toplam);

            int crr[] = new int[toplam];
            int idx = 0;

            for (int[] w : brr){
                for (int k : w){
                    crr[idx] = k;
                    idx++;
                }

            }
        System.out.println(Arrays.toString(crr));

      
    }
}
