package BenTest10.TreeSet;

class TreeSet2 {
    public int i = 0;
    public TreeSet2(String text){
        i = 1;
    }
}
class Sub extends TreeSet2{
    public Sub(String text){
        i = 2;
    }
    public static void main (String args []){
        Sub sub = new Sub("Hello");
        System.out.println(sub.i);
    }
}
