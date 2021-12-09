package JavaTraining;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.util.Date;
import java.util.Scanner;

public class VerifyingDate {

public static void main(String[] args) {
LocalDate localClockRef= LocalDate.now(Clock.systemUTC());// todays date
LocalDate localClockRef1= LocalDate.of(2021,12,19);// future date

if(localClockRef1.isAfter(localClockRef))
{
    System.out.println(localClockRef1+ " is in future :");
}
else if (localClockRef1.isEqual(localClockRef)){
	System.out.println(localClockRef1+"is in today");
}
else
{
System.out.println( localClockRef1+" is in past: ");
}
}
}
