package linkedlist;
import java.util.*;
class linkedlist{
    static slnode sl=new slnode();
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(5);
        list.add(25);
        list.add(30);
        list.add(15);

        sl.display();
        // System.out.println("Original LinkedList: " + list);
    }
}