import java.util.Scanner;

public class Songaytrongthnag {
    public static void main(String[] args) {
        int thang;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap mot thang bat ky ");
        thang= sc.nextInt();
        sc.close();
        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12: {
                System.out.println("co 31 ngay");
                break;
            }
            case 2:{
                System.out.println("co 28 ngay");
                break;
            }
            case 4, 6, 9, 11: {
                System.out.println("co 30 ngay");
                break;
            }
            default: System.out.println("nhap dung so thang");
                break;
        }
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                System.out.println("31");
                break;
            }
            case 2: {
                System.out.println("28");
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                System.out.println("30");
                break;
            }
            default: System.out.println("nhap dung so thang");
            break;
        }
    }
}
