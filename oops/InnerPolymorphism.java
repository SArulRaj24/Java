package oops;

//overriding
abstract  class Ride{
     abstract void display();

     Ride(){
        System.out.println("constructor for abs cls");
     }
}
class Overriding extends Ride{
    @Override
     void display() {
        System.out.println("Method for overriding");
    }
}

//overloading
class overloading{
    public int addition(int a,int b){
        return a+b;
    }

    public int addition(int a,int b,int c){
        return a+b+c;
    }

}

class Polymorphism{
    public static void main(String[] args) {
        overloading obj=new overloading();
        int sum1=obj.addition(5 ,6);
        int sum2= obj.addition(3,5,9);
        System.out.println(sum1+" "+sum2);

        Overriding ride=new Overriding();
        ride.display();
        


    }

}