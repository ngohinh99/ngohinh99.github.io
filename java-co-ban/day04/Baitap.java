import java.util.Scanner;
public class Baitap {
    static int bai1(int intNumber) {
        int S=0;
        // Scanner scanner= new Scanner(System.in);
        // while(true){
        //     System.out.println("nhap so nguyen duong");
        //     long intNumber= scanner.nextLong();
        //     if(intNumber > 0){
        //         System.out.println(intNumber+ " la so duong");
                for(int i= intNumber; i > 0; i--){
                    S = S + i;
                }
                return S;
        //         System.out.printf("tong tu 1 ->%s: %s",intNumber, S );
        //         break;
        //     }
        // }
        //scanner.close();
    }
    static void bai2(){
        int primeCount = 0;
        int primeTotal = 0;
        int num = 2;
        while(primeCount <= 100){
            if (num ==2){
                primeCount++;
                primeTotal = primeTotal + num;
                System.out.print(num+ " + ");
                num++;
                continue;
            }
            boolean isPrime = true;
            for(int i = 2; i <= num / 2; i++){
                int temp = num % i;
                if(temp == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                primeCount ++;
                primeTotal= primeTotal + num;
                System.out.print(num + " + ");
            }
            num++;
        }
        System.out.print("= "+ primeTotal);
    }
    static void bai3(){
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
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap so nguyen dung");
        int nguyenduong= scanner.nextInt();
        bai1(nguyenduong);
        bai2();
        bai3();
    }
}
