import java.util.Scanner;

/**
 * Main
 */
public class Main {
    static void ngatCau(){
        System.out.println("---------------------------------------");
    }
    //mang tang dan theo name
    static void tangdan(User[] userlist){
        User temp;
        for(int i= 0; i < userlist.length -1;i++){
            for(int j= i +1; j < userlist.length; j++){
                if(userlist[i].getLastName().compareTo(userlist[j].getLastName()) > 0){
                    temp= userlist[i];
                    userlist[i]= userlist[j];
                    userlist[j]= temp;
                }
            }
        }
    }
    //mang giam dan theo tuoi
    static void giamdan(User[] userlist){
        User temp;
        for(int i= 0; i < userlist.length -1;i++){
            for(int j= i +1; j < userlist.length; j++){
                if(userlist[i].year() < userlist[j].year()){
                    temp= userlist[i];
                    userlist[i]= userlist[j];
                    userlist[j]= temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        //tao mang User
        User[] userlist = new User[8];
        userlist[0]= new Student("001", "Nguyen Duong", Gender.BOY, "24/10/1991", "NguyenVanA@gmail.com", "19000001", true, "background");
        userlist[1]= new Student("002", "Vu Thu Thuy", Gender.GIRL, "05/05/1993", "NguyenVanB@gmail.com", "19000002", true, "background");
        userlist[2]= new Teacher("003", "Hoang Thi Hong", Gender.GIRL, "12/03/1995", "NguyenVanC@gmail.com", "19000003", 1, "java");
        userlist[3]= new Teacher("004", "Dinh Manh Quan", Gender.BOY, "03/04/1996", "NguyenVanD@gmail.com", "19000004", 2, "html");
        userlist[4]= new Teacher("005", "Trinh Duc Binh", Gender.BOY, "06/03/1992", "NguyenVanE@gmail.com", "19000005", 3, "java");
        userlist[5]= new Teacher("006", "Ho Ngoc Ha", Gender.GIRL, "03/01/1989", "NguyenVanF@gmail.com", "19000006", 2, "html");
        userlist[6]= new Teacher("007", "Hoang Minh Hieu", Gender.BOY, "23/09/1990", "NguyenVanG@gmail.com", "19000007", 2, "java");
        userlist[7]= new Teacher("008", "Do Thu Huong", Gender.GIRL, "03/06/1989", "NguyenVanH@gmail.com", "19000008", 1, "java");
        //in ra thong tin mang User
        for(User user: userlist){
            user.printInfo();
        }
        ngatCau();
        //tim kiem theo keyword
        Scanner scanner= new Scanner(System.in);
        System.out.print("nhap tu khoa de tim kiem: ");
        String keyword= scanner.nextLine();
        for(User user: userlist){
            if (user.hasKeywordName(keyword)) {
                System.out.println("tim trong name ta duoc");
                user.printInfo();
            }
            if (user.hasKeywordEmail(keyword)) {
                System.out.println("tim trong email ta duoc");
                user.printInfo();
            }
            if (user.hasKeywordPhoneNumber(keyword)) {
                System.out.println("tim trong phoneNumber ta duoc");
                user.printInfo();
            }
        }
        ngatCau();
        //sap xep mang tang dan theo ten
        tangdan(userlist);
        System.out.println("mang sap xep tang dan the name");
        for(User user: userlist){
            user.printInfo();
        }
        ngatCau();
        //sap xep mang giam dan theo tuoi
        giamdan(userlist);
        System.out.println("mang sap xep giam dan the tuoi");
        for(User user: userlist){
            user.printInfo();
        }
        scanner.close();
    }
}