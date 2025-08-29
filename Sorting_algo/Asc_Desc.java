// package Sorting_algo;
import java.util.Arrays;

public class Asc_Desc {
    public static void main(String[] args) {
        int[] arr={5,3,1,234,32,31,8};
        int k=3;
        //sort first 3 in ascending then remaining are descending
        bubble(arr,0,k,true);
        bubble(arr, k, arr.length, false);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr,int s,int e,boolean flag){
        for(int i=s;i<e;i++){
            for(int j=s;j<e-i-1;j++){
                //ascending
                if(arr[j]>arr[j+1] && flag){
                    int temp=arr[j];
                     arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                //decending
                if(arr[j]<arr[j+1] && !flag){
                    int temp=arr[j];
                     arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
            }
        }
    }
}
