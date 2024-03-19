class A {

    static int x = 10;
    int y = 20;
    private static int z = 30;

    static class B {
        void get() {
            System.out.print( "X :" + x);
            System.out.print("Z :" + z);
        }
    }
}

    public class fb { 
        public static void main (String[] args) { 
            A.B obj = new A.B(); 
            obj.get();
        }
    }