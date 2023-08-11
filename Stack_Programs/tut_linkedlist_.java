import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int d) {
        this.data = d;
        this.next = null;
    }
}
class Mystack {
    Node top;
    int size = 0;

    Mystack() {
        this.top = null;
    }

    public void print() {
        Node temp = top;
        while (temp != null) {
            System.out.print("  " + temp.data);
            temp = temp.next;
        }

        System.out.println();
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
        size++;

    }
    public int pop() {
        if (top == null)
            return -1;

        int r = top.data;
        top = top.next;
        return r;
    }

    public int peek() {
        return (top == null) ? -1 : top.data;
    }
}

public class tut_linkedlist_ {
    public static void main(String[] args) {
        Mystack st = new Mystack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.print();
        // System.out.println("poped element is - "+st.pop());
        System.out.println("size is - "+st.size);

        st.print();
        System.out.println("peeked element is - "+st.peek());
        st.print();

    }

}
