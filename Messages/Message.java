package Messages;
// this is my change to the project
// this is my 2nd change to the project
import java.util.*;
import java.util.GregorianCalendar;
public class Message {
    public static int nMessages = 0;
    //GregorianCalendar date  = new GregorianCalendar();
    // date = Date_time;
     public String Message;

    public Message(String message) {
        Message = message;
        nMessages++; // number of messages sent
    }
    public int getCount()
    {
        return nMessages;
    }

    @Override
    public String toString() {
        return "Message [Message=" + Message + "]";
    }

   
    
}
