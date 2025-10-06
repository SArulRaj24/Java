package Sort;
import java.util.*;
public class vowel_sort {
    public static void main(String[] args) {
        String s="HelloA";
        String ans="";
        List<Character> ls=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E'|| s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' ||
                s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                    ls.add(s.charAt(i));
            }

        }
        Collections.sort(ls);


        int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E'|| s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' ||
                s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                    ans+=ls.get(k++);
            }
            else{
                ans+=s.charAt(i);
            }
        }

        System.out.println(ans);

    }
}


// for (int i = 0; i < str.length(); i++) {
//             if("aeiouAEIOU".indexOf(str.charAt(i))!=-1){
//                 list.add(str.charAt(i));
//             }
//         }