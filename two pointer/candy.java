import java.util.*;
class candy{
    public static void main(String[] args) {
        int[] arr={5,8,6};
        int k=3;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        if(sum<k){
            System.out.println("No possiblity");
        }

        // binary search
        // System.out.println(sum/k);
        int left=1,right=sum/k;
        int result=0;
        int mid;
        while(left<=right){
             mid=(left+right)/2;
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=mid){
                    count+=arr[i]/mid;
                }
                if(count>=k){
                    break;
                }

            }
            if(count>=k){
                result=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println(result);

    }
}