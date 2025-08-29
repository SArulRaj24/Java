package stack;

import java.util.*;

public class paran {
    public static void main(String[] args) {
        String str="()(()())(()(()))";
        // List<String> ls=new ArrayList<>();
        // Stack<Character> stk=new Stack<>();
        int cnt=0;
        int k=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                cnt++;
            }
            if(str.charAt(i)==')'){
                cnt--;
            }
            if(cnt==0){
                // ls.add(str.substring(k, i+1));
                System.out.println(str.substring(k, i+1));
                k=i+1;
            }
            
        }
    //    System.out.println(ls);
    }
}
