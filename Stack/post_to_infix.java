package Stack;

import java.util.Stack;
public class post_to_infix{
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)(ch);
            //Number
            if(ascii >= 48 && ascii <= 57){
                int t = ascii-48;
                st.push(ch+"");
            }
            else{
                String v2 = st.pop();
                String v1 = st.pop();
                char op = ch;
                String ans = "(" + v1 + op + v2 +")"; 
                st.push(ans);
            }
        }
        System.out.println(st.peek());
    }
}