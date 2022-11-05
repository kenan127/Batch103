package ssg;

import java.util.Scanner;

public class C03_IfStatement_041022 {

    public static void main(String[] args) {

        /*  TASK :
 *  Kullanicidan IT alanini bilgisini alarak console'a
 *  meslegi = qa ==> Quality Analyst
             dev ==> Developer
           ba ==> Busines Analyst
           pm ==> Project Manager
bilgilileri yazdiriniz
 */
        Scanner input = new Scanner(System.in);
        System.out.println(" qa\n dev\n ba\n pm\n lütfen IT alanınızı giriniz");
        String job = input.next();

        if (job.equalsIgnoreCase("qa")){
            System.out.println("Quality Analyst - Bizdensin :D");
        } else if (job.equalsIgnoreCase("dev")){
            System.out.println("Developer");
        }else if (job.equalsIgnoreCase("ba")){
            System.out.println("Busines Analyst");
        }else if (job.equalsIgnoreCase("pm")){
            System.out.println("Project Manager");
        }else{
            System.out.println("geçerli bir tanım giriniz");
        }




    }
}
