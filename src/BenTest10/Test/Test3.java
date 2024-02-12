package BenTest10.Test;
import java.util.Vector;
private class MyVector extends Vector{
    int i = 1;
    public MyVector(){
        i = 2;
    }
}
public class Test3 extends MyVector {
    public Test3()
    {
        i = 4;
    }
    public static void main (String args[]){
        MyVector v = new Test3();
    }
}
