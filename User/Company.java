package User;

public class Company {
    public String name;
    public String Description;
    public String Activity;
    
    public Company(String name, String Description, String Activity){
        this.name = name;
        this.Description = Description;
        this.Activity = Activity;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        this.Description = description;
    }
    public String getActivity() {
        return Activity;
    }
    public void setActivity(String activity) {
        this.Activity = activity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
