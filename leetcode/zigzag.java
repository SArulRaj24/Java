// "PAYPALISHIRING"  ==>input
// P   A   H   N  ==>pattern
// A P L S I I G
// Y   I   R
//  "PAHNAPLSIIGYIR" ==>output

public class zigzag {
    public static void main(String[] args) {
        String str="PAYPALISHIRING";
        int rowcnt=3;
        StringBuilder sb=new StringBuilder();
        char[][] mat=new char[rowcnt][str.length()];

        //logic
        int i=0,row=0,col=0;
        while(i<str.length()){
            while(row<rowcnt && i<str.length()){
                mat[row++][col]=str.charAt(i++);
            }
            row=Math.max(0, row-2);
            while(row>0 && i<str.length()){
                mat[row--][++col]=str.charAt(i++);
            }
            col++;
        }



        //printing
        i=0;
        for( i=0;i<mat.length;i++){
            for(int j=i;j<mat[0].length;j++){
                if(mat[i][j]!=0){
                    sb.append(mat[i][j]);
                }
            }
        }
        System.out.println(sb.toString());
        
    }
}

