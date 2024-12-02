package day04;

import java.util.List;

public class C07_list {
    public static void main(String[] args) {


        // bir listede ortalamanin ustunde olan element sayisini bulunuz

        //List.of methodu kısa surece list olusturmayı saglar fakat arraylistlerde kullanılamaz

        List<Double> sayilar=List.of(1.5,3.14,1.8,57.57,37.0,13.5);// kisa yoldan hizli bir sekilde list olusturur ama arraylistlerde kullanilmaz

       // toplamlari
        // eleman sayisi

        double sum= 0;// toplam kavanozom

        for (Double a :sayilar){
         sum+=a;
        }

     // ortalama=toplamlari/elemen sayisi

        double ort =sum / sayilar.size();

        System.out.println(ort);//19.085


        int sayac=0;
        for (double a:sayilar){
            if (a>ort){
                sayac++;
            }

            System.out.println(sayac);


        }


/*ODEV
icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
kullanicidan bir sayi isteyip
listede var olup olmadigini kullaniciya yazin
*/

  /*
 Asagidaki multi dimensional array'in
 ic array'lerindeki tum elemanlarin toplamini birer birer bulan
 ve herbir sonucu yeni bir array'in elemani yapan
 ve yeni array'i ekrana yazdiran bir program yaziniz
 Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
 */
//gelcek hafta multi dimensional arraylerden devam edicez




    }
}
