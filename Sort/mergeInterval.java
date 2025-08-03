
// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]

package Sort;

import java.util.*;

public class mergeInterval {
    public static void main(String[] args) {
        int[][] arr = { {1,3}, {2,6}, {8,10}, {15,18} };

        Arrays.sort(arr,(a,b)->a[0]-b[0]);

        List<int[]> ls=new ArrayList<>();
        int[] prev=arr[0]; //{1,3}
        ls.add(prev);

        for(int i=1;i<arr.length;i++){

            int currentStart=prev[0]; //1  {1,3}
            int currentEnd=prev[1]; //3

            int nextStart=arr[i][0];
            int nextEnd=arr[i][1];
            if(currentEnd>=nextStart){
                prev[1]=Math.max(currentEnd,nextEnd);
            }
            else{
                prev=arr[i];
                ls.add(prev);
            }


        }
        int[][] merged=ls.toArray(new int[ls.size()][]);
        System.out.println(Arrays.deepToString(merged));
    }

}
