public class Operations {

    // a-->0
    // b-->1

    //         &    |    ^
    // 0  0    0    0    0
    // 0  1    0    1    1
    // 1  0    0    1    1
    // 1  1    1    1    0
    public static void main(String[] args) {
        String s1="babaab";
        String s2="abbaba";
        char ch='^';
        String ans="";
        for(int i=0;i<s1.length();i++){
            if(ch=='&'){
                if(s1.charAt(i)==s2.charAt(i)){
                    ans+=s1.charAt(i);
                }
                else if((s1.charAt(i)=='a' && s2.charAt(i)=='b') || (s1.charAt(i)=='b' && s2.charAt(i)=='a')){
                    ans+="a";
                }
                
            }
            if(ch=='|'){
                if(s1.charAt(i)=='a' && s2.charAt(i)=='a'){
                    ans+="a";
                }
                else{
                    ans+="b";
                }
            }
            if(ch=='^'){
                if(s1.charAt(i)==s2.charAt(i)){
                    ans+="a";
                }
                else{
                    ans+="b";
                }
            }
        }

        System.out.println(ans);
    }
}
