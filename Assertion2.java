import java.time.LocalTime;

public class Assertion2 {
    void getTime() {
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);
    }

    public static void main(String[] args) {
        Assertion2 assertion2 = new Assertion2();
        assertion2.getTime();
        System.out.println("Hello jii");
    }
}
