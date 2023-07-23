package Array_list;
import java.util.*;

class myarraylist <box>{
    int default_capicity = 10;
    private box[] arr;
    int size = 0;
    int last = 0;

    myarraylist(){
        arr = (box[])new object[default_capicity];
    }

    myarraylist(int capicity){
        this.default_capicity = capicity;
        arr = (box[])new
        object[default_capicity];
    }

    public void print(){
        for(box i : arr){
            if(i != null)
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public void add(box element){
        if(last == arr.length){
            System.out.println("Size Exceeded... So we are doubling your array -");
            box[] newArr = (box[]) new object[arr.length*2];
            for(int i=0;i<arr.length;i++)
            newArr[i] = arr[i];

            arr = newArr;
        }
        arr[last] = element;
        last++;
        size++;

    }
}
public class generic_ {
    public static void main(String[] args) {
myarraylist<Integer> ar_list = new myarraylist<>();
    ar_list.add(10);
    ar_list.add(20);
    ar_list.add(30);
    ar_list.add(40);
    ar_list.add(50);
    ar_list.add(60);
    ar_list.add(70);
    ar_list.add(80);
    ar_list.add(90);
    ar_list.add(100);
    ar_list.add(110);
    ar_list.add(120);
    
    ar_list.print();
    System.out.println("size - "+ar_list.size);

    }
    
}