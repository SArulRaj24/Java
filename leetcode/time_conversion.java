// import java.util.*;
class time_conversion{
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();
        String s="07:05:4AM";
        String time=s.substring(s.length()-2,s.length());
        // System.out.print(time);
        if(time.equals("PM")){
           int hour=Integer.parseInt(s.substring(0,2));
            if(hour!=12){
                hour+=12;
            }
        
            String newTime=hour+""+s.substring(2,s.length()-2);
            System.out.print(newTime); 
        
        }
            
}
}