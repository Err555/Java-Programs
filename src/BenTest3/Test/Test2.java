package BenTest3.Test;

import BenTest2.A.Test;

class Bar { }
class Test2 {
    Bar doBar(){
        Bar b = new Bar();
        return b;
    }
    public static void main (String args[]){
        Test t = new Test();
        Bar newBar = t.doBar();
        System.out.println("newBar");
        newBar = new Bar();
        System.out.println("finishing");
    }
}
