package BenTest2.X;

class X implements Runnable {
    public static void main(String[] args) {
        X run = new X();
        Thread t = new Thread(run);
        t.start();
    }
}
