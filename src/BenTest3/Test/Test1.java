package BenTest3.Test;

public class Test1 {
    private Demo d;
    void start(){
        d = new Demo();
        this.takeDemo(d);
    }
    void takeDemo (Demo demo){
        demo = null;
        demo = new Demo();
    }
}
