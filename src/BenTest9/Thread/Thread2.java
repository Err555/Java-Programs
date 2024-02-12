package BenTest9.Thread;

public class Thread2 extends Thread {
    public void run(){
        System.out.println("In run");
        yield();
        System.out.println("Leaving run");
    }
    public static void main (String argv []){
        (new Thread2()).start();
    }
}
