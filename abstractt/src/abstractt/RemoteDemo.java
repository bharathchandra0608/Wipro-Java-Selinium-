package abstractt;

class TVRemote extends Remote { 
    public void turnOn() {
        System.out.println("TV is turned ON.");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}
public class RemoteDemo {

	public static void main(String[] args) {
		 Remote remote = new TVRemote();

	        remote.turnOn();  
	        remote.turnOff(); 

	}

}
