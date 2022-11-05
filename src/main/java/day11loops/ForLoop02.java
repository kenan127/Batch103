package day11loops;

public class ForLoop02 {

    public static void main(String[] args) {

        // Example 1: bir stringteki m karakteri haric tum karakterleri yazdiriniz.

        String str = "madam";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'm') {
                System.out.print(c);
            }
        }
        System.out.println();
        // 2. yol;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'm') {
                continue; // islem yapma ==> loopun icinde bazi degerler icin loopun calismamasini isterseniz continue kullaniniz.
            }

            System.out.print(c);
        }



        //Example 2: 1'den 100 kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz
        for(int i=1; i<101; i++){

            if(i%6==0){
                continue;
            }
            System.out.print(i + " ");

        }
        System.out.println();
     // Example 3: size verilen bir stringteki "m"den onceki karakterleri yazidiriniz

        String s = "Luxemburg";

        for (int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);

            System.out.print(c);
            if(c=='m'){
                break;
            }

        }
    }
}
