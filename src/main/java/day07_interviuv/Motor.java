package day07_interviuv;

public interface Motor {

    //morun gcunu getirir
    double getGuc(); // burda herhangi bir islem yapmadik .soyutlama var ama yapilacagi belli

    //motoru calistirmak
    void calistir();

    //motoru durdurma
    void durdur();

    // motorun durum kontrol etmek
    boolean durumKontrol();

}
