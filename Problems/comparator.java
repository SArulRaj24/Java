import java.util.*;

public class comparator {
    public static void main(String[] args){

        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10){
                    return 1;
                }
                else
                    return -1;
            }
        };
        Scanner sc=new Scanner(System.in);
//        List<Integer> arr=new ArrayList<>();
//        arr.add(52);
//        arr.add(15);
//        arr.add(71);
//        arr.add(89);
        Integer[] arr={11,87,96,55,78};
        Arrays.sort(arr,com);

//        Collections.sort(arr,com);
        for(int num:arr){
            System.out.println(num);
        }

    }
}
