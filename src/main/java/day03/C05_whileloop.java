package day03;

import java.util.Scanner;

public class C05_whileloop {
    public static void main(String[] args) {



       /*
      ternary --> kac defa donecegi belli mi ? for for : (en az bir kere calismasi gerekli mi ? do-while : while);
  */
        // kullanicidan toplamak istedigi sayilari alin
    // ve kullanici 0'a basincaya kadar devam edin
    // kullanici 0'a bastiginda
    // girdigi tum sayilarin toplamini yazdirin


        // 1 adim


        Scanner input = new Scanner(System.in);


       // 2, adim
        int sayi;
        int toplam=0;
        do {
            // 3. adimda bilgi veriyorum
            System.out.println("Lutfen toplamak istediginiz sayilari giriniz 0 a basincaya kadar toplam devam edecek");

             sayi = input.nextInt();
             toplam+=sayi;
        }while (sayi!=0);

        System.out.println("toplam="+ toplam);

    }
}
