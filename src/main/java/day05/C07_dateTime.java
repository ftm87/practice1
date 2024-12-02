package day05;

import java.time.LocalDate;
import java.util.Scanner;

public class C07_dateTime {
    public static void main(String[] args) {



        /*
       soru 1)
       -bugunun tarihini obje olusturarak yazdirin
       -bugun yilin kacinci gunu oldugunu yazdirin
       -hangi gunde oldugumuzu yazdirin
       -yılın bitmesine kac gun kaldıgını yazdırın
       -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
       -bugunden itibaren 2yil 2 ay 2 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
       -bugunden itibaren 7yil 7 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
       -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
*/
        LocalDate tarih=LocalDate.now();
       // now() benim local tarih olarak ne bulunuyor onu getirir
        System.out.println(tarih);//2024-10-10

        tarih.getDayOfYear();
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getDayOfWeek());

        if (tarih.isLeapYear()){
            System.out.println(366- tarih.getDayOfYear());
        }else {
            System.out.println(365-tarih.getDayOfYear());

        }

        System.out.println(tarih.lengthOfYear()-tarih.getDayOfYear());

        System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(2).getDayOfMonth());
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Bir gün giriniz");
        int day=input.nextInt();
        System.out.println("Lütfen bir ay giriniz");
        int month=input.nextInt();
        System.out.println("Lütfen bir yıl giriniz");
        int year= input.nextInt();
        LocalDate yeniTarih=LocalDate.of(year,month,day);
        System.out.println(yeniTarih);

        if (yeniTarih.isBefore(tarih)){
            System.out.println(yeniTarih);
        } else if (tarih.isBefore(yeniTarih)) {
            System.out.println(tarih);
        }else {
            System.out.println("Bu iki tarih birbiri ile aynıdır");
        }
        //soru 2)
        //-suanin saatini dakikasini ve saniyesini bize dondurun
        //-suanin saniyesini bize dondurun
        // -10000 saniye sonrasini bize dondurun
        //-200 dakika onceki saati bize dondurun
        //-bize saati 3 yapip yazdirin(dakika ve saniye degismeden)
        //Odev!!!!

        ///*
        //        soru 3)
        //        bize bugunun tarihini ve su anki saati dondurun







    }
}
