/* This program is only intended for 1 user only */
import User.*;
import Messages.*;
import Notifications.*;
import Posts.*;
import java.util.*;
import java.util.GregorianCalendar;
public class myCareerApp {

    public static void main(String[] args)
    {
        String username;
        String password;
        Scanner s = new Scanner(System.in);
        String choice;
        Account a = new Account("","");
        GregorianCalendar Date = new GregorianCalendar();
        do{ 
        System.out.println("********************************************************");
        System.out.println("welcome to My Career APP");
        System.out.println("To Create an an Account enter 1");
        System.out.println("To Login enter 2");
        System.out.println("to create a message enter 3");
        
        
        
        choice = s.next();
        
        switch (choice) {
            case "1": // create account
            System.out.println("please enter your username");

            a.setLogin(s.next());
                System.out.println("Please enter your password");

                 a.Change_Pass(s.next());
                System.out.println(a);
                System.out.println("Account successfully created");
                break;

            case "2": // login
                System.out.println("Enter your username");
                username = s.next();
                System.out.println("Enter you password");
                password = s.next();
                System.out.println(a.authenticate(password, username)); 
                System.out.println("enter your information");
                System.out.println("name ?");
                String name = s.next();
                System.out.println("age ?");
                int age = s.nextInt();
                System.out.println("Address ?");
                String Address = s.next();
                System.out.println("Email ?");
                String Email = s.next();
                System.out.println("phone ?");
                String Phone = s.next();
                Profile p = new Profile(name,age,Address,Email,Phone);
                System.out.println(p);

            break;
            case "3":
            System.out.println("Enter the message that you want to create");
            String message = s.next();
            Message user = new Message(message,Date);
            System.out.println(user);

           
            
            default:
                break;
        }
       } while (!choice.equals("0"));
    }

   
}
