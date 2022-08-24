import java.util.Scanner;

public class Login {
    private static Scanner scanner = new Scanner(System.in);
    private static User user= new User();

    public static void login(){
        Boolean islogin = false;


        while (true) {
            boolean isUsername = false;
            //nhap username
            while (true) {//kiem tra username co trong users khong
                if(isUsername == false){
                    System.out.print("nhap username: ");
                    String username = scanner.nextLine();
                    for(User us : Main.users){
                        if(Main.checkUsernameInUsers(username)){
                            isUsername = true;
                            user = us;
                        }
                    }

                } else {//nhap lai username
                    System.out.println("kiem tra lai username");
                    
                }

                if(isUsername==true){//chuyen sang nhap pass
                    break;
                }
            }

            //nhap pass
            
            System.out.print("nhap password: ");
            String password = scanner.nextLine();
                
            if(user.checkPassword(password)){
                islogin = true;
            } else{
                System.out.println("ban nhap pass sai");
                System.out.println("1- dang nhap lai");
                System.out.println("2- quen mat khau");
                System.out.println("hay nhap vao day");
                int key = Integer.parseInt(scanner.nextLine());
                if (key==1) {//quay tro lai luc dau
                }else if(key == 2){//hien thi mat khau
                    forgetPassword();
                }
            }
            
            if (islogin == true) {
                System.out.println("dang nhap thanh cong");
                break;
            }
        }

    }
    public static void updateInfo(){
            while (true) {
                
                menu();
                System.out.print("moi ban chon: ");
                int key = Integer.parseInt(scanner.nextLine());
                switch (key) {
                    case 1:// thay doi username
                        changeUsername();
                        break;
                    case 2://thay doi email
                        changeEmail();
                        break;
                    case 3://thay doi mat khau
                        changePassword();
                        break;
                    case 4://dang suat
                    Main.loginAndRegister();
                        break;
                    case 0:
                    Main.isQuit = true;
                        break;
                
                    default:
                        break;
                }
                if (Main.isQuit==true) {
                    break;
                }
            }


        
    }

    private static void changePassword() {
        boolean isChange = false;

        while (true) {
            System.out.print("moi ban nhap pass muon thay doi: ");
            String password = scanner.nextLine();

            if(Main.Password(password)){//kiem tra co dung cau truc email
                for(User us: Main.users){
                    if (us.getUsername().equals(user.getUsername())) {
                        us.setPassword(password);
                        isChange = true;
                    }
                }
            }else {
                System.out.println("chua dung cau truc pass moi nhap lai");
            }


            if(isChange == true){
                System.out.println("thay doi thanh cong");
                break;
            }

        }
    }

    private static void changeEmail() {
        boolean isChange = false;
        while (true) {
            System.out.print("moi ban nhap email muon thay doi: ");
            String email = scanner.nextLine();

            if(Main.Email(email)){//kiem tra co dung cau truc email
                if (Main.checkEmailInUsers(email)) {//kiem tra email da ton tai hay chu
                    System.out.println("email da ton tai moi nhap lai");
                }else {
                    for(User us: Main.users){
                        if (us.getUsername().equals(user.getUsername())) {
                            us.setEmail(email);
                            isChange = true;
                        }
                    }
                }
            }else {
                System.out.println("chua dung cau truc email moi nhap lai");
            }
            if(isChange == true){
                System.out.println("thay doi thanh cong");
                break;
            }

        }
    }

    private static void changeUsername() {
        boolean isChange = false;

        while (true) {
            System.out.print("moi ban nhap username muon thay doi: ");
            String username = scanner.nextLine();
            if(Main.checkUsernameInUsers(username)){//kiem tra username da ton tai hay chua
                System.out.println("username da ton tai xin nhap lai!!");
            } else{
                for(User us: Main.users){
                    if (us.getUsername().equals(user.getUsername())) {
                        us.setUsername(username);
                        isChange = true;
                    }
                }
            }

            if(isChange == true){//thay doi thanh cong 
                System.out.println("thay doi thanh cong");
                break;
            }
        }

        
    }

    private static void menu() {
        System.out.println("1 - thay doi username");
        System.out.println("2 - thay doi email");
        System.out.println("3 - thay doi mat khau");
        System.out.println("4 - dang xuat ");
        System.out.println("0 - thoat ");
    }

    // private boolean findUserinUsers(User user){
    //     boolean isUser = false;
    //     for(User us: Main.users){
    //         if(us.getUsername().equals(user.getUsername())){
    //             isUser = true;
    //         }
    //     }
    //     return isUser;
    // }
    private static void forgetPassword(){
        boolean isForget = true;
        while (true) {
            System.out.print("hay nhap email da dang ky: ");
            String email = Main.scanner.nextLine();
            for(User us : Main.users){
                if(us.checkEmail(email)){//kiem tra email co trong users khong
                    System.out.println("nhap mat khau moi: ");
                    String password = Main.scanner.nextLine();
                    if (Main.Password(password)) {//kiem tra co dung cau truc khong
                        us.setPassword(password);
                        isForget = false;
                    }
                }
            }
            if (isForget== false) {
                System.out.println("thay doi thanh cong");
                break;
            }

        }

    }
}
