import java.util.*;
class consecutive_add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for (int i = 0; i <a ; i++) {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int s=sc.nextInt();
        for (int i = 0; i < a-1; i++) {
            int j=i+1;
            if(arr[i]+arr[j]==s){
                ans.add(arr[i]);
                ans.add(arr[j]);
            }
        }
        System.out.println(ans);
        System.out.println(ans.size());
    }
}