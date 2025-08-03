import java.util.*;
class bitwise_and{
    public static void main(String[] args){
        int[] arr={1,3,8,48,10};
        int n=arr.length;
        int left=0;
        int right=0;

        int cur=0;
        int res=1;
        while(right<n){
            while((cur & arr[right])==0){
                cur=cur ^ arr[left];
                left++;
                res=Math.max(res,right-left+1);
                cur=cur|arr[right];
            }
        }
        System.out.println(res);
    }
}