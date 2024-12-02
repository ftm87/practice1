package day07_interviuv;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterviuvSoru3 {
    public static void main(String[] args) {
        /*
        bir tamsayi listesi kullanarak asagidaki islemleri gerceklestiren bir java methodu yazin

        Negatif sayilari filtrele
        kalan pozitif sayilari iki katina cikar
        sonuclari buyukten kucuge siralayin ve bir liste olarak dondurun
         */

        List<Integer>numbers = Arrays.asList(-5,3 ,-2, 8,0,1,-1,6);

        method(numbers);

    }

    private static void method(List<Integer> numbers) {

       List<Integer> newNumber= numbers.stream().filter(t->t>0).map(t->t*2).sorted().collect(Collectors.toList());
        System.out.println(newNumber);//[2, 6, 12, 16]
    }


}
