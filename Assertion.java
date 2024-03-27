import java.util.Scanner;

public class Assertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int value = sc.nextInt();
        assert value >= 10 : "Age must be 10 or older";
        System.out.println("Value is " + value);
    }
}


