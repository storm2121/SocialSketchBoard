package Messages;
// this is my change to the project
// this is my 2nd change to the project
import java.util.GregorianCalendar;
public class Message {
    GregorianCalendar Date = new GregorianCalendar();
    public static int nMessages = 0;
    //GregorianCalendar date  = new GregorianCalendar();
    // date = Date_time;
    
     public String Message;

    public Message(String message,GregorianCalendar Date) {
        Message = message;
        this.Date = Date;
        nMessages++; // number of messages sent
    }

    @Override
    public String toString() {
        return "Message [Message=" + Message + "]";
    }

   
    
}
