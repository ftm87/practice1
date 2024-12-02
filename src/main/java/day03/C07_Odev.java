package day03;

import java.util.Random;
import java.util.Scanner;

public class C07_Odev {

    public static void main(String[] args) {

           // bilgisayara 1 ile 100 arasinda bir sayi tutturun
    // kullanicidan bu sayiyi tahmin etmesini isteyin
    // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
    // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
    // Random rnd=new Random();
    // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
    // odev!!!kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin



   //( burda hangi dongu kullanilir.burda dongu sayisi bellimi..degil...en az birkere calismasinin konrolu kullaniciyami bagli..hayir.burda while kullanilmasi gerekir


        Scanner input = new Scanner(System.in);
        Random rnd= new Random();
       int rndsayi = rnd.nextInt(100);



        int tahminhakki = 5;
        while (tahminhakki>0){
            System.out.println("Lutfen tahminda bulunmak icin 1-100 arasinda bir sayi giriniz");

        int sayi=input.nextInt();
        if (sayi>100|| sayi<0){
            System.out.println("Lutfen verilen aralikta bir deger giriniz");

        }else {
            if (rndsayi>sayi){
                System.out.println("daha buyuk bir sayi giriniz");
            } else if (rndsayi<sayi) {
                System.out.println("daha kucuk bir sayi giriniz");
            }else {
                System.out.println("Kalan tahmin hakkiniz:"+tahminhakki);

            if (tahminhakki==0);
                System.out.println("Tahmin hakkiniz bitmistir eger dilerseniz 3tane daha alabilirsinizalmak e almamak htusuna basiniz");

            String str = input.next();
            if (str.equals("e")){
                tahminhakki+=3;
            }else {
                System.out.println("Gorusmek uzere tekrar bekleriz");
            }



            }
        }


        }



    }
}
