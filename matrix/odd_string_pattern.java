// input: tiger
// output:

// t    r
//  i e
//   g
//  i e
// t    r    

import java.util.Scanner;

public class odd_string_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=0,r=str.length()-1;

       while(l<=r){
        for(int i=0;i<str.length();i++){
            if(i==l || i==r){
                System.out.print(str.charAt(i));
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
        l++;
        r--;
       }

       l=l-2;
       r=r+2;

       while(l>=0 && r<=str.length()-1){
        for(int i=0;i<str.length();i++){
            if(i==l || i==r){
                System.out.print(str.charAt(i));
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
        l--;
        r++;

       }
    }
}
