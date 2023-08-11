import java.util.*;

class Aman<box> {
    int default_cap =10;
    private box[] arr;
    int top;
    int size;

    Aman() {
        arr = (box[]) new Object[default_cap];
    }

    Aman(int cap) {
        this.default_cap = cap;
        arr = (box[]) new Object[default_cap];
        this.size = 0;
        this.top = 0;
    }

        public void print() {
        for (box i : arr) {
            if (i != null)
                System.out.print(i + " ");
        }
        System.out.println();
    }

        public box[] inc_size() {
        System.out.println("size is exceeded , so we are doubling the array - ");
        box[] newArr = (box[]) new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        return newArr;
    }
        public void push(box element){
        if(top == arr.length){
           inc_size();
            System.out.println("we are increase array size - ");
        }
        arr[top] = element;
        size++;
        top++;
        }

        public box pop(){
            Integer x = -1;
            box res =(box) x;
            if(top == 0){
                System.out.println("Array is Empty - ");
                return res;
            }
            res = arr[top-1];
            arr[top-1] = null;
            top--;
            size--;
            System.out.println("poped element is - "+res);
            return  res;
        }

        public int peek(){
             if(top == 0){
                System.out.println("Array is Empty - ");
                return -1;
            }
            box ret = arr[top-1];
            top++;
            size++;
            System.out.println("peeked element is - "+ret);
            return (int)ret;
        }
        public boolean isEmpty(){
            return (top==0)?true:false;
        }

        public int size(){
            return size;
        }
        
    }  

public class tution_ArrayList {
    public static void main(String[] args) {
        Aman<Integer> st = new Aman<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.print();

        st.pop();
        st.print();

        st.peek();
        st.print(); 
        
        st.isEmpty();
        st.print();

        st.size();
        st.print();
    }
    
}
