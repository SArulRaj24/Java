package oops;

class Student{
    String name;
    Student(String name){
        this.name=name;
    }
    public void printdetails(){
        System.out.println("name is " + name );
    } 
}

class Child extends Student{
    
    int id;
    String dept;

    Child(int id,String dept,String name){
        super(name);
        this.id=id;
        this.dept=dept;
    }

    public void printdetails(){
        System.out.println("name is " + name + " id is " + id + " from " + dept);
    }    
}

public class inheritance {
    public static void main(String[] args) {
        Student ch=new Child(1, "AIML", "person");
        ch.printdetails();
    }
}

