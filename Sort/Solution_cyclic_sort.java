package Sort;
import java.util.Arrays;

class Solution_cyclic_sort {
    public static void findDuplicate(int[] arr) {
       int i=0;
       while(i<arr.length){
        int corr=arr[i]-1;
            if(arr[corr]!=arr[i]){
                int temp=arr[corr];
                arr[corr]=arr[i];
                arr[i]=temp;
            }else{
                i++;
            }
       }
       System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        findDuplicate(arr);
    }
}