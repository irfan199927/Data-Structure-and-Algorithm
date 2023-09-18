import java.util.*;
public class Reverse_Stack{
    
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Minecraft");
        stack.push("Skyrum");
        stack.push("Fortnite");
        stack.push("Valorent");
        stack.push("Apex Legend");

        String ans = stack.pop();
        System.out.println(stack);
        System.out.println(ans);
        System.out.println(stack.peek());
        System.out.println(stack.search("Valorent"));
    }
}