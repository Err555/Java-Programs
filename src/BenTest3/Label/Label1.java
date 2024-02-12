package BenTest3.Label;

public class Label1 {
    public static void main(String args[]) {
        int I = 0;
        label:
        if (I < 2){
            System.out.print("I is " + I);
            I++;
            continue label;
        }
    }
}
