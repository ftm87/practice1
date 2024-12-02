package day04;

import java.util.Arrays;

public class C04_arrays {
    public static void main(String[] args) {

        /*
        4.soru Verilen bir int array'deki
        en buyuk sayiyi yazdiran bir method olusturun.
        */
        int sayi[] = {1, 4, 7, 3, 2, 8, 6, 4, 9, 4, 2, 3, 5, 1, 99, 123, 632, 213, 543, 4332, 43, 56, 7, 54, 657};

        Arrays.sort(sayi);

        System.out.println(sayi[sayi.length-1]); // short kullanarakta boyle birsey yapariz

        System.out.println("Max sayi:"+sayi[sayi.length]);// boylede olur
        maxSayiYazdir(sayi);
    }


public static void maxSayiYazdir(int[] sayi){
        int max =sayi[0];// sayimizin 0,indexini aliyoruz daha garantili

        for(int a:sayi){
            if (a>max){
                max=a;
            }
        }
    System.out.println("Max sayi:"+max);
}

    /*ODEV
    6.Soru -Verilen String bir array'de en uzun
    ve en kisa String'leri yazdıran bir method olusturun

     7.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
     true veya false sonucu donen bir method olusturun

     */

}
