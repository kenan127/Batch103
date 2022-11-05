package ssg.StringBuilder;

public class StringBuilder01 {

    public static void main(StringBuilder02[] args) {

        String str= "Ali Can";
        str = "ali can";
        System.out.println(str);

        StringBuilder sb1 = new StringBuilder("Java cok guzel");
        sb1.append("dir");
        sb1.append("program");
        sb1.append("QA").append("Cok").append("Kolay");
        System.out.println(sb1);



    }
}
