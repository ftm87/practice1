package day08;


import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C07_lambda {
    public static void main(String[] args) {


        List<String> mylist=new ArrayList<>();
        mylist.add("Bayram");
        mylist.add("Berkhan");
        mylist.add("Emine");
        mylist.add("Faruk");
        mylist.add("Feyza");
        mylist.add("Hulika");
        mylist.add("İlay");
        mylist.add("Mustafa");
        mylist.add("Levent");
        mylist.add("Kubilay");
        mylist.add("Nesibe");
        mylist.add("Ahmet");
        mylist.add("arda");
        mylist.add("ahmet");

        tekrarsizKucukTersYazdir(mylist);
    }

    //8) Bir List'teki elemanlari tekrarsiz olarak,
    // kucuk harflerle, alfabetik sira'nin tersi olarak
    // console'a yazdiran method'u olusturunuz.

    private static void tekrarsizKucukTersYazdir(List<String> mylist) {

     mylist.
             stream().
             map(String::toLowerCase).
             distinct().
             sorted(Comparator.reverseOrder()).// ters siralama yapar
             forEach(System.out::println);
    }

}
