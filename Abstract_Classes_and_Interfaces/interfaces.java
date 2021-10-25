package Abstract_Classes_and_Interfaces;
interface Bicycle{
    int a = 50;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface GearBicycle{
    void blowWhistle();
    void changeGear();
}
class AvonCycle implements Bicycle, GearBicycle{
    void blowHorn(){
        System.out.println("Pppeeeeeeeeeee");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake..");
    }
    public void speedUp(int increment){
        System.out.println("Speeding Up..");
    }
    public void blowWhistle(){
        System.out.println("Blowing Whistle..");
    }
    public void changeGear(){
        System.out.println("Changing Gear..");
    }
}
public class interfaces
{
    public static void main(String[] args) {
        AvonCycle ehsaankaCycle = new AvonCycle();
        ehsaankaCycle.applyBrake(2);
        // We can create properties in interfaces
        System.out.println(ehsaankaCycle.a);
        // We cannot modify the properties in Interfaces as they are final
        // ehsaankaCycle.a = 9;
        ehsaankaCycle.blowWhistle();
        ehsaankaCycle.changeGear();
    }
}
