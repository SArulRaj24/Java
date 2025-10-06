import java.util.*;
class selecctionsort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }

//        Selection sort
        for(int i=0;i<a-1;i++){
            int min=i;
            for(int j=i+1;j<a;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
//            swap
            int swap=arr[min];
            arr[min]=arr[i];
            arr[i]=swap;
        }
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
    }
}