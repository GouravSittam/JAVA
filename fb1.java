// package Strings;
import java.util.*;

class A2 {
    static int X = 10;
    int y = 10;
    public int z = 30;

    class B {
        void get() {
            System.out.println("X: " + X);
            System.out.println("Y: " + y);
            System.out.println("Z: " + z);
        }
    }
}

public class fb1 {
    public static void main(String[] args) {
        A2 obj = new A2();
        A2.B obj1 = obj.new B();
        obj1.get();

        class D {
            int a = 12;
            int b = 10;

            void show() {
                System.out.println("this is a: " + a);
                System.out.println("this is b: " + b);
            }
        }

        D obj3 = new D();
        obj3.show();
    }
}
