package hashmap;
import java.util.*;
public class hashmap_ {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() >= 2) {
                    System.out.print(entry.getValue());
                    break;
                }
            }
        }
        System.out.println(-1);
    }
}
