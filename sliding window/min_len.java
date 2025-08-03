public class min_len {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3}; //1 2 2 3 3 4
        int target=7;

        int r=0,l=0;
        int min_sum=0;
        int len=Integer.MAX_VALUE;
        for(r=0;r<arr.length;r++){
            min_sum+=arr[r];

            while(min_sum>=target){
                len=Math.min(len,r-l+1);
                min_sum-=arr[0];
                l++;
            }

        }
        System.out.println(len);
    }
}
