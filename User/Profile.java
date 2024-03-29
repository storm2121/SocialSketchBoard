package User;

public class Profile {
    public String Name;
    public int Age;
    public String Address;
    public String Email;
    public String Phone;

    public Profile(String name, int age, String address, String email, String phone) // constructor
    {
        this.Name = name;
        this.Age = age;
        this.Address = address;
        this.Email = email;
        this.Phone = phone;
    }

   

    public void updateProfile(String name, int age, String address, String email, String phone) // method
    {
        this.Name = name;
        this.Age = age;
        this.Address = address;
        this.Email = email;
        this.Phone = phone;
    }



    @Override
    public String toString() {
        return "Profile [Name=" + Name + ", Age=" + Age + ", Address=" + Address + ", Email=" + Email + ", Phone="
                + Phone + "]";
    }
   
}
