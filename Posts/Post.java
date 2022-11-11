package Posts;
import java.util.GregorianCalendar;
public class Post {
    GregorianCalendar Date = new GregorianCalendar();
    public String Post;


    public Post(String post,GregorianCalendar Date) {
        this.Post = post;
        this.Date = Date;
    }


    @Override
    public String toString() {
        return "Post [Post=" + Post + "]";
    }
    
    
}
