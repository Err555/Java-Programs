package BenTest8.TestObj;

public class TestObj2 {
    private int count = 1;
    public synchronized void doSomething(){
        for (int i = 0; i < 10; i++)
        System.out.println(count++);
    }
    public static void main(String args []){
        TestObj2 demo =new TestObj2();
        Thread a1 = new A (demo);
        Thread a2 = new A (demo);
        a1.start();
        a2.start();
    }
}
class A extends Thread{
    TestObj2 demo;
    public A (TestObj2 td){
        demo =td;
    }
    public void run(){
        demo.doSomething();
    }
}
