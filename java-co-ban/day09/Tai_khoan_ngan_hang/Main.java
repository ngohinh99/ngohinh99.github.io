import java.util.Scanner;

public class Main {
    static void display(){
        System.out.printf("%-30s %-30s %-30s %-30s\n","name","accountNumber","email","accountBalance");

    }
    public static void main(String[] args) {
        Account[] accounts = new Account[5];
        accounts[0] = new Account("Nguyen Van A", "19001001", "nguyenvana@gmail.com", 1000);
        accounts[1] = new Account("Nguyen Van B", "19001002", "nguyenvanb@gmail.com", 999);
        accounts[2] = new Account("Nguyen Van C", "19001003", "nguyenvanc@gmail.com", 900);
        accounts[3] = new Account("Nguyen Van D", "19001004", "nguyenvand@gmail.com", 2370);
        accounts[4] = new Account("Nguyen Van E", "19001005", "nguyenvane@gmail.com", 997);

        display();
        //print mang
        for(Account account: accounts){
            account.displayInfo();
        }
        
        Scanner scanner = new Scanner(System.in);

        System.out.printf("nhap accountNumber muon change: ");
        String accountNumber = scanner.nextLine();
        
        for(Account account: accounts){
            if (accountNumber.equals(account.getAccountNumber())) {

                System.out.printf("nhap email can thay the: ");
                String email = scanner.nextLine();
                account.changeEmail(email);

                System.out.printf("so tien can nap them: ");
                double amount = scanner.nextDouble();
                account.recharge(amount);

                display();
                account.displayInfo();
                break;
            }
        }
        scanner.close();
    }
}
