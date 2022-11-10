package Messages;
// this is my change to the project
// this is my 2nd change to the project
import java.util.*;
import java.util.GregorianCalendar;

public class Message {
    //GregorianCalendar date  = new GregorianCalendar();
    // date = Date_time;
     public String Message;

    public Message(String message) {
        Message = message;
    }

    @Override
    public String toString() {
        return "Message [Message=" + Message + "]";
    }

   
    
}
