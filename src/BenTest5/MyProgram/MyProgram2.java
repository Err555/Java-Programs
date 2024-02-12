package BenTest5.MyProgram;
import java.io.*;
public class MyProgram2 {
    public static void main (String args[]){
        FileOutputStream out = null;
        try{
            out = new FileOutputStream("test.txt");
            out.write(122);
        }
        catch(IOException io)
        {
        System.out.println("IO Error.");
    }
    finally
    {
        out.close();
    }
}
}
