package BenTest4.A;

public class m {
    public static void main (String args[]){
        public Object m(){
        Object o = new Float(3.14F);
        Object [] oa = new Object[1];
        oa[0] = o;
        o = null;
        oa[0] = null;
        return o;
        }
    }
}
