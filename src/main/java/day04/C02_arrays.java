package day04;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {



             /*
        2.soru bir array olusturun ve
        olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
         */

        int[] sayi ={1,2,3,4,5,6,7,8,9,34,5,6,78,};

        Arrays.sort(sayi);// burda sayilarimi siraliyorum

        System.out.println(Arrays.toString(sayi));

    }
}
