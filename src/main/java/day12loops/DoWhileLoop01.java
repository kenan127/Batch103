package day12loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {

            // while loop bazi durumlarda hic calismayabilir.
            // yani "Zero Execution" mumkundur.
        int i = 1;
        while(i<1){
            System.out.println("While loop");
            i++;
        }

        // do while loop kullandiginizda loop bodysi icindeki kod en az 1 kere calisir
        // Yani do while loop icin "Zero Execution" mumkun degildir.

        int k = 1;

        do {
            System.out.println("do-while loop");
            k++;
        }while (k<1);

        //While loop icin loop bodysi icindeki kodun hic calistirilmama ihtimali vardir.
        // Do while loop bodysi icindeki kod her halukarda en az 1 kere calisir.


        //Example 1: Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.

        double num = 24.5673;

        String str = String.valueOf(num);

        // Regex icin nokta kullandiginizda onune "\\" koyunuz. Yani nokta "\\." seklinde kullanilir.
        String decimalPart = str.split("\\.")[1];
        int decimalInt = Integer.valueOf(decimalPart);

        int sum = 0;
        do {
            sum =  decimalInt%10;
            decimalInt = decimalInt/10;
            System.out.println(sum);
        }while (decimalInt>0);


    }
}
