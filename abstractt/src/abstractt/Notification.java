package abstractt;

public abstract class Notification {
	public abstract void send(String message); 
	
	class Myab extends Notification{
		public void send(String message) {
			System.out.println("sai");
		}
	}
}
