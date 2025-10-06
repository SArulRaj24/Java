import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

import java.util.Queue;
public class MaxHeap {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>((a,b)->b-a); //custom sort decending 
        //  Queue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder);//using collection reverse
        queue.add(4);
        queue.add(46);
        queue.add(43);
        queue.add(32);
        queue.add(14);
        queue.add(17);

        //first element is maximum remaining order is not guranted
        System.out.println(queue);

        // while polling it retrives the max value each time
        while (!queue.isEmpty()) {
            System.out.print(queue.poll()+" ");
        }



    }
}
