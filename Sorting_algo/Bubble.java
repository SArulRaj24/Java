package Sorting_algo;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr={5,46,14,17,16,24,14};

        bubble_sort(arr);
        System.out.print(Arrays.toString(arr));
    }

        static void bubble_sort(int[] arr){
            int n=arr.length;
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
}
