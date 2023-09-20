package Stack;
import java.util.Stack;
public class postfix_evalution{
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)(ch);
            //Number
            if(ascii >= 48 && ascii <= 57){
                int t = ascii-48;
                st.push(t);
            }
            else{
                if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                    int v2 = st.pop();
                    int v1 = st.pop();
                    if(ch == '+') st.push(v1+v2);
                    else if(ch == '-') st.push(v1-v2);
                    else if(ch == '*') st.push(v1*v2);
                    else if(ch == '/') st.push(v1/v2);
                }
            }
        }
        System.out.println(st.peek());
    }
}