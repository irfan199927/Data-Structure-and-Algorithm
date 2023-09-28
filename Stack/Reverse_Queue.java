import java.util.*;
import java.util.Queue;
class Main{
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> q3 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);

        //reverseing Queue
        int initialSize  = q1.size();

        while(q2.size() != initialSize){

            while(q2.size() != 0){
                q3.add(q2.remove());
            }
            q2.add(q1.remove());

            while(q3.size() != 0){
                q2.add(q3.remove());
            }
        }
        while(q2.size() > 0){
            System.out.println(q2.remove());
        } 
    }
}