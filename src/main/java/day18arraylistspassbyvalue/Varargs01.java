package day18arraylistspassbyvalue;

public class Varargs01 {

        /*
               1) Farkli sayilardaki parametrelerle calisabilen bir method olusturmak isterseniz "varargs" kullanmalisiniz.
               2) "Varargs" arka tarafta "Array" kullanir. Arraylerle calisiyormus gibi kullanabilirsiniz.
               3) "Varargs" olusturmak icin <data type>...  <varargs ismi> veya <data type>   ...<varargs ismi>
               4) Bir methodta "varargs"in yaninda baska bir parametre kullanilabilir mi ?
                Varargs en sonda olmak sartiyla kullanilabilir
               5) Bir methodta birden fazla "varargs" kullanilabilir mi ?
                Varargs en sonda olmak zorunda oldugundan birden fazla kullanirsaniz en az biri en sonda olmayacagindan,
                4. kural ile celisir.
         */

    public static void main(String[] args) {

        int r1 = add(2,3);
        System.out.println(r1); //5

        int r2 = add(2,3,4);
        System.out.println(r2); //9

        int r3 = add(5,6,7,8,9);
        System.out.println(r3);



    }

    //Iki sayinin toplamini return eden bir method olusturunuz.

//    public static int add (int a, int b) {
//        return a + b;
//    }
//        //Uc sayinin toplamini return eden bir method olusturunuz.
//
//        public static int add (int a, int b, int c){
//            return a + b + c;
//        }
//
//    //Dort sayinin toplamini return eden bir method olusturunuz.
//
//    public static int add (int a, int b, int c, int d){
//        return a+b+c+d;
//
//    }

    // Istedigimiz kadar sayiyi toplayabilecegimiz bir method olusturalim ;

    public static int add (int... a){

        int sum = 0;

        for (int w : a) {
            sum = sum + w;
        }
        return sum;
    }
}
