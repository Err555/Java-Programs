package Foo;

public class Foo {
    class Bar {}
}
class Test {
    public static void main (String [] args){
        Foo f = new Foo();
        Foo.Bar b = f.new Bar();
    }
}
