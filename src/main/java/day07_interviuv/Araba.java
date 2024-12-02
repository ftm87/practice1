package day07_interviuv;

public class Araba implements Fren,Motor,sase {
    @Override
    public boolean isAbs() {
        return true;
    }

    @Override
    public String getYagDurum() {
        return "Motorun yagi Max durumdadir";
    }

    @Override
    public void serFofrenUygula() {
        System.out.println("Araba normal frenden yaklasik 5 kat daha iyi fren uyguluyor");
    }

    @Override
    public void motorFrenUygula() {
        System.out.println("Normal fren calismadigi icin motor freni uygulamaktatir");
    }

    @Override
    public double getGuc() {
        return 0.2;
    }

    @Override
    public void calistir() {
        System.out.println("Motor calismaya basladi");
    }

    @Override
    public void durdur() {
        System.out.println("Motor durdurulmustur");
    }

    @Override
    public boolean durumKontrol() {
        return true;
    }

    @Override
    public String getBoyaTuru() {
        return "Sase metalik gri boya ile kaplidir";
    }

    @Override
    public String getKaportaTuru() {
        return "Sase steysin ";
    }

    @Override
    public boolean farCalisiyormu() {
        return true;
    }

    @Override
    public boolean sunRoofVarmi() {
        return true;
    }
}
