//important 
// Given a sorted integer array, return sum of array so that each element is unique by 
// adding some numbers to duplicate elements so that sum of unique elements is minimum.

// I.e., if all elements in the array are unique, return the sum. If some elements are duplicates, 
// then increment them to make sure all elements are unique so that the sum of these unique elements is minimum.
// input3[] = { 2, 2, 4, 5 } => return 14 = 2+3+4+5 (index 1 is duplicate, so increment it)

// import java.util.ArrayList;

public class remove_dup {
    public static void main(String[] args) {
        int[] arr={1,2,4,2,3,3};
        int n = arr.length;

    int sum = arr[0];
    int prev = arr[0];

    for( int i = 1; i < n; i++ ) {
        int curr = arr[i];

        if( prev >= curr ) {
            curr = prev+1;
        }
        sum += curr;
        prev = curr;
    }
    
    System.out.println(sum);

    }
}
