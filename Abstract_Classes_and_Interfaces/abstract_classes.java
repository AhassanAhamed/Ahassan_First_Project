package Abstract_Classes_and_Interfaces;

abstract class Parent
{
    public void Parent(){
        System.out.println("I am Parent Constructor...");
    }
    public void sayHello(){
        System.out.println("Hello..");
    }
    abstract public void greet();
}

class child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning...");
    }
}

abstract class child1 extends Parent{
    public void th(){
        System.out.println("I am Good..");
    }
}

public class abstract_classes
{
    public static void main(String[] args) {
        // Parent p = new Parent();     ---> Abstract Class ka object nahi banta
        // child1 c1 = new child1();    ---> Same
        child c = new child();          // child is a concrete class , so we can make object of it
        c.greet();
        c.sayHello();
        c.Parent();
    }
}
