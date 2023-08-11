import java.util.*;
public class Puch_At_Bottom {

    public static void puchBottom(int data, Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top =  s.pop();
        puchBottom(data, s);
        s.push(top);
        
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        // int top = s.pop();  top value saves the removed value
        // System.out.println(top);

        puchBottom(99, s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
       
    }
}
