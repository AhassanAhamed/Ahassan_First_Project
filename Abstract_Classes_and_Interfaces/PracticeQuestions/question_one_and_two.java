package Abstract_Classes_and_Interfaces.PracticeQuestions;
abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("Write");
    }
    @Override
    void refill() {
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
public class question_one_and_two {
    public static void main(String[] args) {
        FountainPen obj = new FountainPen();
        obj.write();
        obj.refill();
        obj.changeNib();
    }
}
