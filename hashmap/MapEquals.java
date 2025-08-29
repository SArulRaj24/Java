package hashmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapEquals {
    public static void main(String[] args) {
        char[] arr1={'a','b','c'};
        char[] arr2={'b','c','a'};
        Map<Character,Integer> m1=new HashMap<>();
        Map<Character,Integer>m2=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(m1.containsKey(arr1[i])){
                m1.put(arr1[1],m1.get(arr1[i])+1);
            }
            else{
                m1.put(arr1[i],1);
            }
        }

        for(int i=0;i<arr2.length;i++){
            m2.put(arr2[i], m2.getOrDefault(arr2[i], 0) + 1);

        }

        System.out.print(m1+" "+m2);
        System.out.println(m1.equals(m2));
    }
}
