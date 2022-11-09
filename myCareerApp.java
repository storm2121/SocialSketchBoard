import User.*;
import Messages.*;
import Notifications.*;
import Posts.*;
import java.util.*;
public class myCareerApp {
    public static void main(String[] args)
    {
        String username;
        String password;
        Scanner s = new Scanner(System.in);
        String choice=null;
        do{ 
        System.out.println("********************************************************");
        System.out.println("welcome to My Career APP");
        System.out.println("To Create an an Account enter 1");
        System.out.println("To Login enter 2");
        
        
       
        choice = s.nextLine();

        switch (choice) {
            case "1": // create account
                System.out.println("please enter your username");
                username = s.nextLine();
                System.out.println("Please enter your password");
                 password = s.nextLine();
                Account a = new Account(username,password);
                System.out.println("Account successfully created");
                break;
            case "2": // login
                System.out.println("Enter your username");
                username = s.nextLine();
                System.out.println("Enter you password");
                password = s.nextLine();
                Account b = new Account(username, password);
              System.out.println(b.authenticate(password, username)); 
            break;
            default:
                break;
        }
       } while (choice!="3");
    }
   
}
