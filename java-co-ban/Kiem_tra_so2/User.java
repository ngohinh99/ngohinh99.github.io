
public class User {
    private String username;
    private String password;
    private String email;


    public User(String username, String password, String email) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printInfo(){
        System.out.printf("%-10s %10s %10s", this.username, this.password, this.email);
    }

    public String getUsername() {
        return username;
    }



    public boolean checkName(String username){
        boolean result = this.username.equals(username);
        return result;
    }
    public boolean checkPassword(String password){
        boolean result = this.password.equals(password);
        return result;
    }
    public boolean checkEmail(String email){
        boolean result = this.email.equals(email);
        return result;
    }
}
