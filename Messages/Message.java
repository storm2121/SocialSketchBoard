package Messages;
import java.util.GregorianCalendar;
public class Message {
    GregorianCalendar Date = new GregorianCalendar();
    public static int nMessages = 0;
   
    
     public String Message;

    public Message(String message,GregorianCalendar Date) {
        Message = message;
        this.Date = Date;
        
    }

    @Override
    public String toString() {
        return "Message [Message=" + Message + "]";
    }

   
    
}
