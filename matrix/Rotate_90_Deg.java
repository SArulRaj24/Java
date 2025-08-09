import java.util.Arrays;
//mat->transpose->swap value in each row
public class Rotate_90_Deg {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};

        transpose(mat);
        System.out.print(Arrays.deepToString(mat));
    }

    static void transpose(int[][] mat){

        //transpose
        int len=mat.length;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        //swap 
        for(int i=0;i<len;i++){
            int low=0,high=len-1;
            while(low<high){
                int temp=mat[i][low];
                mat[i][low]=mat[i][high];
                mat[i][high]=temp;
                low++;
                high--;
            }
        }

    }
}
