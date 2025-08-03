import java.util.*;
public class slider_window {
    public static void main(String[] args) {
        int arr[]={-1,2,3,3,4,5,-1};
        int k=4;
        int left=0,right=k-1;
        int sum=0;

        //initial window
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxsum=sum;

        //sliding window

        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            maxsum=Math.max(sum,maxsum);
        }
        System.out.println(maxsum);
    }

}
