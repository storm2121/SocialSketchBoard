/* Dear professor in this program i assume  that there is only 1 user 
we have 4 packages called User,Notifications,Post,Messages
This program is only intended for 1 user only not a company 
we are assuming that the user will create an account then login
we are using a menu that have login create an account then fill his educational info 
for the enumerated type we added a class for enumerated type that has just status information
we didn't do the implementation for the class company
*/
import User.*;                  // importing classes
import User.Profile;
import User.EMPLOYEMENT;
import Messages.*;
import Notifications.*;
import Posts.*;
import java.util.*;
import java.util.GregorianCalendar;


public class myCareerApp {

    public static void main(String[] args)
    {  
        Scanner s = new Scanner(System.in);         // declared attributes
        String username;
        String password;
        String name = "";
        String latestDegree = "";       // this is a workaround for initializing 
        String Discipline = "";
        int    grad_year = 0;
        int age = 0;
        EMPLOYEMENT status = EMPLOYEMENT.EMPLOYED; // WORKAROUND FOR USING IT BEFORE INITIALIZING
        String Address = "";
        String Email = "";
        String Phone = "";
        String choice;
        Account a = new Account("","");
        GregorianCalendar Date = new GregorianCalendar();       // our menu
        do{ 
        System.out.println("********************************************************");
        System.out.println("welcome to My Career APP");
        System.out.println("To Create an an Account enter 1");
        System.out.println("To Login enter 2");
        System.out.println("To exit this menu enter 3 ");
        choice = s.next();

            switch (choice) {
                case "1" -> { // create account
                    System.out.println("please enter your username");
                    a.setLogin(s.next());
                    System.out.println("Please enter your password");
                    a.Change_Pass(s.next());
                    System.out.println(a);
                    System.out.println("Account successfully created");
                }
                case "2" -> { // login

                    System.out.println("Enter your username");
                    username = s.next();
                    System.out.println("Enter you password");
                    password = s.next();
                    System.out.println(a.authenticate(password, username));
                    if (!a.authenticate(password, username)) {
                        System.out.println("WRONG LOGIN DETAILS... TRY AGAIN.");

                    } else {                                // create profile 
                        if (name.equals("")) {
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
                            System.out.println("LATEST DEGREE ?");
                            latestDegree = s.next();

                            System.out.println("DISCIPLINE ?");
                            Discipline = s.next();
                            System.out.println("GRAD YEAR ?");
                            grad_year = s.nextInt();

                            System.out.println("Employment status ? Enter the assigned numeral:   ");
                            EMPLOYEMENT[] values = EMPLOYEMENT.values();
                            int counter1 = 1;
                            for (EMPLOYEMENT employment : values) {
                                System.out.println("\t " + counter1+"- " + employment.name());
                                        counter1++;
                            }
                            
                            String employChoose = s.next();
                            switch (employChoose) {
                                case "1" -> status = EMPLOYEMENT.valueOf("EMPLOYED");
                                case "2" -> status = EMPLOYEMENT.valueOf("UNEMPLOYED");
                                case "3" -> status = EMPLOYEMENT.valueOf("COMPANYOWNER");
                                case "4" -> status = EMPLOYEMENT.valueOf("LOOKINGFOROFFERS");
                                default -> System.out.println("value not found ");
                            }
                        }
                        Profile p = new Profile(name, age, Address, Email, Phone);  // create profile object 
                        Educational_info e = new Educational_info(latestDegree, Discipline, grad_year); // create an educational info object

                        if (!name.equals("")) {             // this is if the user has an account already
                            System.out.println("welcome back");
                            System.out.println("the following is your profile information: ");
                            System.out.println(p + "" + e + "Status: " + status.name());
                            System.out.println("do you wish to update your profile ? y/n : ");
                            String Choose = s.next();
                           Choose = Choose.toLowerCase();
                            switch (Choose) {
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
                                    System.out.println("LATEST DEGREE ?");
                                    latestDegree = s.next();
        
                                    System.out.println("DISCIPLINE ?");
                                    Discipline = s.next();
                                    System.out.println("GRAD YEAR ?");
                                    grad_year = s.nextInt();
                                    System.out.println("do you wish to update your employment status ? y/n \t");
                                    String employEdit = s.next();
                                    employEdit = employEdit.toLowerCase();

                                    switch (employEdit) {       // this is to change the employ status 
                                        case "y" -> {
                                            System.out.println("Employment status ? Enter the assigned numeral:   ");
                                            EMPLOYEMENT[] values = EMPLOYEMENT.values();
                                            int counter1 = 1;
                                            for (EMPLOYEMENT employment : values) {
                                                System.out.println("\t " + counter1 + "- " + employment.name());
                                                counter1++;
                                            }
                                            String employChoose = s.next();
                                            switch (employChoose) {
                                                case "1" -> status = EMPLOYEMENT.valueOf("EMPLOYED");
                                                case "2" -> status = EMPLOYEMENT.valueOf("UNEMPLOYED");
                                                case "3" -> status = EMPLOYEMENT.valueOf("COMPANYOWNER");
                                                case "4" -> status = EMPLOYEMENT.valueOf("LOOKINGFOROFFERS");
                                                default -> System.out.println("value not found ");
                                            }
                                        }
                                        case "n" ->
                                                System.out.println("you chose not to update your employment status");
                                    }
                                    
                                   


                                    break;
                                case "n":
                                    break;
                            }
                            System.out.println("Do you wish to update your password ?  y/n");       // update the password
                            Choose = s.next();

                            Choose = Choose.toLowerCase();
                            switch(Choose){
                                case "y":
                                int maxTries = 3;
                                System.out.println("Please enter your old password:");
                                String oldPassword = s.next();
                                String newPass;
                                while(maxTries > 0){

                                
                                if(a.authenticate(oldPassword)){
                                        System.out.println("please enter your new password");
                                        newPass = s.next();
                                        a.Change_Pass(newPass);
                                        System.out.println("PASSWORD CHANGED SUCCESSFULLY");
                                        break;
                                }  
                                else{
                                    System.out.println("WRONG OLD PASSWORD");
                                    System.out.println("you have " + maxTries + " Tries left, please try again. Enter your old password again: \t");

                                    maxTries--;
                                    oldPassword = s.next();

                                    if(maxTries == 0){          // if the user has tried 3 times then he will get out of the menu
                                        System.out.println("YOU HAVE CONSUMED ALL YOUR PASSWORD CHANGE TRIES, TRY AGAIN LATER");
                                    }
                                }       
                            }            
                                 break;
                                case "n":
                                break;
                                default:
                                System.out.println("TRY AGAIN");
                                break;
                            }
                                
                            System.out.println("y/n send message ?");       // the user chosses if he want to send a message 
                            String Choose1 = s.next();
                          Choose1 =  Choose1.toLowerCase();
                            switch (Choose1) {
                                case "y":

                                    System.out.println("Enter the message that you want to create");
                                    String message = s.next();
                                    Message user = new Message(message, Date);
                                    System.out.println(user);       // call to string method
                                case "n":
                                    System.out.println("Press Enter key to go back to the menu...."); /// to go back to the menu
                                    try {
                                        System.in.read();
                                        s.nextLine();
                                    } catch (Exception f) {
                                    }
                                    break;

                            }

                        }
                    }
                }
        
                default -> {
                }
            }
       } while (!choice.equals("3"));
       System.out.println("EXITING");
    }

   
}
