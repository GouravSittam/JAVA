import java.time.*;

public class Assertion3 {

    void getTime() {
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);
    }

    void getDate() {
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);
    }

    void getDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);
    }

    public static void main(String[] args) {
        Assertion3 a = new Assertion3(); 
        a.getTime();
        a.getDate();
        a.getDateTime();
    }
}
