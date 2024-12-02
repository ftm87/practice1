package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {

        /*
        bir listedki tek elemanlari ayni satirda aralarina
        bosluk koyarak yazdiran methodu olusturun
         */

        List<Integer> myList =new ArrayList<>((Arrays.asList(1,2,3,4,5,6,7,8,9,10,11)));

       tekEleman(myList);
       tekEleman1(myList);
       rakamlarinKareleri(myList);

    }



    //1 yol bu soruyu for ve if ile cozerdik
    private static void tekEleman1(List<Integer> myList) {
        for (int w :myList) {

            if (w %2!=0){
                System.out.print(w+" ");
            }
        }
    }

    //2.yol lambda ile
    private static void tekEleman(List<Integer> myList) {

        myList.
                stream().
                filter(t-> t%2!=0).
                forEach(t-> System.out.print(t+" "));
    }


 //---------------------------------

    //bir listedeki 10 dan kucuk olan elemanlarin karelerini ayni satirda aralarinda bosluk koyarak yazin

    private static void rakamlarinKareleri(List<Integer> myList) {
     /*   myList.
                stream().
                filter(t-> t<10)
                .map(t-> t*t).
                forEach(t-> System.out.print(t+" "));*/

        // eger toplamlarini  alsaydik soyle olurdu

       int sum =myList.stream().filter(t-> t<10).map(t-> t*t).reduce(0,Integer::sum);// reduce ile biz birnevi akistan cikmis oluyoruz buyuzden onu aktarmak gerekli int sum ile

        System.out.println(sum);
    }
}
