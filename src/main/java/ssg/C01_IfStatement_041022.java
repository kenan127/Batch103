package ssg;

public class C01_IfStatement_041022 {

    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        if(a==b){
            System.out.println("a ve b sayıları eşittir.");
        }else if(a!=b){
            System.out.println("a ve b sayıları eşit değildir.");
        }
        if((a+b)<100){
            System.out.println("toplamları 100'den küçüktür.");
        }
        if(a*b==10){
            System.out.println("çarpımları 10'a eşittir.");
        }


        /*
        package Week_01;
public class C01_IfStatement {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        if(a==b){
            System.out.println("a ve b sayıları eşittir");
        }else{
            System.out.println("a ve b sayıları eşit değildir");
        }
        if((a+b)<100){//true
            System.out.println("toplamları 100 denküçük");
        }
        if((a*b)==10){//false
            System.out.println("çarpımları 10 a eşittir");
        }
    }
}
         */

    }//main
}//class
