import java.util.*;
class collection{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        char[] ch=new char[str.length()];
        for (int i = 0; i <str.length() ; i++) {
             ch[i]=str.charAt(i);
        }
        char b=sc.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if(ch[i]==b){
                count++;

            }
        }
        System.out.println(count);
        if(count<0){
            System.out.println("0");
        }
    }
}