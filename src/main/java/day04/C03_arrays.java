package day04;

import java.util.Arrays;

public class C03_arrays {
    public static void main(String[] args) {
        /*
        3.soru Verilen array
        in tum elemanlarini bir soldaki konuma tasiyacak
        bir program yazin. Ornek; array ((1,2,3,4,5)) ise output (2, 3,4,5, 1) olacak
                */



        int[] array={1,2,3,4,5};

        int temp=array[0];// arrayin bir elemnini aldik o .indexteki

        System.out.println(Arrays.toString(array));
        // ne zaman for ne zaman foech dongusu kullanicaz,,indexle isimiz varsa for yoksa foreach

        for (int i = 0; i < array.length-1; i++) {
            array[i] =array[i+1];

            System.out.println(Arrays.toString(array));
        }

        array[array.length-1]=temp;
        System.out.println(Arrays.toString(array));

        //ne zaman for ne zaman foreach dongusu kullanıcaz indexlerle işimiz varsa for dongusu
        // yoksa foreach birde eleman sayisi degisiyor daima for dongusu kulllanılır?

       /* String array[]={"a","b","c","d","e"};
        //1.yol
        //int arr[]={2,3,4,5,1};
        //2.yol
        System.out.println(Arrays.toString(array));//1,2,3,4,5
        //fori dongusu mu yoksa foreach dongusu mu kullanıcaz!!!
        String sayi=array[0];
        for (int i = 0; i < array.length-1 ; i++) {
            array[i] =array[i+1];
            System.out.println(Arrays.toString(array));
        }
        array[array.length-1]=sayi;
        System.out.println(Arrays.toString(array));*/
    }
}
