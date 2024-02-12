package BenTest5.MyProgram;
import java.util.*;
public class MyProgram3 {
    public static void main(String[] args) {
        Object x = new Vector().elements();
        System.out.print((x instanceof Enumeration));
        System.out.print((x instanceof Iterator));
        System.out.print((x instanceof ListIterator));
    }
}
