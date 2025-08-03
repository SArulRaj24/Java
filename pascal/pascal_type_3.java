package pascal;

import java.util.*;
public class pascal_type_3 {
    public static void main(String[] args) {
        int row=5;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=row;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=1;j<=i;j++){
                temp.add(pascal(i-1,j-1));
            }
            ans.add(temp); 
        }

        for(List<Integer> i:ans){
            System.out.println(i);
        }
        
    }
    
    public static int pascal(int r,int c){
        int res=1;
        for(int i=0;i<c;i++){
            res*=(r-i);
            res/=(i+1);
        }

        return res;
    }
}
