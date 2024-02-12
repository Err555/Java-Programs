package BenTest5.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
    TreeSet1 map = new TreeSet1();
    map.add("one");
    map.add("two");
    map.add("three");
    map.add("four");
    map.add("one");
    Iterator it = map.iterator();
    while (it.hasNext())
    {
        System.out.print(it.next() + " ");
    }    
    }
    
}
