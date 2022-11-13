package test;

class A{
    String name ;
    int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void print(){
        System.out.println("The name and Age is ->"+name +" "+ age);
    }
}

public class OOPS {

    public static void main(String[] args) {
        // Datatype objName = new DataType();
        A obj = new A();
        obj.setAge(44);
        obj.setName("Siddharth");
        obj.print();

        A obj2 = new A();

        obj2.setName("Prabhat");
        obj2.setAge(12);

        obj2.print();
        // calling the function which is present inside the - class via
        // the newly object created //
    }

}
