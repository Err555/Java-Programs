package BenTest2.Test;

public class Test1 {

    public static void main(String[] args) {
        Float f = new Float("12");
        switch (f)
        {
            case 12: System.out.println("Twelve");
            case 0: System.out.println("Zero");
            default: System.out.println("Default");
        }
    }
}
