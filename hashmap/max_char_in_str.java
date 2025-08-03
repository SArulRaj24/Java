package hashmap;
import java.util.*;
class max_char_in_str{
    public static void main(String[] args) {
        String str="bbabbaca";
        char[] ch=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }
            else{
                map.put(ch[i],1);
            }
        }
        int max=0;
        char max_c=' '; 
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                max_c=entry.getKey();
            }
        }

        System.out.println(map);
        System.out.println(max);
        System.out.println(max_c);
    }
}