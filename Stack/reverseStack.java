package Stack;
import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String A = "Irfan";
        for(int i=0; i<A.length(); i++){
            char ch = A.charAt(i);
            st.push(ch);
        }
        String ans = "1";
        while(!st.isEmpty()){
            char ch = st.peek();
            ans+=ch;
            st.pop();
        }
        System.out.println(ans);
    }
}
