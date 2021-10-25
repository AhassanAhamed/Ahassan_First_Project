package Abstract_Classes_and_Interfaces;
interface Camera2{
    void takeSnap();
    void recordVideo();
    private void greet(){       // ye method tab use krte hai jab default method ka logic bahut bada ho jata hai
        System.out.println("Good Morning.");
    }
    default void record4KVideo(){     // We can override this method in MySmartPhone Class
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface Wifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements Wifi2,Camera2{
    public void takeSnap(){
        System.out.println("Taking Snap..");
    }
    public void recordVideo(){
        System.out.println("Recording Video..");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of Networks..");
        String [] networkList = {"Poco wifi","ehsaan69G", "baap ko bol recharge karwaye"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Camera2 cam1 = new MySmartPhone2();  // this is smartphone but can use camera only
        // cam1.getNetwork(); --> Not Allowed because ye camera ka method nhi hai
        cam1.takeSnap();
        cam1.record4KVideo();
        cam1.recordVideo();
        MySmartPhone2 smart = new MySmartPhone2(); // this can run all methods including camera wifi etc.
        smart.connectToNetwork("5G");
        smart.recordVideo();
        smart.callNumber(95317);
    }
}
