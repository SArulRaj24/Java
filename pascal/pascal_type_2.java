package pascal;
import java.util.*;
class pascal_type_2{
    public static void main(String[] args) {

        //return the specific row element of the pascal triangle
       int row=5;
       int res=1;
       System.out.print(res+" ");
       for(int i=1;i<row;i++){
            res=res*(row-i);
            res/=i;
            System.out.print(res+" ");
       }
    }
}