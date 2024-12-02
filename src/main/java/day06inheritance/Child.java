package day06inheritance;

public class Child extends Prent {

    public static String isim="Veli";
    public static void main(String[] args) {
        System.out.println(isim);//Veli
        System.out.println(Prent.isim);//ALi
       Prent.method1();
       method1();

       Prent p =new Prent();
        System.out.println(p.yas);//22
        Child c =new Child();
        System.out.println(c.yas);//5
    }
}
