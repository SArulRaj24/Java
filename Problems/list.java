import java.util.*;
class list{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        Stack<Integer> ans=new Stack<>();
        for(int i=0;i<str.length();i++){
            ans.push(i+1);
            if(i==str.length() || str.charAt(i)=='I'){
                while(!ans.isEmpty()){
                    sb.append(ans.pop());
                }
            }
        }
        System.out.println(ans.toString());
    }


}