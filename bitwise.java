public class bitwise {
    public static void main(String[] args) {
        int a=5;
        int leftshif=a<<2; // left shift x = 0000 0101 (5)  num*2^n
                            // x << 2  = 0001 0100 (20)
        System.out.println(leftshif);

        int b=20;
        int right=b>>2;
         // Binary: 0001 0100
        //  Shift right by 2 bits 0000 0101
        System.out.println(right); // num/2^n

        // System.out.println(7|3);

    }
}
