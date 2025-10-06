import java.util.ArrayList;
import java.util.List;
class String_rev{
    public static void main(String[] args) {        
        // System.out.println(palindrome("madam"));
        // System.out.println(reverse("demo"));

        Substring_palindrome("a");
    }

    static boolean palindrome(String str){
        int i=0,j=str.length()-1;
        for( i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static String reverse(String str){
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            ans+=str.charAt(i);
        }
        return ans;
    }

    static void Substring_palindrome(String str){

        List<String> ls=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                // System.out.print(str.substring(i, j)+" ");
                String sub=str.substring(i,j);
                if(isPalindrome(sub)){
                    ls.add(sub);
                }
                
            }
        }
        System.out.println(ls);

        String ans="";
        for(String s:ls){
            if(s.length()>ans.length()){
                ans=s;
            }
        }

        System.out.println(ans);
    }

    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    
}