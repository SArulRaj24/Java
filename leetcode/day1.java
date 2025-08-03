import java.util.*;
class day1{
    public static void main(String[] args) {
        String str="aeiouqq";
        int n=str.length();
        List<String> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
             String s=str.substring(i,j+1);
             if(s.length()>=5){
                    ls.add(s);
             }
            }
        }
        System.out.println(ls);
    }
}