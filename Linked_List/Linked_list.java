class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add First
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add Last

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Delete First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            secondLast = secondLast.next;
            last = last.next;
        }
        secondLast.next = null;
    }

    // Print LL
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");

    }
    // Print Size;

    public int getSize() {
        return size;
    }

    // public void reverseIterate() {
    // if (head == null) {
    // return;
    // }
    // Node prevNode = head;
    // Node currNode = head.next;

    // while (currNode != null) {
    // Node nextNode = currNode.next;
    // currNode.next = prevNode;

    // // Update
    // prevNode = currNode;
    // currNode = nextNode;
    // }
    // head.next = null;
    // head = prevNode;
    // }

    public void reverse() {
        Node pre = null;
        Node curr = head;

        while(curr != null){
            Node nextNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextNode;
        }
        head = pre;
    }

    // Recc LL
    public Node reverseRecusive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecusive(head.next);
        head.next.next = head;
        head.next = null;   
        // Node nextnode = head.next;
        // nextnode.next = head;
        return newHead;

    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");

        // list.printList();
        // list.deleteLast();

        list.printList();

        // System.out.println(list.getSize());
        // list.reverseIterate();
        // list.head = list.reverseRecusive(list.head);
        list.head = list.reverseRecusive(list.head);
        list.printList();

    }
}