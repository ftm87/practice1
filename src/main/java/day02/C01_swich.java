package day02;

import java.util.Scanner;

public class C01_swich {

    public static void main(String[] args) {


       //birden fazla secim islemi varsa tercih ederiz swici.
       //toplama cikarma carpma bolme klan hesaplama ve us alma

       // Ornek; 2 sayi işlem yapan basit bir Hesap Makinesi oluşturun:

        //bizim burda kullanican bilgi almamiz gerekli.bilgi veremmiz gerekli

        //1. adim

        Scanner input = new Scanner(System.in);// bize veri almayi ve bilgi vermeyi saglar
        // 2. adim normal kosullarda kullaniciya bilgi verdik
        System.out.println("Lutfen  islem yapmak istediginiz operatoru giriniz: \ntoplama icin : +\ncıkarma icin : -\ncarpma icin : * \nbolme icin :/  \nus almak icin : ^\nkalan hesaplama icin : %\");");
        //3, adim uygn bir variabla atamak
        char operator =input.next().charAt(0);//verimizi tuttugumuz kavonoz



       switch ( operator){
           case '+':

               System.out.println("Lutfen toplamak istediginiz sayilari sirasiyla giriniz");
               System.out.println("sayilarin toplami :"+(input.nextInt()+input.nextInt()));
            break;

            case'-':
           System.out.println("Lutfen toplamak istediginiz sayilari sirasiyla giriniz");
           System.out.println("sayilarin farki:"+(input.nextInt()-input.nextInt()));
           break;

           case '*':
               System.out.println("Lutfen toplamak istediginiz sayilari sirasiyla giriniz");
               System.out.println("sayilarin carpimi :"+(input.nextInt()* input.nextInt()));
           break;

           case  '/':
               System.out.println("Lutfen bolmek istediginiz sayilari sirasiyla giriniz");
               int s1 =input.nextInt();
               int s2 =input.nextInt();

               if (s2!=0){

               }else {
                   System.out.println(" sayi sifira bolunmez");
               }
               break;
           default:
               System.out.println("yanlis secim yaptiniz tekrar deneyiniz");
           break;

       }
    }
        
}
