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