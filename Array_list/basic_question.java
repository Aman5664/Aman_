package Array_list;

import java.util.*;

public class basic_question {

    public static void main(String[] args) {
        List<Integer> ar_list2 = new ArrayList<>();
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

        // Integer ob = 64;         
        // ar_list.remove(new Integer(64)); //boject remove
      
        // ar_list2.add(33);
        // ar_list2.add(44);
        // ar_list2.add(55);
        // ar_list2.add(66);
        // ar_list.addAll(ar_list2);

        // ar_list.remove(4); //index remove
        // System.out.println(ar_list);

        // ar_list.retainAll(Collections.singleton(23));
        // System.out.println(ar_list+" ");

      //        ar_list.trimToSize();          

    //    Integer []ar = new Integer[]{120,340,630}; // not work
    //    List rem = Arrays.asList(ar);

    // ar_list.add(0, 10);

    // Integer []ar = new Integer[]{120,340,630}; 
    // ar_list.addAll(Arrays.asList(ar));

    // LinkedList<Integer> ll = new LinkedList<>();
    
    //    ar_list.removeIf(dinesh -> (dinesh%2==0 )); // remove all even numbers

        //  ar_list.replaceAll(e->(e%2==0)?e/2:e); //as a if else condition

    //    ar_list.clear(); not work

    //    System.out.println(ar_list.isEmpty());

    //    System.out.println(ar_list.hashCode()); // not understand

        // Collections.sort(ar_list,Collections.reverseOrder()); //

        // Collections.sort(ar_list);
            
//        ListIterator<Integer> itr1 = ar_list.listIterator();
//        while(itr1.hasNext())
//              System.out.print(itr1.next()+" ");
        
        // for(int i : ar_list)
        // System.out.print(i+" ");
        // System.out.println();
        // System.out.println("Size of the array - " + ar_list.size());


    //    for (int i = 0; i < ar_list.size(); i++) { //for loop for print 
    //        System.out.print(ar_list.get(i)+" ");
    //    }

//        for(int i : ar_list)   //for-Each loop for print 
//            System.out.print(i+" ");

//        ar_list.forEach( // konsa loop h yo
//                ele -> {
//                    System.out.print(ele + " ");
//                });


    
    }
}
        