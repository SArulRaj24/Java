import java.util.PriorityQueue;
import java.util.Queue;

//min heap -> minimum value is always first and remaining values are not ordered  retrives from the heap mem
public class MinHeap {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
        queue.add(4);
        queue.add(46);
        queue.add(14);
        queue.add(17);
        queue.add(34);
        queue.add(43);

        System.out.println(queue); //[4, 17, 14, 46, 34, 43]

        //while polling it remains as ordered because it poll the lowest value every time

        System.out.println();
        while(!queue.isEmpty()){
            System.out.print(queue.poll()+" "); //4 14 17 34 43 46 
        }
        
    }


}
