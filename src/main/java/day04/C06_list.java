package day04;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_list {
    public static void main(String[] args) {


        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun

        // orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun


        ArrayList<Integer>mylist =new ArrayList<>(Arrays.asList(1, 3, 5, 3, 5, 6, 1, 7));

        System.out.println(mylist);

    tekrarsizlist(mylist);// metodum(yazdirmak istediggim yer)



    }

    private static void tekrarsizlist(ArrayList<Integer> mylist) {

    ArrayList<Integer>tekrarsizlist=new ArrayList<>();
    for (Integer a : mylist){
        if (!tekrarsizlist.contains(a)){
            tekrarsizlist.add(a);
        }else {
            System.out.println("Bu sayidan birden fazla var :"+a);
        }
    }

        System.out.println(tekrarsizlist);
    // private static void tekrarsizList(ArrayList<Integer> mylist) {
        //        ArrayList<Integer>newlist=new ArrayList<>();
        //        for (int a:mylist
        //             ) {
        //            if (!newlist.contains(a)){
        //                newlist.add(a);
        //            }
        //        }
        //        System.out.println(newlist);
        //    }

    }
}