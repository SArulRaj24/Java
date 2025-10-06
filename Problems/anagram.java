import java.util.*;
class anagram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(str1.length()!=str2.length()){
            System.out.println("Not a anagram");
        }
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int n=ch1.length;
        for (int i = 0; i <n; i++) {
            if(ch1[i]!=ch2[i]){
                System.out.println("Not a anagram");
                break;
            }
            else{
                System.out.println("Anagram");
                break;
            }
        }
    }
}