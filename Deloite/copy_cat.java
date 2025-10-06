package Deloite;
import java.util.*;
class copy_cat{
    public static void main(String[] args) {
        String s="Car";
        String s2="AcR";
        s=s.toLowerCase();
        s2=s2.toLowerCase();
        System.out.println(s+" "+s2);
        char[] ch1=s.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);


        String str1=new String(ch1);
        String str2=new String(ch2);
        System.out.println(str2);
        if(str1.equals(str2)){
            System.out.println("yes copied");
        }
        else{
            System.out.println("Not");
        }
        

    }
}