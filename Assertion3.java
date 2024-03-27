import java.time.*;
import java.time.format.DateTimeFormatter;
public class Assertion3 {

    void getTime(){
        LocalTime time=LocalTime.now();
        System.out.println(time);
    
    }
    void getDate(){
        LocalDate date=LocalDate.now();
        System.out.println(date);
    }
    void getDateTime(){
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);
    }
    void formatDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println(formattedDateTime);
    }
    void getMonth() {
        Month month = LocalDate.now().getMonth();
        System.out.println("Current month: " + month);
    }
    void getDayOfWeek() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        System.out.println("Current day of the week: " + dayOfWeek);
    }
    public static void main(String[] args) {
        Assertion3 a= new Assertion3();
        a.getTime();
        a.getDate();
        a.getDateTime();
        a.formatDateTime();
        a.getMonth();
        a.getDayOfWeek();
    }
}