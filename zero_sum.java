
public class zero_sum{
    public static void main(String[] args) {
        
            int[] arr={-2,-3,5,9,6};
            for(int k=0;k<arr.length;k++){
                if(arr[k]==0){
                    System.out.println("true");
                    return;
                }
            }
        
            for(int i=0;i<arr.length;i++){
                int sum=0;
                for(int j=i;j<arr.length;j++){
                    sum+=arr[j];
                    if(sum==0){
                        System.out.println("true");
                        return;
                    }
                }
            }
            System.out.println("false");
    }
}
