class A{
    final double balance = 500;
    void display(){
        System.out.println("from the class A");
    }
}

public class finalType extends A {
    void display(){
        System.out.println("from class FirstProgram");
    }

    public static void main(String[] args){
        finalType r = new finalType();
        System.out.println("Balance: "+ r.balance);
        r.display(); 
    }
}