package Abstract_Classes_and_Interfaces.PracticeQuestions;
abstract class Telephone{
    abstract void  ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartPhone extends Telephone{
    @Override
    void ring() {
        System.out.println("Ringing..");
    }
    @Override
    void lift() {
        System.out.println("Picking up Call");
    }
    @Override
    void disconnect() {
        System.out.println("Disconnected");
    }
    void playMusic(){
        System.out.println("Playing Music");
    }
}
public class question_4 {
    public static void main(String[] args) {
        //SmartPhone smrt = new SmartPhone();
        Telephone tele = new SmartPhone();
        tele.ring();
        tele.lift();
        tele.disconnect();
    }
}
