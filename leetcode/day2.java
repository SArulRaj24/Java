import java.util.*;
class day2{
    public static void main(String[] args) {
        String str="abcabc"; 
        int cnt=0;       
            for(int i=0;i<str.length();i++){
                for(int j=i;j<str.length();j++){
                    String s=str.substring(i,j+1);
                    if(s.contains("a") && s.contains("b") && s.contains("c")){
                        cnt++;
                    }
               }
            }

            System.out.println(cnt);

            
    }
}