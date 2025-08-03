package oops;
class hll{
    hll(){
        System.out.println("hll");
    }
    public void gg(){
        System.out.println("gg");
    }
}
class Hello1 extends hll{
    Hello1(){
        super.gg();
        System.out.println("Hello1");
    }
    @Override
    public String toString(){
        return "Hello1";
    }
}
public class Hello {
 public static void main(String[] args) {
    hll obj=new Hello1();
 }   
}
