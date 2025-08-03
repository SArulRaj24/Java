import java.util.*;
class key_in_num_3270{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        String num1 = String.format("%04d", a);
        String num2 = String.format("%04d", b);
        String num3 = String.format("%04d", c);

        char[] arr1=num1.toCharArray();
        char[] arr2=num2.toCharArray();
        char[] arr3=num3.toCharArray();

        int min1=0, min2=0, min3=0,min4=0; 
    
        min1=Math.min(arr1[0]-'0',Math.min(arr2[0]-'0',arr3[0]-'0'));
        min2=Math.min(arr1[1]-'0',Math.min(arr2[1]-'0',arr3[1]-'0'));
        min3=Math.min(arr1[2]-'0',Math.min(arr2[2]-'0',arr3[2]-'0'));
        min4=Math.min(arr1[3]-'0',Math.min(arr2[3]-'0',arr3[3]-'0'));

        StringBuilder sb = new StringBuilder();
        
        sb.append(min1);
        sb.append(min2);
        sb.append(min3);
        sb.append(min4);

        int res=Integer.parseInt(sb.toString());

        System.out.println(res);

    }
}