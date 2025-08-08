package abstractt;
class EmailNotification extends Notification {
    
    public void send(String message) {
        System.out.println("Email Notification: " + message);
    }
}

class SMSNotification extends Notification {

    public void send(String message) {
        System.out.println("SMS Notification: " + message);
    }
}

class PushNotification extends Notification {

    public void send(String message) {
        System.out.println("Push Notification: " + message);
    }
}

public abstract class NotificationSystem {

	public static void main(String[] args) {
		Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        Notification push = new PushNotification();

        email.send("Meeting at 10 AM");
        sms.send("Your OTP is 456789");
        push.send("New updates available!");
	}

}
