import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Main
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static boolean isQuit = false;
    public static boolean Password(String password){
        String PASSWPRD = "^(?=.*[A-Z])(?=.*[@#$%^&+=]).{7,15}$";
        boolean result = Pattern.matches(PASSWPRD, password);
        return result;
    }
    public static boolean Email(String email){
        String EMAIL = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        boolean result = Pattern.matches(EMAIL, email);
        return result;
    }
    static List<User> users = new ArrayList<>(Arrays.asList(
        new User("nguyenvana", "1234567890", "nguyenvana@gmail.com"),
        new User("nguyenvanb", "1234567890", "nguyenvanb@gmail.com"),
        new User("nguyenvanc", "1234567890", "nguyenvanc@gmail.com"),
        new User("nguyenvand", "1234567890", "nguyenvand@gmail.com")
        ));
    public static boolean checkUsernameInUsers(String  username){
        boolean isUsername = false;
        for(User user: Main.users){
            if(user.checkName(username)){
                isUsername = true;
            }
        }
        return isUsername;
    }
    public static boolean checkEmailInUsers(String  email){
        boolean isEmail = false;
        for(User user: Main.users){
            if(user.checkEmail(email)){
                isEmail = true;
            }
        }
        return isEmail;
    }
    public static void loginAndRegister(){
        while (true) {
            menu();
            System.out.printf("hay chon nao: ");
            int key = Integer.parseInt(scanner.nextLine());
            switch (key) {
                case 1://login
                Login.login();
                Login.updateInfo();
                    break;
                case 2://register
                Register.register();
                    break;
                
                default:
                    break;
            }
            if(isQuit == true){
                break;
            }
        }
    }

    private static void menu() {
        System.out.println("1 - dang nhap");
        System.out.println("2 - dang ky");
    }
    
    public static void main(String[] args) {

        loginAndRegister();
    }

}