package BenTest3.Foo;

public class Foo {
    Foo(){
        System.out.print("foo");
    }
    class Bar{
        Bar(){
            System.out.print("bar");
        }
        public void go(){
            System.out.print("hi");
        }
    }
    public static void main (String args []){
        Foo f = new Foo();
        f.makeBar();
    }
    void makeBar(){
        (new Bar() {}).go();
    }
}
