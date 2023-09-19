package Stack;
import java.util.Stack;
public class Postfix {
    public static void main(String[] args) {

        String str = "9-(5+3)*4/6";
        System.out.println(str);
		Stack<String> val = new Stack<>();
		Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)(ch);
            if(ascii >= 48 && ascii <= 57){
                String ans = "" + ch;
                val.push(ans);
            }
            else if(op.empty() || ch == '(' || op.peek() == '(') 
                op.push(ch);
            
            else if(ch == ')'){
                while(op.peek() != '('){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char o = op.pop();
                    String t = val1+val2+o;
                    val.push(t);
                }
                op.pop(); // opening bracket Pop;
            }
            else{
                if(ch == '+' || ch == '-'){
                    //work
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char o = op.pop();
                    val.push(val1+val2+o);
                    op.push(ch);
                }
                if(op.peek() =='*' || op.peek() == '/'){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char o = op.pop();
                    val.push(val1+val2+o);
                    op.push(ch);
                }
                else op.push(ch); // this is to push Multiplication or Divison 
            }
        }
        while(val.size()>1){
            String val2 = val.pop();
            String val1 = val.pop();
            char o = op.pop();
            val.push(val1+val2+o);
        }
        System.out.println(val.peek());
    }
}
