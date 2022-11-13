package test;
class Animall{
    void eat(){
        System.out.println("Eating..");
    }
}
class Cat extends Animall{
    void meow(){
        System.out.println("Meow Meow");
    }
}
class BabyCat extends Cat{
    void weep(){
        System.out.println("Weep Weep");
    }
}
public class OOPSMulti {
    public static void main(String[] args) {
        // calling fuinction -> will be done via the object of the same class.
        Animall animallObj = new Animall();
        animallObj.eat();

        Cat catObj = new Cat();
        catObj.meow();
        catObj.eat();

        BabyCat babyCatObj = new BabyCat();
        babyCatObj.weep();
        babyCatObj.eat();
        babyCatObj.meow();
    }

}
