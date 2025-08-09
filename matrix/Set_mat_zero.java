// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]

import java.util.Arrays;

public class Set_mat_zero {
    public static void main(String[] args) {
        int[][] mat={{1,1,1},{1,0,1},{1,1,1}};

        int[][] ans=new int[3][3];

        int a=0,b=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    a=i;
                    b=j;
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==a  || j==b){
                    ans[i][j]=0;
                }
                else{
                    ans[i][j]=mat[i][j];
                }
            }
        }


        System.out.println(Arrays.deepToString(ans));
        // System.out.print(a+" "+b);

    }
}


//inplace 

// // class Solution {
//     public void setZeroes(int[][] matrix) {
//         int[] rows = new int[matrix.length];
//          int[] columns = new int[matrix[0].length];

//          for(int i=0;i<matrix.length;i++){

//             for(int j=0;j<matrix[i].length;j++)
//             {
//                 if(matrix[i][j]==0){
//                     rows[i]=1;
//                     columns[j]=1;
//                 }
//             }
//          }

//           for(int i=0;i<matrix.length;i++){

//             for(int j=0;j<matrix[i].length;j++)
//             {
//                 if(rows[i]==1 || columns[j]==1){
//                     matrix[i][j]=0;
//                 }
//             }
//          }
//     }
// }