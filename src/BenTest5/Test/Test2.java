package BenTest5.Test;

public class Test2 {
    public static void main (String args[]){
        Test2 p = new Test2();
        p.start();
    }
    void start(){
        boolean b1 = false;
        boolean b2 = fix(b1);
        System.out.println(b1 + " " + b2);
    }
    boolean fix(boolean b1){
        b1 = true;
        return b1;
    }
}
