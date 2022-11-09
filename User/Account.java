package User;

public class Account {
    private String login;
    private String password;
    
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
    public String getPassword() {
        return password;
    }
    public void Change_Pass(String password) {
        this.password = password;
    }
    public boolean authenticate(String newPassword,String newLogin)
    {
        if((password.equals(newPassword)) && (login.equals(newLogin)))
        {
            return true;
        }
        return false;
    }

}
