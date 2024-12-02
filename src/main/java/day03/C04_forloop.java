package day03;

public class C04_forloop {
    public static void main(String[] args) {



/*
    * * * * .
    * * * . .
    * * . . .
    * . . . .
    . . . . .

   */

        int satir = 10;

        for (int bulunSatir = 1; bulunSatir <= satir; bulunSatir++) {
            for (int yildiz = satir - bulunSatir; yildiz > 0; yildiz--) {
                System.out.print("* ");
            }
            for (int nokta = bulunSatir; nokta > 0; nokta--) {
                System.out.print(". ");
            }

            System.out.println();


        }

        /*
           *
          * *
         *****
        *     *
       *       *




         */

        int satir1 = 5;

        for (int bulsatir = 1; bulsatir <= satir1; bulsatir++) {

            for (int bosluk = satir1 - bulsatir; bosluk > 0; bosluk--) {
                System.out.print(" ");
            }
            for (int yildiz = 0; yildiz < bulsatir * 2 - 1; yildiz++) {
                if (yildiz == 1 || yildiz == bulsatir * 2 - 1 || bulsatir == satir/ 2 + 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }

            System.out.println();


            // e harfi odev


        }

    }
}