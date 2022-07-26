import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int positiveNumber = 0;
        int digitSum = 0;
        while(true){
            System.out.println("nhap so nguyen duong");
            positiveNumber = sc.nextInt();
            if(positiveNumber > 0 ){
                break;
            }
        }
        sc.close();

        while(true){
            int lastDigit = positiveNumber % 10;
            positiveNumber = positiveNumber /10;
            digitSum = digitSum + lastDigit;
            if(positiveNumber == 0){
                break;
            }
        }
        System.out.println("tong cac chu so do " + digitSum);
    }
}
