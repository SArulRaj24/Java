import java.util.*;
public class max_subarray {
    public static void main(String[] args) {
        int[] arr={2,5,1,1,10};
        int k=14;
        int l=0,r=0;
        int sum=0,maxlen=0;
        while(r<arr.length){
            sum+=arr[r];
            while(sum>k){
                sum-=arr[l];
                l++;
            }
            
                maxlen=Math.max(maxlen,r-l+1);
                r++;
            
        }
        System.out.println(maxlen);
    }
}
