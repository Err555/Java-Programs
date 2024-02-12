package BenTest6.ObjComp;

public class ObjComp2 {
    public static void main (String args []){
        int i = 1, j = 10;
        do
        {
            if (i++ > --j)
            {
                continue;
            }
        }
        while (i < 5);
        System.out.println("i = " + i + " and j = " +j);
    }
}
