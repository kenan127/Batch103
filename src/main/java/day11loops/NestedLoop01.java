package day11loops;

public class NestedLoop01 {

    public static void main(String[] args) {

/*
            1.Example:Type code to get the output like
            asagidaki ciktiyi verecek kodu yazdiriniz.
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
          */

        for (int i=1 ; i<5 ; i++){
            System.out.println("Week: " + i);

            for (int ii=1 ; ii<8 ; ii++){
                System.out.println("Day: " + ii);
            }
        }



    }
}
