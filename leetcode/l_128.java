import java.util.Arrays;
import java.util.Scanner;

public class l_128 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }  

        if(arr.length==0){
            System.out.println(0);
            return;
        }
        Arrays.sort(arr);
        
        int cnt=1,max=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                continue;
            }
            if(arr[i]+1==arr[i+1]){
                cnt++;
            }
            max=Math.max(max, cnt);

        }
        System.out.println(max);
    }
}
