package oops;
import java.util.*;

import oops.class_obj.Student;

// import oops.class_obj.Student;

public class student {
    int roll;
    String name;

    // student(int roll, String name) {
    //     this.roll = roll;
    //     this.name = name;
    // }
    
    public int getRoll(){
        return roll;
    }
    public void setRoll(int roll){
        this.roll=roll;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }


    public void display(){
        System.out.println("name is "+name+" "+"roll is "+roll);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int roll=sc.nextInt();
        String name=sc.nextLine();
        // student stud=new student(roll, name);
        student stud=new student();
        stud.setName(name);
        stud.setRoll(roll);
        stud.display();
    }

}


