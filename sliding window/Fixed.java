public class Fixed {
//fixed window size

    public static void main(String[] args) {
        int[] arr={3,4,6,5,10,1};
        int k=3;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxSum=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            maxSum=Math.max(sum,maxSum);
        }

        System.out.println(maxSum);
    }
}
