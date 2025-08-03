package pascal;
import java.util.*;
class pascal{
    public static void main(String[] args) {
        int row=3;
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<=row;i++){
            ls.add(pascall(row,i));
        }
        System.out.println(ls);
    }

    public static int pascall(int n,int r){
        int out=1;
        for(int i=0;i<r;i++){
            out*=(n-i);
            out/=(i+1);
        }
        return out;
    }
}