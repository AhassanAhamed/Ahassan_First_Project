package Abstract_Classes_and_Interfaces.PracticeQuestions;
class Monkey1{
    void jump()
    {
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal1{
    void eat();
    void sleep();
}
class Human1 extends Monkey1 implements BasicAnimal1{
    void speak(){
        System.out.println("Speaking...");
    }
    @Override
    public void eat() {
        System.out.println("Eat..");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping..");
    }
}
public class question_five {
    public static void main(String[] args) {
        Monkey1 monkey = new Human1();  // This will call only methods inside monkey.
        monkey.jump();
        monkey.bite();

        BasicAnimal1 ba = new Human1(); // This will perform only BasicAnimal Methods
        ba.eat();
        ba.sleep();
    }
}
