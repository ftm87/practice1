package day07_interviuv;

import java.util.Arrays;
import java.util.Scanner;

public class InterwiuvSoru {
    /*
    bir metin icinde  kullanicidan alinan bir kelimenin
    kac kez gectigini sayan bir java methodu yazin
    Metin buyuk/kucuk harf dutyarli olmali
    ornek girdi olarak " Java ,Java and java!" verildiginde kullanici java girrerse cikti olarak  3 vermelidir
     */
    public static void main(String[] args) {
        String str =" Java ,Java and java!"; // burda metnimizi aldik
        Scanner input =new Scanner(System.in);// objemizi olusturduk
        System.out.println("Lutfen aramak istediginiz kelimeyi giriniz");// kullanicidan bilgi aldik
        String word = input.next();// kullanicidan hangi data tipinde girmesi hakkinda kosul koyduk
        // kelime sayma metod cagrisi yapalim

         countWordOccurences(str,word);// burda sol tarafta olan benim cumlem sag taraf aranan kelime
        splitWhithCountWordOccurences(str,word);

    }



    private static void countWordOccurences(String str, String word) {

        // burda direk kucultme yapatik buyuk kucuk harfe duyarsizlastrmak icin.normalde equals.ignorcase de kullanirdik ama uzatmaylim
        str=str.toLowerCase();
        word=word.toLowerCase();

        int count=0;  // kelime sayisini tutar.
        int index=0;  //arama islemi sirarsinda kullanilacak indexi tutar

                                    // String str =" Java ,Java and java!";
        while ((index=str.indexOf(word,index))!=-1){
            count++;
            index+=word.length();
        }
        System.out.println("Bu kelimeden toplam: " +count+ "tane kullanilmistir");

    //indexOf()  bu girilen kelimenin ilk indexsini veriri,cumleler icinde gecerli

    /*
    while ((index = str.indexOf(word, index)) != -1) döngüsü, metin içinde kelimeyi arar. str.indexOf(word, index) ifadesi,
     word kelimesinin metin içinde kaçıncı indeksten itibaren bulunduğunu döner. Bulamazsa -1 döner.
    Eğer index -1 değilse, count++ ile sayacı bir artırır ve index += word.length(); ile aramanın başlangıç indeksini günceller.
    Döngü, metin içinde aranan kelime kalmayana kadar devam eder.
         */

    }


    //2. yol burda split ile arraya cevirip yapicaz

    private static void splitWhithCountWordOccurences(String str, String word) {
        str =str.toLowerCase().replaceAll("[^a-z]",""); // tum harfleri kuculttuk sonra replace ile a-z haric tum herseyi hiclik yaptik
        word=word.toLowerCase();

        String[] arr =str.split(" ");
        System.out.println("arr =" + Arrays.toString(arr));
      //  System.out.println("arr.length =" + arr.length);

        int sayac =0;
        for (String w :arr){
           if (w.equals(word)){
               sayac++;
           }
        }

        System.out.println("Bu kelimeden toplam :"+sayac+ " tane kullanilmaktadir");


    }

}
