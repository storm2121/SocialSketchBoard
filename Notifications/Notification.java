package Notifications;

public class Notification {
    
    public String text;

    public Notification(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Notification [text=" + text + "]";
    }
   
}
