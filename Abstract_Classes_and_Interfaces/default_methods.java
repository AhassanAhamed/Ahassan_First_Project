package Abstract_Classes_and_Interfaces;
interface Camera{
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
interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements Wifi,Camera{
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
public class default_methods
{
    public static void main(String[] args) {
        MySmartPhone smph = new MySmartPhone();
        String[] ar = smph.getNetworks();
        for(int i=0; i< ar.length;i++)
        {
            System.out.println(ar[i]);
        }
        smph.connectToNetwork("ehsaan69G");
        /*smph.takeSnap();
        smph.recordVideo();
        smph.record4KVideo();*/
        // smph.callNumber(906442);
    }
}
