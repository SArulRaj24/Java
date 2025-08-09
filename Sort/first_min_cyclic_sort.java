package Sort;

import java.util.Arrays;

public class first_min_cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {1,-1,2,2,3,4};
        sort(arr);
        
        System.out.println(Arrays.toString(arr));
        // Find first missing positive integer
        int firstMissing = findFirstMissing(arr);
        System.out.println("First missing positive integer: " + firstMissing);
    }

    public static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Only sort positive numbers within valid range
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]) {
                int correct = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }

    public static int findFirstMissing(int[] arr) {
        // Check each index for correct positive number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i+1;
            }
        }
        // If all numbers are in correct positions
        return arr.length + 1;
    }
}
