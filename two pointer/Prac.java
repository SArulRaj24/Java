import java.util.Arrays;

public class Prac {
    public static void main(String[] args) {
        int[] arr={5, -1, -2, -3, 1 };
        int target=3;
        boolean flag=method(arr,target);
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean method(int[] arr,int tar){
        boolean flag=false;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         if(arr[i]+arr[j]==tar){
        //             flag=true;
        //             break;
        //         }
        //     }
        // }
        Arrays.sort(arr);
        int l=0,r=arr.length-1;
        while(l<r){
            if(arr[l]+arr[r]==tar){
                flag=true;
                break;
            }
            else if(arr[l]+arr[r]>tar){
                r--;
            }
            else{
                l++;
            }
        }
        return flag;
    }
}
