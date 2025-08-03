package stack;
import java.util.*;
public class monotonic_stack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }

        Stack<Integer> stk=new Stack<>();
        for(int val:arr){
            while(!stk.isEmpty() && stk.peek()>val){
                stk.pop();
            }
            stk.push(val);

        }

        int[] ans=new int[stk.size()];
        int index=stk.size()-1;
        while(!stk.isEmpty()){
            ans[index--]=stk.pop();
        }

        for(int inc:ans){
            System.out.println(inc+" ");
        }
            
        
    }
}
