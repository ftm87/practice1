package day06.encapsulatian;

public class Student {

    //encapsulation ; data hiding olarak adlandiriliyor veri koruma ve gizleme
       /*
    bir class oluşturalım.
    private access modifiera sahip variablelar oluşturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor oluşturun
    toString metodunu oluşturun
*/
// biz bir objeye ozellik ekliyorsak instance olarak olusturmali.altta bunu olusturali

    //private;gizli---protected;ayni packed ve cildlarda erisebilir---default; sadece packed-----public; herkes ulasabilir

    private  String isim ;// data tru atamiyoruz bu sekilde birakiyoruz
    private  String soyIsim;
    private  byte yas ;

    //getter ;okuma ve goruntuleme

    public String getIsim() {
        return isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public byte getYas() {
        return yas;
    }


    //setter; degirtirme guncellem

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public void setYas(byte yas) {
        this.yas = yas;
    }


    //noArguments

    public Student(String isim) {
        this.isim = isim;
    }

    //allArguments constrocter
    public Student(String isim, String soyIsim, byte yas) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
    }
    //toString


    @Override
    public String toString() {
        return "Student{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
