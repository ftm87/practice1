package day04;

import java.util.Arrays;

public class C01_arrays {


    public static void main(String[] args) {


           /*
    1.soru bir array olusturun ve olusturdugunuz arraydeki tum elemanları yazdırın
     */

    // ilk olarak girecegimiz datayi yazalim[] bunun adi diz demek yani array


    String[] isimler={"Ali Can","Muhammet","Sinan","Kerim","Tuba","Esra"};

        System.out.println(Arrays.toString(isimler));//arrays isimli class dan tostring geliryani arraylerin kullanimi saglayan yardimci class

    //2,yol
        System.out.println(isimler);
        for (String a :isimler ) {
            System.out.print(a+ ",");
        }

        System.out.println();

            /*
        2.soru bir array olusturun ve
        olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
         */

   int[] sayi ={1,2,3,4,5,6,7,8,9,34,5,6,78,};

   Arrays.sort(sayi);// burda sayilarimi siraliyorum

        System.out.println(Arrays.toString(sayi));






    }
}
