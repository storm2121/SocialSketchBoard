package Notifications;

public class Notification {
    
    public String text;

    public Notification(String text) {
        this.text = text;
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
}
