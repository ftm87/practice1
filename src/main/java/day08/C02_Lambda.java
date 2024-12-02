package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Lambda {
    public static void main(String[] args) {

        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,7,11,23,12,14,9,47,58,91,37,37,23,8,11,1,23,23,8));

        //3)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

        maksimum(mylist);


    }

    private static void maksimum(List<Integer> mylist) {
        System.out.println(mylist.stream().distinct().reduce(Math::max).get());

    }
   
   // reduce() methodu teke indirme ozelligi var bizde sadece max deger istedgimiz icin bunu kullanalim















    
    
    
    /*vaarags
    public static void main(String[] args) {
        toplam(1,2,3,4,5,6,7,8,980,68,56,121,12);
    }
    public static void toplam(int...a){
        int toplam=0;
        for (int b:a){
            toplam+=b;
        }
        System.out.println(toplam);
    }*/

}
