// Input: arr = [4, 3, 6, 2, 1, 4, 6]
// Repeated elements are: 4 6

import java.util.ArrayList;
import java.util.List;

public class dup_in_arr {
    public static void main(String[] args) {
        int[] arr={4, 3, 6, 2, 1, 4, 6};
        int i=0;
        while (i<arr.length) {
            int current=arr[i]-1; //0 based index 
            if(arr[i]!=arr[current]){
                int temp=arr[i];
                arr[i]=arr[current];
                arr[current]=temp;
            }
            else{
                i++;
            }
        }
        List<Integer> ls=new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ls.add(arr[j]);
            }
        }
        System.out.println(ls.toString());
    }
}
