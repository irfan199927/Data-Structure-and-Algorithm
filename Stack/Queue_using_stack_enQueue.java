import java.io.*;
import java.util.*;
import java.util.Stack;

class StackQueue
{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    void Push(int x)
    {
	   s1.push(x);
	  
    }
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   if(s1.size()==0) return -1;
        while(s1.size()>0){
            s2.push(s1.pop());
        }
        int topElement = s2.pop();
        while(s2.size()>0){
            s1.push(s2.pop());
        }
        return topElement;
    }
}
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);  
        StackQueue s = new StackQueue();	
        int q = sc.nextInt();
        ArrayList<Integer> ans= new ArrayList<>();
        while(q>0)
        {
            int QueryType = sc.nextInt();
            if(QueryType == 1)
            {
                int a = sc.nextInt();
                s.Push(a);
            }
            else if(QueryType == 2)
            ans.add(s.Pop());
        q--;
        }	
        for(int x:ans)
        System.out.print(x+" ");       
     System.out.println();
    }
}