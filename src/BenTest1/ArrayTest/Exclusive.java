package BenTest1.ArrayTest;

public class Exclusive {
    public int aMethod(){
        static int i = 0;
        i++;
        return i;
    }
    public static void main(String args []){
        Exclusive test = new Exclusive();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}
