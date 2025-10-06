import java.util.Arrays;

public class assign_cookies_455 {
    public static void main(String[] args) {
        int[] greedy={1,2,3,4};
        int[] stud={1,2,1};
        int cnt=0;
        Arrays.sort(stud);
        Arrays.sort(greedy);
        int i=0,j=0;
        while(i<greedy.length && j<stud.length){
            if(greedy[i]<=stud[j]){
                cnt++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        System.out.println(cnt);
    }
}
