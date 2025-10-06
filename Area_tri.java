public class Area_tri {
    public static void main(String[] args) {
        int[][] mat={{0,0},{0,1},{1,0},{0,2},{7,0}};
        int height=0;
        int base=0;
        int k=0;
        int l=1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][k]>height){
                height=mat[i][k];
            }
            
        }
        for (int i = 0; i < mat.length; i++) {
            if(mat[i][l]>base){
                base=mat[i][l];
            }
        }
        System.out.println(height);
        System.out.println(base);
    }
}
