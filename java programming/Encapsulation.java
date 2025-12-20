public class Encapsulation {
    public static void main(String[]args){
        Account account = new Account();
        account.setUsername("john_doe");
        System.out.println("Username: " + account.getUsername());
        
        account.setPassword("securepassword123");
        System.out.println("Password: " + account.getPassword());
    }
}
class Account{
    private String username;
    private String password;

public Account(){
    System.out.println("Default constructor called");
}
public void setUsername(String username) {
    this.username = username;
    System.out.println("username must not be empty " + username);
}
public String getUsername() {
    return username;
}
public void setPassword(String password) {
    this.password = password;
    System.out.println("password must be at least 8 characters " + password);
}
public String getPassword() {
    return password;
}
}