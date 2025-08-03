// Input: "programming"
// Unique characters: p o a i n

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;



public class unique_char_string {
    public static void main(String[] args) {
        String str="programming";
        
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
        }
        //System.out.println(map);
        for (Map.Entry<Character,Integer> entry:map.entrySet()) {
            if(entry.getValue()<2){
                System.out.println(entry.getKey());
            }
        }

    }
}
/*
 * for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            }else{
                int a=map.get(str.charAt(i));
                map.put(str.charAt(i),a+1);
            }
        }
 */