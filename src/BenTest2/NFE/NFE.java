package BenTest2.NFE;

public class NFE {
    public static void main(String[] args) {
        String s = "42";
        try
        {
            s = s.concat(".5");
            double d = Double.parseDouble(s);
            s = Double.toString(d);
            int x = (int) Math.ceil(Double.valueOf(s));
            System.out.println(x);
    }
    catch (NumberFormatException e){
        System.out.println("bad number");
    }
}
}