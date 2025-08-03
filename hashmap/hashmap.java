package hashmap;
import java.util.*;
class hashmap{
    public static void main(String[] args){
        Map<Integer,Integer> mp=new HashMap<>();
       int[] arr={2,5,2};
        for(int i:arr){
            if(mp.containsKey(i)){
                mp.put(i,mp.get(i)+1);
            }
            else{
                mp.put(i,1);
            }
        }
        System.out.println(mp);
    }
}