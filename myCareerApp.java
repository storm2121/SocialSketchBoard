/* This program is only intended for 1 user only 
 * 
*/
import User.*;
import Messages.*;
import Notifications.*;
import Posts.*;
import java.util.*;
import java.util.GregorianCalendar;
public class myCareerApp {

    public static void main(String[] args)
    {  
        Scanner s = new Scanner(System.in);
        String username;
        String password;
        String name = "";
        int age = 0;
        String Address = "";
        String Email = "";
        String Phone = "";
        String choice;
        Account a = new Account("","");
        GregorianCalendar Date = new GregorianCalendar();
        do{ 
        System.out.println("********************************************************");
        System.out.println("welcome to My Career APP");
        System.out.println("To Create an an Account enter 1");
        System.out.println("To Login enter 2");
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
               if(a.authenticate(password, username) == false){
                System.out.println("WRONG LOGIN DETAILS... TRY AGAIN.");
                
               }
               else{
                if(name.equals("") == true) {
                    System.out.println("enter your information");
                    System.out.println("name ?");
                    name = s.next();
                    System.out.println("age ?");
                    age = s.nextInt();
                    System.out.println("Address ?");
                    Address = s.next();
                    System.out.println("Email ?");
                    Email = s.next();
                    System.out.println("phone ?");
                    Phone = s.next();
                   


                }
                Profile p = new Profile(name,age,Address,Email,Phone);

                if(name.equals("") == false){
                    System.out.println("welcome back");
                    System.out.println("the following is your profile information: ");
                    System.out.println(p);
                    System.out.println("do you wish to update your profile ? y/n : ");
                    String Choose = s.next();
                    Choose.toLowerCase();
                    switch(Choose){
                      case "y": 
                        System.out.println("enter your information");
                        System.out.println("name ?");
                        name = s.next();
                        System.out.println("age ?");
                        age = s.nextInt();
                        System.out.println("Address ?");
                        Address = s.next();
                        System.out.println("Email ?");
                        Email = s.next();
                        System.out.println("phone ?");
                        Phone = s.next();



                        break;
                      case "n": 
                        break;

                        
                    }
                    System.out.println("y/n send message ?");
                    String Choose1 = s.next();
                    Choose1.toLowerCase();
                    switch(Choose1){
                        case "y":
                        
                        System.out.println("Enter the message that you want to create");
                        String message = s.next();
                        Message user = new Message(message,Date);
                        System.out.println(user);
                        case "n":   
                        System.out.println("Press Enter key to go back to the menu....");
                        try
                        {
                            System.in.read();
                            s.nextLine();
                        }  
                        catch(Exception e)
                        {}  
                        break;

                    }
                    
                }
               }
                
                
                

            break;
        
           
            
           
            
            default:
                break;
        }
       } while (!choice.equals("0"));
    }

   
}
