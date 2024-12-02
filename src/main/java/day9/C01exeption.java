package day9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01exeption {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        byte age=0;
        try {
             age = input.nextByte();
            System.out.println(10/age);

        }catch (InputMismatchException e){
            e.printStackTrace();// bu bize hangi class dan nasil bir hata yapttigimizi  gosterir

        }catch ( ArithmeticException e){
            System.out.println("Payda sifir olmaz");
        }catch (Exception e){
            throw  new RuntimeException("acaba ne hata aldim");
        }finally {
            System.out.println("ne olursan ol yine calis");
        }
        System.out.println(age);
        System.out.println("kodum calismaya devam ediyormu");
    }
    // AritmeticException : sifira bolme basta olmak uzere matematiksel hatalari belirtir
// NullpointerException : Henüz deger atamasi yapmadigmiz degiskenler uzerinde islem yapmaya calisirsak dondurur
// IndexOutOfBoundsException: Hatalı indeks erişimlerinde fırlatılır.
// ClassCastException: Geçersiz tür dönüşümü işlemlerinde fırlatılır.
// IllegalArgumentException: Metoda verilen parametrelerden biri hatalı olduğunda fırlatılır.
// NumberFormatException: Bir String değerini sayısal bir türe dönüştürmeye çalıştığımızda, eğer String değer düzgün bir sayı ifade etmiyorsa fırlatılır.
// ArrayIndexOutOfBoundsException: Bir dizinin aralığı dışında elemanına erişmeye çalışıldığında fırlatılır.
// StringIndexOutOfBoundsException: Bir String index'inin disina cikarsak aldigimiz hata
// UnsupportedOperationException: Desteklenmeyen bir iş yapmaya çalışıldığında fırlatılır.
}
