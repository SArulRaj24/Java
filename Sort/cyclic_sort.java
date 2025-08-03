package Sort;
import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int current=arr[i]-1;
            if(arr[i]!=arr[current]){
                // swap(arr,i,current);
                int temp=arr[i];
                arr[i]=arr[current];
                arr[current]=temp;
            }
            else{
                i++;
            }
        }
        

    }

    // static void swap(int[] arr, int first, int sec) {
    //     int temp=arr[first];
    //     arr[first]=arr[sec];
    //     arr[sec]=temp;
    // }

}