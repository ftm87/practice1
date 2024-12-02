package day06.encapsulatian;

public class Runner {
    public static void main(String[] args) {

            //Mete, Han, 25 ozelliklerine sahip bir obje olusturunuz ve yazdiriniz
    //objenin yasinı 30 olarak guncelleyin
    //paranetresiz cons kullanarak 2. bir obje olusturun
    //Ayse, Yilmaz, 40 degerlerini atayin
    //yas'ı -5 olarek guncelleyin
    //yas negatif deger olamayacak sekilde set methodunu quncelleyin
    //isim ve soyismin sadece ilk harfi okunsun diğerleri * olsun,
    //getter metodunda gerekli düzeltmeyi yapınız.

        Student std =new Student("Mete","Han",(byte) 25);
        System.out.println(std);//Student{isim='Mete', soyIsim='Han', yas=25}
        System.out.println(std.getIsim());
        System.out.println(std.getSoyIsim());
        System.out.println(std.getYas());
        System.out.println(std);





    }
}
