package Date_Time;

import java.time.*;
public class Example {
 public static void main(String[] args) {
    LocalDate currDate=LocalDate.now();
    System.out.println(currDate);

    LocalTime currTime=LocalTime.now();
    System.out.println(currTime);

    LocalDateTime a=LocalDateTime.now();
    System.out.println(a);

    System.out.println(LocalDate.of(2005,Month.JULY, 15));


 }   
}
