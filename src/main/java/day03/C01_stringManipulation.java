package day03;

public class C01_stringManipulation {
    public static void main(String[] args) {


        // bir stringde benzersiz( tekrarsiz ) karakterler yazdirmak icin kod yaziniz

        String str = "class ismini atarmisiniz hocam";

        String bosStr = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {

                bosStr += str.charAt(i);

            }
        }


              System.out.println("sonuc:"+bosStr);
    }

}