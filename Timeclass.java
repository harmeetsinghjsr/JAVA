import java.time.*;
import java.time.format.*;
class Timeclass {
    void time()
    {
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);
    }
    void date()
    {
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);
    }
    void datetime()
    {
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + datetime);
    }
    void datetimeformatter()
    {
        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = datetime.format(f);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
    public static void main(String[] args) {
        Timeclass obj = new Timeclass();
        obj.time();
        obj.date();
        obj.datetime();
        obj.datetimeformatter();
    }
}










// In the above code, we have created a class Timeclass with three methods time(), date(), and datetime(). 
// These methods are used to get the current time, date, and date-time respectively.
// To get the current system's timezone, we have used the LocalTime, LocalDate, and LocalDateTime classes of the java.time package.
// To get the current time in a specific timezone, we can use the ZonedDateTime class of the java.time package.import java.util.Scanner;import java.util.Scanner;
// To get the current timezone use ZoneId.systemDefault() method.