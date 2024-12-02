package day05;

import java.util.Arrays;

public class C05_soru {
    public static void main(String[] args) {
         /*
         Asagidaki multi dimensional array'in
         ic array'lerindeki tum elemanlarin toplamini birer birer bulan
         ve herbir sonucu yeni bir array'in elemani yapan
         ve yeni array'i ekrana yazdiran bir program yaziniz
         Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
         */
        int [][]arrays={{1,2,3}, {4,5}, {6, 7} };
        int []yeniArray=new int[arrays.length];
        int toplam=0;
        for (int i = 0; i <arrays.length ; i++) {

            for (int a:arrays[i]) {
                toplam+=a;
            }
            yeniArray[i]=toplam;
            toplam=0;
        }
        System.out.println(Arrays.toString(yeniArray));

    }
}
