import java.io.FileOutputStream;
public class resourcess{
    public static void main(String[] args){
        try(FileOutputStream fileOutputStream=new FileOutputStream("tc.txt")){
            String msg="Hello LPU";
            byte byteArray[]=msg.getBytes();
            fileOutputStream.write(byteArray);
            System.out.println("message written in the file successfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}



package assertion;

public class Student {
    int rno;
    String name;
    int total_marks;

    Student(int rno, String name, int total_marks) {
        this.rno = rno;
        this.name = name;
        this.total_marks = total_marks;
    }

    public String toString() {
        return rno + " " + name + " " + total_marks;
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Akshay Shukla", 456);
        System.out.println(s1);
    }
}