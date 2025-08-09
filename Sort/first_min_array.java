package Sort;

import java.util.Arrays;


//nlogn
public class first_min_array {
    public static void main(String[] args) {
        int[] arr = {3,1,2,-4,-2};
        Arrays.sort(arr);
        int min = 1;
        
        // Skip negative numbers
        int i = 0;
        while (i < arr.length && arr[i] <= 0) {
            i++;
        }
        
        // Find first missing positive integer
        for (; i < arr.length; i++) {
            if (arr[i] == min) {
                min++;
            } else if (arr[i] > min) {
                // Found a gap
                System.out.println("First missing positive integer: " + min);
                return;
            }
        }
        
        // If we reach here, the answer is min
        System.out.println("First missing positive integer: " + min);
    }
}
