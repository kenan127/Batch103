package ssg.StringBuilder;

public class StringBuilder02 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Prize dikkat ");
        sb1.append(" ediniz");
        sb1.append("");

        System.out.println(sb1.length()); //13
        System.out.println(sb1.capacity()); //16*2 + 2 // 34

    }
}
