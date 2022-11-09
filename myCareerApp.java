import User.*;
public class myCareerApp {
    public static void main(String[] args)
    {
        Account p = new Account("Abdelhadi","123");
        System.out.println(p.authenticate("123", "Abdelhadi"));
    }
}
