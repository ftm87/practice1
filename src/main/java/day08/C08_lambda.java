package day08;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C08_lambda {
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

        tekrarsizUzunlukSiraliYazdir(mylist);

    }

    //9) Bir List'teki elemanlari tekrarsiz olarak, uzunluklarina gore
    // kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

    private static void tekrarsizUzunlukSiraliYazdir(List<String> mylist) {
       mylist.
               stream().
               distinct().
               sorted(Comparator.comparing(String::length)).
               forEach(System.out::println);
    }
}
