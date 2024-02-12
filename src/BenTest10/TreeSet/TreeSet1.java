package BenTest10.TreeSet;
import  java.util.*;
public class TreeSet1 extends TreeSet{
    public static void main(String[] args) {
        TreeSet1 t = new TreeSet1();
        t.count();
    }
}
protected class TreeSet{
    void count(){
        for (int x = 0; x < 7; x++, x++){
            System.out.print(" " + x);
        }
    }
}