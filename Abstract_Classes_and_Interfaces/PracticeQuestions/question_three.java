package Abstract_Classes_and_Interfaces.PracticeQuestions;
class Monkey{
    void jump()
    {
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
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
public class question_three {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.jump();
        obj.bite();
        obj.eat();
        obj.sleep();
        obj.speak();
    }
}
