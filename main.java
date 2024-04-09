public class main {
    public static void main(String[] args) {
        // create a box for string type
        Box<String> stringBox = new Box<>();
        stringBox.setObject("Hello, world!");
        String str = stringBox.getObject();
        System.out.println("String box value: " + str);

        // create a box for integer type
        Box<Integer> integerBox = new Box<>();
    }
}

class Box<T> {
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}