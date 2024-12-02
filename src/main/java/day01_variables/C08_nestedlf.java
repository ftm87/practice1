package day01_variables;

import java.util.Scanner;

public class C08_nestedlf {
    public static void main(String[] args) {

        // bir kisinin kan bagisinda bulunup bulunamayacigini kontrol ediniz .

        // yas:18 ve uzeri olmali
       // kilo : 50 dan ust olmali

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen  yasinizi giriniz:");
        int age = input.nextInt();
        if (age>18){
            System.out.println("Lutfen kilonuzu giriniz:");
            double weight= input.nextDouble();
            if (weight>50){
                System.out.println("Lutfen asagidaki formu doldurunuz:");
            }else {
                System.out.println("Lutfen"+(50-weight)+ "kilo daha alip geliniz");
            }
        }else {
            System.out.println("Lutfen " +(18-age)+" yil sonra geliniz");
        }



    }
}
