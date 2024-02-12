package BenTest2.Thread;

public class MyThread extends Thread {
    public static void main(String [] args){
        MyThread t = new MyThread();
        t.start();
        System.out.print("one. ");
        t.start();
        System.out.println("two. ");
    }
    public void run(){
        System.out.println("Thread ");
    }
}
