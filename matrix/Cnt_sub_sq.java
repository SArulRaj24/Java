// Input: matrix =
// [
//   [0,1,1,1],
//   [1,1,1,1],
//   [0,1,1,1]
// ]
// Output: 15
// Explanation: 
// There are 10 squares of side 1.
// There are 4 squares of side 2.
// There is  1 square of side 3.
// Total number of squares = 10 + 4 + 1 = 15.

public class Cnt_sub_sq {
    public static void main(String[] args){
        int[][] mat={{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        int cnt=0;
        int row=mat.length;
        int col=mat[0].length;
        for(int size=1;size<=Math.min(row,col);size++){
            for(int i=0;i<=row-size;i++){
                for(int j=0;j<=col-size;j++){
                    if(validate(mat,i,j,size)){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    public static boolean validate(int[][] mat,int row,int col,int size){
        for(int i=row;i<row+size;i++){
            for(int j=col;j<col+size;j++){
                if(mat[i][j]!=1){
                    return false;
                }
            }
        }
        return true;
    }
    
}
