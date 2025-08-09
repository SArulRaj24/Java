package hashmap;
import java.util.HashSet;
import java.util.Scanner;
class happy_num{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Is " + n + " a happy number? " + isHappy(n));
    }
    

    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            if (seen.contains(sum)) return false; // cycle detected
            seen.add(sum);
            n = sum;
        }

        return true;
    }
}
