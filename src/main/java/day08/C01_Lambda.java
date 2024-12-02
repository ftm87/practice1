package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Lambda {
    public static void main(String[] args) {
        //1) bir listedeki elemanlardan 5'e tam bolunenleri yazdiran bir method olusturun

        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));

        besebolunen(mylist);
        kublerinialma(mylist);
    }



    private static void besebolunen(List<Integer> mylist) {

     mylist.stream().filter(t->t%5==0).forEach(System.out::println);//5 10

    }


    //2) Bir list'teki "3'e tam bolunmeyen" olan elemanlarin
    // "kup"lerini "tekrarsiz" olarak ayni satirda
    //aralarina bosluk koyarak yazdiran method'u olusturunuz.

    private static void kublerinialma(List<Integer> mylist) {
        mylist.
                stream().
                distinct().
                filter(t->t%3!=0).
                map(t->t*t*t).
                forEach(t-> System.out.println(t+" "));// arada bosluk istedigimiz icin bu sekilde yazdiriyoruz
    }

}