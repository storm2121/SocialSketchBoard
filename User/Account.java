package User;

public class Account {
    private String login;
    private String password;
    // constructor Account
    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPass() {
        return password;
    }
    //Method change password
    public void Change_Pass(String password) {
        this.password = password;
    }
    // method Authenticate
    public boolean authenticate(String newPassword,String newLogin)
    {
        if((password == newPassword)&& (login == newLogin))
        {
            return true;
        }
        else 
        return false;
        
    }
    @Override
    public String toString() {
        return "Account [login=" + login + ", password=" + password + "]";
    }


}
