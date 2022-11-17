package Notifications;

import java.util.GregorianCalendar;

public class Notification {
    GregorianCalendar Date = new GregorianCalendar();
    public String text;

    public Notification(String text,GregorianCalendar Date) { // constructor
        this.text = text;
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "Notification [text=" + text + "]";
    }
   
}
