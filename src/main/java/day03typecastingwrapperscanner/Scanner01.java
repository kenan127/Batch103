package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    //Scanner kullanıcıdan data almaya yarar. Scanner kullanıcı ile etkileşim kurmamızı sağlar.
    // Scanner bir Java Class'ıdır. Bu Class'ı kullanabilmek için "import" etmek gerekir.
    // Scanner Class'ı Javanın util kutuphanesindedir.


    public static void main(String[] args) {

        // Kullanıcıdan data almak için yapılması gerekenler;
        // 1. Adım: Scanner Class'ından object oluşturun.
                Scanner input = new Scanner(System.in);

        // 2. Adım: Kullanıcıya ne yapacağını söyle
                System.out.println("Hey Kullanıcı yaşını gir....");

        // 3.Adım:  Kullanıcıdan aldığınız data'yı bir variable'ın içine koyun.
                byte age = input.nextByte();

        System.out.println("Hey Kullanıcı senin yaşın " + age);





    }
}
