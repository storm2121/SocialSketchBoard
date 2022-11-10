package User;

public class Company {
    public String Name;
    public String Description;
    public String Activity;
    
    public Company(String name, String Description, String Activity){
        this.Name = name;
        this.Description = Description;
        this.Activity = Activity;
    }

    @Override
    public String toString() {
        return "Company [Name=" + Name + ", Description=" + Description + ", Activity=" + Activity + "]";
    }
   
}
