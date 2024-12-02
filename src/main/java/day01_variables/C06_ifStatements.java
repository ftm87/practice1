package day01_variables;

import java.util.Scanner;

public class C06_ifStatements {
    public static void main(String[] args) {

        // if eger demektir else  dgilse demektir.
        // Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = input.nextInt();
        if (sayi %2==0){// % syinin bolumunden kalani veririr.
            System.out.println("Bir cift sayidir");
    }else{


        System.out.println("Bir tek sayidir");
    }

    //else if :eger degilse demektir
        //negatif veya notr oldugunu konrol edn kodu yaziniz.



        System.out.println("Lutfen bir sayi giriniz");

       double number= input.nextDouble();





    }
}
