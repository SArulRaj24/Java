import java.util.*;
class boundary_sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        int[][] arr=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(i==0 || i==a-1 || j==0 || j==b-1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}