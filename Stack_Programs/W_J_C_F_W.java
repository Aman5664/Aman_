import java.util.*;
public class W_J_C_F_W {     // with java collection frame work
    public static void main(String[] args) { 
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
    
}
