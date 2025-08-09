package BinarySearch;

public class Search2D {
    public static void main(String[] args) {
        int[][] mat={{1,3,5},{7,9,11},{23,46,76}};
        int target=4;

        int row=mat.length;
        int col=mat[0].length;
        boolean flag=false;
        int l=0;
        int r=(row*col)-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target==mat[mid/col][mid%col]){
                flag=true;
                break;
            }
            else if(target>mat[mid/col][mid%col]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
            
        }
        if(flag){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
