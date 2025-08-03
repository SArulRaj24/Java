package Sort;
import java.util.*;

public class customSort {
    public static void main(String[] args) {
        // List<Integer> list=new ArrayList<>();
        Integer[] arr = {12, 45, 32, 64, 10, 11,12};
        Arrays.sort(arr, (a, b) -> {
            if (a % 10 != b % 10) {
                return a - b;
            } else {
                return a-b;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
