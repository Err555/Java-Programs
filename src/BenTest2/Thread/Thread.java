package BenTest2.Thread;

public class Thread {
  class X implements Thread{
    public static void main (String args[]){
        X run = new X();
        Thread t = new Thread(run);
    }
  }  
}
