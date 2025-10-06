import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diagonal {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int row=mat.length;
        int col=mat[0].length;


        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int key=i+j;
                if(!map.containsKey(key)){
                    map.put(key,new ArrayList<>());
                }
                map.get(key).add(mat[i][j]);
            }
        }
        System.out.println(map.values());

        //diagnoal traversal 
        for(int i=1;i<=map.size();i++){
            if(i%2!=0){
                System.out.println(map.get(i-1));
            }
            else{
                Collections.reverse(map.get(i-1));
                System.out.println(map.get(i-1));
            }
        }

    }
}
