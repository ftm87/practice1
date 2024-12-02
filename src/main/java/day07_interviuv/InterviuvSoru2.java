package day07_interviuv;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterviuvSoru2 {
    public static void main(String[] args) {

        /*
         bir tamsayi listesindeki pozitif  sayilarin karaelerini hesaplayan bir java metodu yazin
         lambda ifadelerini ve akis (stream) api sini kullanarak bu islemi gerceklestirin
         */
        List<Integer> numbers = Arrays.asList(-1, 2 , 3 ,-4, 5);

        karehesapla(numbers);

    }

    private static void karehesapla(List<Integer> numbers) {
   List<Integer> list   = numbers.
                stream().
                filter(t-> t>0).
                map(t-> t*t).collect(Collectors.toList());//collecters akistan gelen sayilari tekrar liste yapti
        System.out.println(list);//[4, 9, 25]
    }


}

