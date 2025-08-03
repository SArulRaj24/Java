package Sort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//leetcode 448
class missing_num{
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        sort(arr);
        // System.out.println(Arrays.toString(arr));

        List<Integer> ls=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=i+1){
                ls.add(i+1);
            }
        }
        System.out.println(ls);
    }

    private static void sort(int[] arr) {
       int i=0;
       while(i<arr.length){
        int curr=arr[i]-1;
        if(arr[i]!=arr[curr]){
            int temp=arr[i];
            arr[i]=arr[curr];
            arr[curr]=temp;
        }
        else{
            i++;
        }
       }

    }

}