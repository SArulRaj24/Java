import java.util.*;
class spiral{
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        
        int rowstart=0;
        int rowend=arr.length-1;
        int colstart=0;
        int colend=arr[0].length-1;

        List<Integer> ls=new ArrayList<>();
        while(rowstart<=rowend && colstart<=colend){

            for(int i=colstart;i<=colend;i++){
                ls.add(arr[rowstart][i]);
            }
            rowstart++;

            for(int i=rowstart;i<=rowend;i++){
                ls.add(arr[i][colend]);
            }
            colend--;

            if(rowstart<=rowend){
                for(int i=colend;i>=colstart;i--){
                    ls.add(arr[rowend][i]);
                }
                rowend--;
            }

            if(colstart<=colend){
                for(int i=rowend;i>=rowstart;i--){
                    ls.add(arr[i][colstart]);
                }
                colstart++;
            }
        }
        System.out.println(ls);
    }
}