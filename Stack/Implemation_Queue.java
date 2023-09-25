
import java.util.*;


class Queue {
    int []arr;
	int Front;
	int Rear;

    public Queue() {
        arr = new int[1000];
		Front = -1;
		Rear = -1;
    }

    public void push(int newElement) {
        
        if(Front == -1 && Rear == -1){
            Front++;
		    Rear++;
           arr[Front] = newElement;
        }
        else{
            Rear++;
            arr[Rear] = newElement;
        }
    }

    public int pop() {

        if(Front == -1 && Rear == -1){
            return -1;
        }
        int element = arr[Front];
        Front++;
        if(Front > Rear){
            Front = -1;
            Rear = -1;
        }
        return element;
    }
    public int front() {
        if(Front == -1 && Rear == -1){
            return -1;
        }
        return arr[Front];
    }
    public int size() {
        if(Front == -1 && Rear == -1){
            return 0;
        }
        return Rear - Front + 1;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int op = sc.nextInt();
            if(op == 1) {
                int x = sc.nextInt();
                q.push(x);
            }
            else if(op == 2) {
                System.out.println(q.pop());
            }
            else if(op == 3)
                System.out.println(q.front());
            else if(op == 4)
                System.out.println(q.size());
        }
    }
}