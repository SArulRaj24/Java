package linkedlist;

import java.util.LinkedList;

class list_struct{
    public static void main(String[] args) {
        LinkedList<Integer> ls=new LinkedList<>();
        int[] arr={9,43,2,2,3,4,3};
        for (int i : arr) {
            ls.add(i);
        }
        System.out.println(ls);
        ls.add(4, 34);
    }

}