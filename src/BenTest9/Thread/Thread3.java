package BenTest9.Thread;

public class Thread3 implements Runnable {
    private int x;
    private int y;

    public static void main(String args []){
        Thread3 that = new Thread3();
        (new Thread(that)).start();
        (new Thread(that)).start();
    }
    public synchronized void run(){
        for(int i = 0; i < 10; i++){
            x++;
            y++;
            System.out.println("x = " + x + ", y = " + y);
        }
    }
}
