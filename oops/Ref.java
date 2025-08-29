package oops;

//parent ref object creation for child cls
class Parent{
    void display(){
        System.out.println("Hlo from parent");
    }
}
class child extends Parent{
    @Override
    void display(){
        System.out.println("Hlo from child");
    }
    void study(){
        System.out.println("studying");
    }
}
public class Ref {
    public static void main(String[] args) {
        Parent obj=new child();
        obj.display();
        child c=(child) obj;
        c.study();
    }
}
