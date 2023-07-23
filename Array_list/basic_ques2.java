package Array_list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class basic_ques2 {
    public static void main(String[] args) {
               ArrayList<Integer> ar_list = new ArrayList<>();
        
        ar_list.add(12);
        ar_list.add(32);
        ar_list.add(45);
        ar_list.add(34);
        ar_list.add(64);
        ar_list.add(78);
        ar_list.add(23);
        ar_list.add(63);
        ar_list.add(23);
        ar_list.add(63);
        ar_list.add(64);

        for(int i : ar_list)
            System.out.print(i+" ");
            System.out.println();
            

        // List<Integer> ar_list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        // System.out.println(ar_list2);
        
    //     System.out.print("after cloned ");
    //    ArrayList<Integer> ob = (ArrayList) ar_list.clone(); // make a dublicate copy

        //  ArrayList<Integer> ob = (ArrayList) ar_list.clone(); 
        // System.out.println("equals check - "+ar_list.equals(ob));

        // System.out.println("true or false -"+ar_list.contains(64));

        // System.out.println("index no = "+ar_list.indexOf(64));

        // System.out.println("index no = "+ar_list.lastIndexOf(64));

    //    ar_list.set(3,487);

//        for(int i : ar_list)
//            System.out.print(i+" ");
//        System.out.println("\n cloned array - ");

//        for(int i : ob)
//            System.out.print(i+" ");
//
      
    //    ar_list.stream().forEach(x -> System.out.print(x+",")); //repeat elements

    //    ar_list.stream().distinct().forEach(x -> System.out.print(x+",")); //repeated elements remove

    //    List<Integer> sub = ar_list.subList(2,7);
    //    for(Integer i : sub){
    //        System.out.print(i+" ");
    //    }

    //      Integer []ar_new = new Integer[ar_list.size()];
    //      ar_new = ar_list.toArray(ar_new);
    //    System.out.println("\n converted array is - \n ");
    //    for(int i=0;i<ar_new.length;i++)
    //        System.out.print(ar_new[i]+" ");

    //   ListIterator<Integer> itr1 = ar_list.listIterator(); //error generate
    //    while(itr1.hasNext())
    //          System.out.print(itr1.next()+" ");


    //    for (int i = 0; i < ar_list.size(); i++) {
    //        System.out.print(ar_list.get(i)+" ");
    //    }
    //    System.out.println();
    //         System.out.println("Size of the array - " + ar_list.size());
}
}