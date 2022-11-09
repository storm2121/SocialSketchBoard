package User;

public class Profile {
    public String name;
    public int Age;
    public String Address;
    public String Email;
    public String Phone;

  

   
    public Profile(String name, int age, String address, String email, String phone) 
    {
        this.name = name;
        this.Age = age;
        this.Address = address;
        this.Email = email;
        this.Phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }
    public void updateProfile(String name, int age, String address, String email, String phone) 
    {
        this.name = name;
        this.Age = age;
        this.Address = address;
        this.Email = email;
        this.Phone = phone;
    }
    @Override
    public String toString() {
        return "Profile [name=" + name + ", Age=" + Age + ", Address=" + Address + ", Email=" + Email + ", Phone="
                + Phone + "]";
    }

}
