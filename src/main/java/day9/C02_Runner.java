package day9;

import java.util.Scanner;

public class C02_Runner {
    public static void main(String[] args) throws AgeExeption {
        // task: bir kullanicini kan verebilmesi icin yasi tutuyormu onu bakalim eger


        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen yasinizi griniz");
        int age = input.nextInt();
        if (age>=18){
            System.out.println("Kan vermek icin formu doldurunuz");
            System.out.println("......");

        }else {
            throw new AgeExeption();
        }
        System.out.println("else kismi calistiginda kodumuz calismaya devam ediyormu");
    }
}
