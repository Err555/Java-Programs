package BenTest9.Thread;

public class Thread4 implements Runnable {
    private int x;
    private int y;

    public static void main (String args []){
        Thread4 that = new Thread4();
        (new Thread(that)).start();
        (new Thread(that)).start();
    }
    public synchronized void run(){
        for (;;){
            x++;
            y++;
            System.out.println("x = " + x + "y = " + y);
        }
    }
}
