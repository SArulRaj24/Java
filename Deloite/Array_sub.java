// https://prepinsta.com/hashedin-by-deloitte-coding-questions/

package Deloite;

import java.util.ArrayList;
import java.util.*;
public class Array_sub {
    public static void main(String[] args) {
        int k=2;
        int n=5;
        int[] arr={1,2,8,4,5};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        List<List<Integer>> ls=new ArrayList<>();
        List<Integer> maxi=new ArrayList<>();
        for(int i=0;i<=n-k;i++){
            min=Integer.MAX_VALUE;
            List<Integer> l=new ArrayList<>();
            for(int j=i;j<i+k;j++){
                min=Math.min(min, arr[j]);
                l.add(arr[j]); 
            }
            max=Math.max(max, min);
            maxi.add(max);
            ls.add(l);
        }
        System.out.println(maxi);
        System.out.println(ls);
        System.out.println(max);

    }
}
