// The algorithm for myAtoi(string s) is as follows:

// Whitespace: Ignore any leading whitespace (" "). 
// Signedness: Determine the sign by checking if the next character is '-' or '+',
              // assuming positivity if neither present.
// Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or
                // the end of the string is reached. If no digits were read, then the result is 0.
// Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer
                // to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers
                // greater than 231 - 1 should be rounded to 231 - 1.
public class string_to_int {
    public static void main(String[] args){
        String num="  -046B4 ";
        num=num.trim();
        StringBuilder sb=new StringBuilder();
        if(num.charAt(0)=='-'){
            for(int i=1;i<num.length();i++){
                if(num.charAt(i)<'0' || num.charAt(i)>'9'){
                    sb.append(num.charAt(i));
                }
            }
        }
        else{
            for(int i=0;i<num.length();i++){
                if(num.charAt(i)<'0' || num.charAt(i)>'9'){
                    sb.append(num.charAt(i));
                }
            }
        }


        int i=Integer.parseInt(sb.toString());
        System.out.print(i);
    }

}
