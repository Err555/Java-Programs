package BenTest2.A;

public class Exclusive {
    public static void main(String[] args) {
        int x = 100;
        double y = 100.1;
        boolean b = (x = y);
        System.out.println(b);
    }
}
