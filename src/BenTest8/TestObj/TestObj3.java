package BenTest8.TestObj;

class A {
    public A(int x){}
    }
    class B extends A {}
    public class TestObj3 {
        public static void main(String[] args) {
            A a = new B();
            System.out.println("complete");
        }
}
