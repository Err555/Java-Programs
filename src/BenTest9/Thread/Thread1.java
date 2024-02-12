package BenTest9.Thread;

class Thread1 extends Thread {
    public static void main (String args []){
        Thread1 t = new Thread1();
        t.run();
    }
    public void run(){
        for(int i = 1; i < 3; ++i){
            System.out.print (i + "..");
        }
    }
}
