package day05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C08_DateTimeFormatt {
    public static void main(String[] args) {
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("d-M-y");
        LocalDateTime tarih=LocalDateTime.now();
        System.out.println(dtf.format(tarih));
    }
}
