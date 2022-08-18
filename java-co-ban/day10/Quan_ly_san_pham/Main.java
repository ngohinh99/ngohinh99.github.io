import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> products = new ArrayList<>();
    public static void main(String[] args) {
        
        products.add(new Product("001", "con ca", "thuc pham", 4, 20000, "can"));
        products.add(new Product("002", "sua ong tho", "thuc pham", 10, 10000, "cai"));
        products.add(new Product("003", "bap cai", "thuc pham", 9, 12000, "can"));
        products.add(new Product("004", "but", "but", 20, 5000, "cai"));
        products.add(new Product("005", "gao", "thuc pham", 30, 24000, "can"));
        products.add(new Product("006", "nuoc man", "thuc pham", 4, 18000, "cai"));

        boolean isQuit = true;
        while (isQuit) {
            menu();
            System.out.print("ban hay nhap vao day: ");
            int key = scanner.nextInt();
            scanner.nextLine();//troi lenh
            switch (key) {
                case 1://print danh sach san pham
                    printInfo();
                    break;
                case 2://tim san pham theo ten
                    checkName();
                    break;
                case 3://xoa san pham theo id
                    removeId();
                    break;
                case 4://cap nhap so luong san pham theo id
                    updateId();
                    break;
                case 5://tim san pham co so luong duoi 5
                    findAmount();
                    break;
                case 6://tim san pham theo muc gia
                    findMoney();
                    break;
                case 7:
                    scanner.close();
                    isQuit = false;
                    break;
            
                default:
                    break;
            }
        }
    }
    private static void findMoney() {
        System.out.println("nhap mot khoang muc gia ban can tim(0....vo cung): ");
        System.out.printf("nhap gia bat dau: ");
        double startMoney = scanner.nextDouble();
        System.out.printf("nhap gia ket thuc: ");
        double endMoney = scanner.nextDouble();
        for(Product product: products){
            if(product.getMoney() > startMoney && product.getMoney() < endMoney){
                product.printInfo();
            } 
        }
    }
    private static void findAmount() {
        System.out.print("nhap so luong san pham lon nhat can tim: ");
        int amount = Integer.parseInt(scanner.nextLine());
        for(Product product: products){
            if(product.getAmount() <= amount){
                product.printInfo();
            }
        }
    }
    private static void updateId() {
        System.out.print("ban hay nhap id san pham can cap nhap: ");
        String id = scanner.nextLine();
        for(Product product: products){
            if(product.checkID(id)){
                System.out.print("nhap so luong san phan can them: ");
                int amount = Integer.parseInt(scanner.nextLine());//troi lenh
                product.updateAmount(amount);
                product.printInfo();
                break;
            }
        }
    }
    private static void removeId() {
        System.out.print("hay nhap id ban muon xoa: ");
        String id = scanner.nextLine();
        int temp = 0;
        for(Product product: products){
            temp++;
            if(product.checkID(id)){
                products.remove(temp - 1);
                break;
            }
        }
    }
    private static void checkName() {
        System.out.print("nhap ten sang pham ban muon tim: ");
        String name = scanner.nextLine();
        for(Product product:products){
            if(product.checkName(name)){
                product.printInfo();
                break;
            }
        }
    }
    private static void printInfo() {
        System.out.printf("%-5s %-20s %-20s %-20s %-20s %-5s\n","id", "ten", "mo ta", "so luong", "gia ban", "don vi");

        for(Product product: products){
            product.printInfo();
        }
    }
    private static void menu() {
        System.out.println("menu: ");
        System.out.println("[1] Danh sach san pham");
        System.out.println("[2] Tim san pham theo ten");
        System.out.println("[3] xoa san pham theo id");
        System.out.println("[4] cap nhap so luong san pham theo id");
        System.out.println("[5] cac san pham cos so luong duoi 5");
        System.out.println("[6] tim san pham theo muc gia");
        System.out.println("[7] thoat");
    }
}