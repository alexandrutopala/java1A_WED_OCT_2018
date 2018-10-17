import p1.pp1.A;
import p1.*;
import static p1.A.y;
import java.lang.*;

public class Exemplu3 {
    public static void main(String [] args) {
        p1.A a = new p1.A();
        a.x = 5;
        System.out.println(a.x);
        
        A a1 = new A();
        a1.z = 4;
        
        y = 7;
        System.out.println(y);
    }
}