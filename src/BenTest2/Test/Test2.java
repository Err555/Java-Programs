package BenTest2.Test;

public class Test2 {
    public static void aMethod() throws Exception
    {
    try
    {
        throw new Exception();
    }
    finally
    {
        System.out.print("finally ");
    }
}
public static void main(String args[]){
    try{
        aMethod();
    }
    catch (Exception e){
        System.out.print("exception ");
    }
    System.out.println("finished");
}
}