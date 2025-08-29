import java.util.Arrays;

public class Trpping_rain_water {
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        int max=-1;

        for(int i=0;i<height.length;i++){
            if(height[i]>=max){
                max=height[i];
            }
            left[i]=max;
        }

         max=-1;
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>=max){
                max=height[i];
            }
            right[i]=max;
        }

        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));


        int totalWater=0;
        for(int i=0;i<height.length;i++){
            totalWater+=Math.min(left[i],right[i])-height[i];
        }

        System.out.println(totalWater);
    }
}
