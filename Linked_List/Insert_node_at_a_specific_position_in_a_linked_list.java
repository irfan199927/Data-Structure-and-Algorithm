// public class Insert_node_at_a_specific_position_in_a_linked_list {
    
// }
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
    static Node insert(Node head, int n, int pos, int val) {
        if(pos == 0){
            Node nextNode = new Node(val);
            nextNode.next = head;
            head = nextNode; 
        }        
        else if(pos==n){
           Node curr = head;
           for(int i=0; i<pos; i++){
            curr = curr.next;
           }
           curr.next = new Node(val);
        }
        else{
             Node curr = head;
            for(int i=0; i<pos-1; i++){
                curr = curr.next;
            }
            Node nextVal = curr.next;
            curr.next = new Node(val);
            curr.next.next = nextVal;
        }
        return head;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int val = sc.nextInt();
        int pos = sc.nextInt();
        Node head = Solution.insert(list.head, n, pos, val);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}