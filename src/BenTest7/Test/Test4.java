package BenTest7.Test;

class Test4 {
    class Pine extends Test4 {}
    class Oak extends Test4 {}
    public class Forest1 {
        public static void main (String args[]){
            Test4 tree = new Pine();
            if (tree instanceof Pine)
            System.out.println("Pine");
        else if (tree instanceof Test4)
            System.out.println("Tree");
        else if (tree instanceof Oak)
            System.out.println("Oak");
        else
            System.out.println("Oops ");
        }
    }
}
