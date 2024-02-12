package BenTest4.Exception;

public class Exception {
    public static void main (String args[]){
        System.out.print("Start ");
        try{
            System.out.print("Hello world");
            throw new FileNotFoundException();
        }
        System.out.print(" Catch Here ");
        catch(EOFException e){
            System.out.print("End of file exception");
        }
        catch(FileNotFoundException e){
            System.out.print("File not found");
        }
    }
}
