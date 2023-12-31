import java.util.*;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}

public class linkedlist {
    
    public static Node head;

    public static boolean isEmpty(){
        return head == null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()) head = newNode;
        
        newNode.next = head;
        head = newNode;
    } 
    public int pop(){
        if(isEmpty()) return -1;

        int top = head.data;
        head = head.next;
        return top; 
    }
    public int peek(){
        if(isEmpty()) return -1;

         return head.data;
    }
    
        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);
            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
            
        }
}
