package BenTest8.TestObj;

public class TestObj1 {
    public static void main(String[] args) {
        Object o = new Object(){
            public boolean equals(Object obj){
                return true;
            }
        }
        System.out.println(o.equals("Fred"));
    }
}
