package test;
class Animal{
    void eat(){
        System.out.println("Animal can Eat");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("Dog can Bark");
    }
}
public class Inherit {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.eat();
        //animal.bark();

        Dog dog = new Dog();
        dog.Bark();
        dog.eat();

    }
}