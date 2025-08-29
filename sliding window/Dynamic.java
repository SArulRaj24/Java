import java.util.HashSet;
import java.util.Set;

public class Dynamic {
    public static void main(String[] args) {
        char[] arr={'a','c','b','d','d','c','d'};

        Set<Character> set=new HashSet<>();
        int maxlen=0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            while(set.contains(arr[right])){
                set.remove(arr[left]);
                left++;
            }
            set.add(arr[right]);
            maxlen=Math.max(maxlen,right-left+1);
        }
        System.out.println(maxlen);
    }
}
