package BenTest2.BoolArray;

public class BoolTest {
    public static void main(String[] args) {
        Boolean b1 = new Boolean("false");
        bolean b2;
        b2 = b1.booleanValue();
        if (!b2){
            b2 = true;
            System.out.print("x ");
        }
        if (b1 & b2){
            System.out.print("y ");
        }
        System.out.println("z");
    }
}
