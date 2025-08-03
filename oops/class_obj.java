 package oops;
 class class_obj{

   public  static class Student{
        int age;
        String name; 
        int reg;

        // Student(int age, String name, int reg){
        //     this.age = age;
        //     this.name = name;
        //     this.reg = reg;
        // }

        void display(){
            System.out.println(name+" "+age+" "+reg);
        }
     }

    public static void main(String[] args) {
        // Student stud=new Student(14,"raj",5);
        Student stud=new Student();
        stud.age=46;
        stud.name="raj";
        stud.reg=5;
        stud.display();
    }

}
