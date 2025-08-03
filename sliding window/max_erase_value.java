import java.util.*;

public class max_erase_value {
    public static void main(String[] args) {
        int[] arr={5,2,1,2,5,2,1,2,5};
        int i=0,j=0;
        int currsum=0;
        int totalsum=0;
        Set<Integer> set=new HashSet<>();
        while(i<arr.length){

            if(!set.contains(arr[i])){
                set.add(arr[i]);
                currsum+=arr[i];
                totalsum=Math.max(totalsum, currsum);
                i++;
            }
            else{
                set.remove(arr[j]);
                currsum-=arr[j];
                j++;
            }


        }
        System.out.println(totalsum);
    }
}
