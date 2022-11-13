package Upgrad4Java;
abstract class Bike{
    Bike(){
        System.out.println("Bike is Created");
    }

    abstract void run();
    void changeGear(){
        System.out.println("Gear Changed");
    }
}
class abc extends Bike{
    void run() {
        System.out.println("new class abc called");
    }
}
public class Car extends Bike{
    void run(){
        System.out.println("Implemented the Run method");
    }

    public static void main(String[] args) {
        // main function - driver function
        // create object of the function which class is - declaring the method //
        Bike obj = new Car();
        obj.run(); // -> written in line 19 ->
        obj.changeGear(); // written in line 9

        Bike obj2 = new abc();
        obj2.run(); // line 14
    }
}
