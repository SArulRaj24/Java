package pascal;
import java.util.*;
class pascal_type_1{
    public static void main(String[] args) {
        int row=5,col=3;
        // // using row and column to print the element in the pascal triangle
        // int row_pro=1;
        // for(int i=row;i>(row-col);i--){
        //    row_pro=row_pro*i;
        // }
        // int den=1;
        // for(int i=1;i<=col;i++){
        //     den=den*i;
        // }

        // System.out.println(row_pro/den);

        //or

        
        int res=1;
        for(int i=0;i<col;i++){
            res*=(row-i);
            res/=(i+1);
        }

        System.out.println(res);

        

        
    }
}