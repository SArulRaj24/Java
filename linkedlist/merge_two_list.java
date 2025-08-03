package linkedlist;
import java.util.*;

//brute force
// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]

//input sorted input
//add all the elements in list then sort create a new list then add the elements from list to linkedlist

public class merge_two_list {
    
    public static void main(String[] args) {
        List<Integer> l1=new LinkedList<>();
        List<Integer> l2=new LinkedList<>();

        // List<Integer> merged=new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(4);

        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(5);

        // int i=0;
        // while( i<l1.size()){
        //     merged.add(l1.get(i));
        //     i++;
        // }

        // int k=0;
        // while(k<l2.size()){
        //     merged.add(l2.get(k));
        //     k++;
        // }

        // Collections.sort(merged);
        // System.out.print(merged.toString());//merged Arraylist
        // System.out.println();

        // // LinkedList 
        // List<Integer> dummy=new LinkedList<>();


        // for(int l=0;l<merged.size();l++){
        //     dummy.add(merged.get(l));
        // }

        // //linkedList
        // System.out.println("dummy is LinkedList: " + (dummy instanceof LinkedList));
        // System.out.print(dummy.toString());


// _________________________________________________________________________________
        //iterative approach


        List<Integer> ls=new LinkedList<>();
        int i=0,j=0;
        while(i<l1.size() && j<l2.size()){
            if(l1.get(i)<=l2.get(j)){
                ls.add(l1.get(i));
                i++;
            }
            else{
                ls.add(l2.get(j));
                j++;
            }
        }

        while(i<l1.size()){
            ls.add(l1.get(i));
            i++;
        }
        while(j<l2.size()){
            ls.add(l2.get(j));
            j++;
        }

        //Linkedlist
        System.out.println("dummy is LinkedList: " + (ls instanceof LinkedList));
        System.out.print(ls);

    }
}
