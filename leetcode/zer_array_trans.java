//  import java.util.*;
 class zer_arr_trans{
    // pending
    public static void main(String[] args) {
        int[] arr={1,2,1,0,0,0};
        int[][] query={{0,3},{2,4}};
        System.out.println(query.length);
        for(int i=0;i<query.length;i++){
            int start=query[i][0];
            int end=query[i][1];

            for(int j=start;j<end;j++){
                if(j>=0 && j<arr.length && arr[j]>0){
                    arr[j]--;
                }
            }

        }
        boolean fnd=false;
            for(int i:arr){
                if(i==0){
                    fnd=true;
                    break;
                }
            }

            if(fnd){
                System.out.println("true");
            }
            else{
                System.out.println("False");
            }

    }
 }