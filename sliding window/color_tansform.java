public class color_tansform {
    public static void main(String[] args) {
        String str="WBBWWBBWBW";
        int a=7;
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<str.length()-a;i++){
            int cnt=0;
            for(int j=i;j<i+a;j++){
                if(str.charAt(j)=='W'){
                    cnt++;
                }
            }
            min=Math.min(min, cnt);
        }

        System.out.println(min);
        

    }
}
