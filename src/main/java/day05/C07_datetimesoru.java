package day05;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C07_datetimesoru {

    public static void main(String[] args) {

        //soru 2)
        //-suanin saatini dakikasini ve saniyesini bize dondurun
        //-suanin saniyesini bize dondurun
        // -10000 saniye sonrasini bize dondurun
        //-200 dakika onceki saati bize dondurun
        //-bize saati 3 yapip yazdirin(dakika ve saniye degismeden)


        LocalTime now =LocalTime.now();
        System.out.println("currents time:"+ now);//currents time:19:17:02.746444800
        int seconds =now.getSecond();
        System.out.println("currents:"+ seconds);//2

        LocalTime later =now.plusSeconds(1000);
        System.out.println("Time 10000 seconds later: "+later);//Time 10000 seconds later: 19:39:57.081561600


       LocalTime earlier =now.minusMinutes(200);
        System.out.println("Time 200 minutes earlier: " + earlier);//Time 200 minutes earlier: 16:03:17.081561600

        LocalTime adjustedTime =now.withHour(3);
        System.out.println("Time with hour set to 3: " + adjustedTime);//Time with hour set to 3: 03:23:17.081561600



        // odev  ;bize bugunun tarihini ve su anki saati donduru.
        // Tarih ve saati formatlamak için bir formatter kullanıyoruz

        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");



     String formattedNow =now.format(formatter);
        System.out.println("Current Date and Time: " + formattedNow);
    }
}
